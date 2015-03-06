package com.gavin.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gavin.bean.Auditorium;
import com.gavin.bean.Instrumentalist;
import com.gavin.bean.Juggler;
import com.gavin.bean.OneManBand;
import com.gavin.bean.Stage;
import com.gavin.interfaces.Performer;

/**
 * 
 * @author wenguang.xu
 *
 */
public class BeanTest {

	private ApplicationContext ctx;

	@Before
	public void before() {
		this.ctx = new ClassPathXmlApplicationContext("spring-*.xml");
	}
	

	// 普通Bean
	@Test
	public void testCommonBean() {
		Performer performer = (Juggler) ctx.getBean("duke");
		performer.perform();
	}

	// 构造器注入简单属性的Bean
	@Test
	public void testConstructorBean() {
		Performer performer = (Juggler) ctx.getBean("duke_constructor");
		performer.perform();
	}

	// 构造器注入对象引用的Bean
	@Test
	public void testConstructorRefBean() {
		Performer performer = (Juggler) ctx.getBean("poeticDuke");
		performer.perform();
	}
	
	//工厂方法(单例)创建Bean
	@Test
	public void testSingletonBean() {
		Stage stage = (Stage) ctx.getBean("stage");
		System.out.println(stage);
		Assert.assertNotNull(stage);
	}
	
	//Bean的初始化和销毁
	@Test
	public void testBeanInitDestory() {
		Auditorium auditorium = (Auditorium) ctx.getBean("auditorium");
	}
	
	//通过setter注入Bean
	@Test
	public void testBeanSetter() {
		Instrumentalist kenny = (Instrumentalist) ctx.getBean("kenny");
		kenny.perform();
	}
	
	//装配集合
	@Test
	public void testCollection() {
		OneManBand hank = (OneManBand) ctx.getBean("hank");
		hank.perform();
	}
}
