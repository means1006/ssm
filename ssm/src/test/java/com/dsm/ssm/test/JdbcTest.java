package com.dsm.ssm.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JdbcTest {

	private Connection connection;

	@Before
	public void getConnection() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm?characterEncoding=utf8&useSSL=true&serverTimezone=GMT", "dsm", "dsm1995");

	}

	@After
	public void closeConnection() throws Exception {
		if (connection != null) {
			connection.close();
		}
	}

	@Test
	public void testCon() throws Exception {
		
		PreparedStatement ps = connection.prepareStatement("select * from dsm_user_info");
		ResultSet res = ps.executeQuery();
		while (res.next()) {
			System.out.println(res);
		}
	}

}
