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

class TestAddUser {

	@Test
	void test() throws IOException {
		Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sf.openSession(true);//自动提交事务参数里加上true
		
		LoginUser user = new LoginUser();
		user.setU_name("s2");
		user.setU_password("12345");
		user.setU_identity(1L);
		
		int num = session.getMapper(LoginUserDao.class).addUser(user);
		//手动提交事务
//		session.commit();
		System.out.println(num);
	}

}
