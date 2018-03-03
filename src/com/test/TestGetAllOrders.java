package com.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.dao.LoginUserDao;
import com.entity.LoginUser;
import com.utils.MybatisUtil;

class TestGetAllOrders {

	@Test
	void test() throws IOException {
Logger logger = Logger.getLogger(TestOrder.class);
		
		SqlSession session = MybatisUtil.getSession();
			
		LoginUser user = session.getMapper(LoginUserDao.class).getAllOrders(8);
		
		logger.debug(user);
	}

}
