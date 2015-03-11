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
public class AopTest {

	private ApplicationContext ctx;

	@Before
	public void before() {
		this.ctx = new ClassPathXmlApplicationContext("spring-aopBean.xml");
	}
	

	@Test
	public void testAop() {
		Performer kenny = (Performer) ctx.getBean("instrumentalist");
		kenny.perform();
	}
	
	

}
