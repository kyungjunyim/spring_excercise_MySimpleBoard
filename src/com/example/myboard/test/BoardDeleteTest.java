package com.example.myboard.test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.myboard.mapper.BoardMapper;

class BoardDeleteTest {
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
	void testRemoveBoard() {
		try {
			mapper.removeBoard(1);
			assertTrue(true);
		} catch (Exception e) {
			fail();
			e.printStackTrace();
		}
	}

	@Test
	void testRemoveAll() {
		try {
			mapper.removeAll();
			assertTrue(true);
		} catch (Exception e) {
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
