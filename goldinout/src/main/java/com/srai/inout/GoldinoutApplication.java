package com.srai.inout;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.srai.inout.datamodels.SCMInInterface;
import com.srai.inout.repositories.SCMInMappingRepository;
import com.srai.inout.repositories.SCMInterfaceRepository;

@SpringBootApplication(
		  exclude = { DataSourceAutoConfiguration.class, 
		     HibernateJpaAutoConfiguration.class,
		     DataSourceTransactionManagerAutoConfiguration.class })
@EnableTransactionManagement
@ComponentScan({"com.srai.scm"})
public class GoldinoutApplication implements CommandLineRunner{

	@Autowired
	SCMInterfaceRepository interfaceRepository;
	
	@Autowired 
	SCMInMappingRepository mappingRepository;
	
	// @Autowired 	GOLDInterface goldService;
	
	public static void main(String[] args) {
		SpringApplication.run(GoldinoutApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Read file and initiate the database  
		File sampleFile = new ClassPathResource("sample-interface.txt").getFile();

		List<String> interfaces = Files.readAllLines(sampleFile.toPath());
		
		//List<String> interfaces = Files.readAllLines(filePath);
		System.out.println("File read:"+interfaces.stream().count());
		interfaces.stream()
				.forEach( infdata -> {
					String[] interfData = infdata.strip().split(";");
					SCMInInterface scmInteface = new SCMInInterface();
					if ( interfData.length < 6 ) {
						System.out.println("Not enough values to load for Inteface:"+interfData[0]);
						return;
					}
				
					scmInteface.setInGroup(interfData[0]);
					scmInteface.setInTable(interfData[1]);
					scmInteface.setInPrefix(interfData[2]);
					scmInteface.setInTableComment(interfData[3]);
					scmInteface.setInProc(interfData[4]);
					scmInteface.setInLaunch(interfData[5]);
					
					System.out.println("Loading <<"+interfData[0]);
					
					interfaceRepository.save(scmInteface);
				});
		
		System.out.println("Loaded interfaces:"+interfaceRepository.findAll().stream().count());
		
		// Create local file
		
		/*
		
		if ( mappingRepository.count() ==  0) {
			System.out.println("Loading from GOLD Database....");
			
			List<DBTable> listTables = goldService.getInterfaceTables();
			
			listTables.forEach( table -> {
				
				SCMInMapping eachInterface = new SCMInMapping();
				eachInterface.setIntTable(table.getsTable());
				eachInterface.setFieldName(table.getsColName());
				eachInterface.setFieldType(table.getsColType());
				eachInterface.setIsOptional(table.getsColMandatory()== "N");
				eachInterface.setFieldDescription(table.getsColComment());

				
				mappingRepository.save(eachInterface);
			});
			
			System.out.println("Loading done ........["+mappingRepository.count()+"]");
		}
		
		*/
		
	}
	
}
