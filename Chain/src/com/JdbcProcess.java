package com;

import java.sql.Connection;
import java.sql.SQLException;

public interface JdbcProcess {

	public void doSql(Connection conn)throws SQLException;
}
