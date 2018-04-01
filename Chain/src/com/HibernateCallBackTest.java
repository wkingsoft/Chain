package com;

import java.sql.Connection;
import java.sql.SQLException;

public class HibernateCallBackTest {

	public void doExecute(JdbcProcess jdbcProcess) {
		System.out.println("׼������Դ");

		Connection conn = null;
		try {
			jdbcProcess.doSql(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("�ͷ�����Դ");

	}

	public void doQuery() {
		doExecute(new JdbcProcess() {

			@Override
			public void doSql(Connection conn) throws SQLException {
				//�õ�����Դ
				String sql = "select * from dual";
				System.out.println("ִ��SQL");
				System.out.println(sql);
			}
		});
	}
	
	public static void main(String[] args) {
		HibernateCallBackTest call = new HibernateCallBackTest();
		call.doQuery();
	}

}
