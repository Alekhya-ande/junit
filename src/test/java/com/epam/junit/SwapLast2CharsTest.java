package com.epam.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapLast2CharsTest {

	@Test
	void test1() {
		Apptest s=new Apptest();
		String actual=s.swap("ABCD");
		assertEquals("BCD",actual);
		
	}
	@Test
	void test2() {
		Apptest s=new Apptest();
		String actual=s.swap("AACD");
		assertEquals("CD",actual);
		
	}
	@Test
	void test3() {
		Apptest s=new Apptest();
		String actual=s.swap("BACD");
		assertEquals("BCD",actual);
		
	}
	@Test
	void test4() {
		Apptest s=new Apptest();
		String actual=s.swap("BBAA");
		assertEquals("BBAA",actual);
		
	}
	@Test
	void test5() {
		Apptest s=new Apptest();
		String actual=s.swap("AABAA");
		assertEquals("BAA",actual);
		
	}
}
