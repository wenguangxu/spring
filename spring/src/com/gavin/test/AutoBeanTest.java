package com.gavin.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.gavin.bean.Instrumentalist;
import com.gavin.bean.PoeticJuggler;

/**
 * 
 * @author wenguang.xu
 *
 */
public class AutoBeanTest {

	private ApplicationContext ctx;

	@Before
	public void before() {
		this.ctx = new ClassPathXmlApplicationContext("spring-autoBean.xml");
	}
	

	@Test
	public void testAutoByNameBean() {
		Instrumentalist kenny = (Instrumentalist) ctx.getBean("kenny");
		kenny.perform();
	}
	
	@Test
	public void testAutoByTypeBean() {
		Instrumentalist kenny = (Instrumentalist) ctx.getBean("kenny2");
		kenny.perform();
	}
	
	@Test
	public void testAutoByConstructorBean() {
		PoeticJuggler duke = (PoeticJuggler) ctx.getBean("duke");
		duke.perform();
	}

}
