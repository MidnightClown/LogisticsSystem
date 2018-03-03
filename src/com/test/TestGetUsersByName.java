package com.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.dao.LoginUserDao;
import com.entity.LoginUser;
import com.utils.MybatisUtil;

class TestGetUsersByName {

	@Test
	void test() throws IOException {
		Logger logger = Logger.getLogger(TestGetUsersByName.class);
		
		SqlSession session = MybatisUtil.getSession();
		
		LoginUser user = new LoginUser();
		user.setU_name("a");
		
		List<LoginUser> list = session.getMapper(LoginUserDao.class).getUsersByName(user);
		
		for(LoginUser u : list) {
			logger.debug(u);
		}
		
	}

}
