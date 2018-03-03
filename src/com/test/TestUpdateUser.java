package com.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.dao.LoginUserDao;
import com.entity.LoginUser;
import com.utils.MybatisUtil;

class TestUpdateUser {

	@Test
	void test() throws IOException {
		SqlSession session = MybatisUtil.getSession();
		
		LoginUser user = new LoginUser();
		user.setU_id(4L);
		user.setU_name("mmm");
		user.setU_password("123");
		user.setU_identity(0L);
		
		int num = session.getMapper(LoginUserDao.class).updateUser(user);
		
		Logger logger = Logger.getLogger(TestUpdateUser.class);
		logger.debug(num);
	}

}
