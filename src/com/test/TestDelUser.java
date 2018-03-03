package com.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.dao.LoginUserDao;
import com.entity.LoginUser;
import com.utils.MybatisUtil;

class TestDelUser {

	@Test
	void test() throws IOException {
		Logger logger = Logger.getLogger(TestDelUser.class);
		
		SqlSession session = MybatisUtil.getSession();
		
		LoginUser user = new LoginUser();
		user.setU_id(3L);
		
		int num = session.getMapper(LoginUserDao.class).delUser(user);
		logger.debug(num);
	}

}
