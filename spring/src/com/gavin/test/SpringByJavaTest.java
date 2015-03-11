package com.gavin.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.gavin.interfaces.Performer;

/**
 * 
 * @author wenguang.xu
 *
 */
public class SpringByJavaTest {

	private ApplicationContext ctx;

	@Before
	public void before() {
		this.ctx = new ClassPathXmlApplicationContext("springByJava.xml");
	}
	

	@Test
	public void testBean1() {
		Performer duke15 = (Performer) ctx.getBean("duke15");
		duke15.perform();
	}
	
	@Test
	public void testBean2() {
		Performer duke15 = (Performer) ctx.getBean("poeticDuke");
		duke15.perform();
	}
	
}
