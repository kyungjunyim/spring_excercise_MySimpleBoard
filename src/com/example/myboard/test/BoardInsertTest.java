package com.example.myboard.test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.myboard.mapper.BoardMapper;

class BoardInsertTest {
	private BoardMapper mapper = null;
	private SqlSession session = null;
	private SqlSessionFactory factory = null;
	private InputStream is = null;
	private String config = null;

	@BeforeEach
	void setUp() throws Exception {
		config = "com/example/myboard/config/config.xml";
		try {
			is = Resources.getResourceAsStream(config);
			factory = new SqlSessionFactoryBuilder().build(is);
			session = factory.openSession();
			mapper = session.getMapper(BoardMapper.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testAdd() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("title", "title1");
		map.put("contents", "contents1");
		try {
			mapper.addBoard(map);
			assertTrue(true);
		} catch(Exception e) {
			fail();
			e.printStackTrace();
		} 
	}
	
	@AfterEach
	void tearDown() {
		session.commit();
		session.close();
	}
}
