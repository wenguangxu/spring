package com.gavin.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.gavin.annotation.Instrumentalist;

/**
 * 
 * @author wenguang.xu
 *
 */
public class AnnotationBeanTest {

	private ApplicationContext ctx;

	@Before
	public void before() {
		this.ctx = new ClassPathXmlApplicationContext("spring-annotationBean.xml");
	}
	

	@Test
	public void testAnnotationSetterBean() {
		Instrumentalist kenny = (Instrumentalist) ctx.getBean("kenny");
		kenny.perform();
	}
	

}
