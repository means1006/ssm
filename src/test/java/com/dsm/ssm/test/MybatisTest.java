package com.dsm.ssm.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dsm.ssm.model.user.UserInfo;
import com.dsm.ssm.service.user.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-mybatis.xml" })
public class MybatisTest {

	private static final Logger LOG = Logger.getLogger(MybatisTest.class);

	@Autowired
	private UserService userService;

	@Test
	public void test() {
		LOG.info("test start");
		UserInfo user = null;
		try {
			user = userService.getUserById("1");
		} catch (Exception e) {
			LOG.error("test error", e);
		}

		LOG.info("test end result = " + user);
	}

}