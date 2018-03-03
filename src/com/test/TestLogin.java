package com.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import com.dao.LoginUserDao;
import com.entity.LoginUser;

class TestLogin {

	@Test
	void test() throws IOException {
		Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sf.openSession();
//		System.out.println(session);
		LoginUser user = new LoginUser();
		user.setU_name("szy");
		user.setU_password("12345");
		
//		LoginUser loginUser = session.selectOne("com.dao.LoginUserDao.login",user);
//		System.out.println(loginUser);
		
		LoginUser loginUser = session.getMapper(LoginUserDao.class).login(user);
		System.out.println(loginUser);
	}

}
