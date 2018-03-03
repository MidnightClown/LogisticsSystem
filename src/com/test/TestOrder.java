package com.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.dao.OrdersDao;
import com.entity.Orders;
import com.utils.MybatisUtil;

class TestOrder {

	@Test
	void test() throws IOException {
		Logger logger = Logger.getLogger(TestOrder.class);
		
		SqlSession session = MybatisUtil.getSession();
		
		Orders order = session.getMapper(OrdersDao.class).getOrder(4);
		
		logger.debug(order);
	}

}
