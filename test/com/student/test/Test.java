package com.student.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {

	public static void main(String[] args) throws IOException {

		SqlSession session = null;

		InputStream input = Resources.getResourceAsStream("mybatis-config.xml");

		SqlSessionFactory sqlFctory = new SqlSessionFactoryBuilder().build(input);
		session = sqlFctory.openSession();
		int countNum = session.selectOne("com.test.dao.StudentMapper.count");
		System.out.println("返回的总条数是------>" + countNum);

	}
}
