package com;

import java.sql.Connection;
import java.sql.SQLException;

public class HibernateCallBackTest {

	public void doExecute(JdbcProcess jdbcProcess) {
		System.out.println("准备数据源");

		Connection conn = null;
		try {
			jdbcProcess.doSql(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("释放数据源");

	}

	public void doQuery() {
		doExecute(new JdbcProcess() {

			@Override
			public void doSql(Connection conn) throws SQLException {
				//得到数据源
				String sql = "select * from dual";
				System.out.println("执行SQL");
				System.out.println(sql);
			}
		});
	}
	
	public static void main(String[] args) {
		HibernateCallBackTest call = new HibernateCallBackTest();
		call.doQuery();
	}

}
