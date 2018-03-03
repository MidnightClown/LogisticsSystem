package com.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.dao.LoginUserDao;
import com.entity.LoginUser;
import com.utils.MybatisUtil;

class TestGetAllUsers {
	@Test
	void test() throws IOException {
		Logger logger = Logger.getLogger(TestGetAllUsers.class);
		
		SqlSession session = MybatisUtil.getSession();
		
		List<LoginUser> list = session.getMapper(LoginUserDao.class).getAllUsers();
		
		for(LoginUser user: list) {
			logger.debug(user);
		}
	}

}
