package com.srai.scm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class GOLDInterface {

	@Autowired
	@Qualifier("goldJdbcTemlate")
	private JdbcTemplate jdbcTemplate;
	
	public List<DBTable> getTableDetails(String sTableName) {
		
		final String sTableDetails = "";
		
		return jdbcTemplate.query(sTableDetails, new RowMapper<DBTable>() {
			@Override
			public DBTable mapRow(ResultSet rs, int rowNum) throws SQLException {
				DBTable tableRow = new DBTable();
				tableRow.setsTable(rs.getString("TABLE_NAME"));
				tableRow.setsTable(rs.getString("TABLE_NAME"));
				tableRow.setsTable(rs.getString("TABLE_NAME"));
				tableRow.setsTable(rs.getString("TABLE_NAME"));
				tableRow.setsTable(rs.getString("TABLE_NAME"));
				tableRow.setsTable(rs.getString("TABLE_NAME"));
			
				return tableRow;
			}
		});
		
	}
	
	public List<DBTable> getInterfaceTables() {
		
		final String sTableDetails = "SELECT s.table_name ,\r\n"
				+ "       NVL(ttt.tctcomment,'NA' ) tab_comment,\r\n"
				+ "       s.column_name ,\r\n"
				+ "       NVL(tcccomment,'NA') col_desc,\r\n"
				+ "       CASE WHEN s.data_type =  'NUMBER' THEN s.data_type || '('|| s.DATA_precision || ',' || s.data_scale ||')' \r\n"
				+ "            WHEN s.data_type LIKE  'VARCHAR%' THEN s.data_type || '('|| s.char_length ||')'  \r\n"
				+ "            ELSE s.data_type END  data_type ,\r\n"
				+ "       s.nullable nullable,\r\n"
				+ "       s.column_id AS col_seq \r\n"
				+ "              \r\n"
				+ "FROM user_Tab_Columns s,\r\n"
				+ "     tra_comcols tr  ,\r\n"
				+ "     tra_comtabs ttt   \r\n"
				+ "WHERE tr.LANGUE(+) = 'GB' \r\n"
				+ "AND ttt.tcttable(+) = s.table_name\r\n"
				+ "AND ttt.langue(+) = 'GB' \r\n"
				+ "AND tr.tcctable(+) = s.table_name\r\n"
				+ "AND tr.tcccolumn(+) = s.column_name\r\n"
				+ "AND (s.table_name LIKE 'IN%' OR \r\n"
				+ "s.table_name LIKE 'N3%' OR \r\n"
				+ "s.table_name LIKE 'VTE%' OR \r\n"
				+ "s.table_name LIKE 'ICS%')\r\n"
				+ "AND s.table_name NOT LIKE 'INDEX%'\r\n"
				+ "ORDER BY table_name, column_id";
		
		return jdbcTemplate.query(sTableDetails, new RowMapper<DBTable>() {
			@Override
			public DBTable mapRow(ResultSet rs, int rowNum) throws SQLException {
				DBTable tableRow = new DBTable();
				tableRow.setsTable(rs.getString("TABLE_NAME"));
				tableRow.setsComment(rs.getString("TAB_COMMENT"));
				tableRow.setsColName(rs.getString("COLUMN_NAME"));
				tableRow.setsColComment(rs.getString("COL_DEC"));
				tableRow.setsColType(rs.getString("DATA_TYPE"));
				tableRow.setsColMandatory(rs.getString("NULLABLE"));
			
				return tableRow;
			}
		});
		
	}
	
	
}
