package com.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	public static SqlSession getSession() throws IOException {
		Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sf.openSession(true);
		return session;
	}
}
