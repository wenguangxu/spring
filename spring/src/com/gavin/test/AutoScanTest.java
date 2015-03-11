package com.gavin.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gavin.autoScan.Instrumentalist;
import com.gavin.autoScan.Saxophone;

/**
 * 
 * @author wenguang.xu
 *
 */
public class AutoScanTest {

	private ApplicationContext ctx;

	@Before
	public void before() {
		this.ctx = new ClassPathXmlApplicationContext("spring-autoScanBean.xml");
	}
	

	@Test
	public void testAutoScanBean() {
		Instrumentalist kenny = (Instrumentalist) ctx.getBean("instrumentalist");
		kenny.perform();
	}
	
	@Test
	public void testAutoScanIncludeBean() {
		Saxophone sax = (Saxophone) ctx.getBean("saxophone");
		sax.play();
		Instrumentalist kenny = (Instrumentalist) ctx.getBean("instrumentalist");
		kenny.perform();
	}
	

}
