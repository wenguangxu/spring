package com.gavin.springByJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.gavin.bean.Instrumentalist;
import com.gavin.bean.Juggler;
import com.gavin.bean.PoeticJuggler;
import com.gavin.bean.Sonnet29;
import com.gavin.interfaces.Performer;
import com.gavin.interfaces.Poem;

/**
 * 
 * @author wenguang.xu
 * 基于Java的spring配置
 */

@Configuration
public class SpringMainConfig {

	/**
	 * 声明一个简单的Bean
	 * @return
	 */
	@Bean
	public Performer duke() {
		return new Juggler();
	}
	
	/**
	 * 构造器注入简单值
	 * @return
	 */
	@Bean
	public Performer duke15() {
		return new Juggler(15);
	}
	
	/**
	 * setter注入简单值
	 * @return
	 */
	@Bean
	public Performer kenny() {
		Instrumentalist kenny = new Instrumentalist();
		kenny.setSong("东风破");
		return kenny;
	}
	
	@Bean
	public Poem sonnet29() {
		return new Sonnet29();
	}
	
	/**
	 * 注入Bean
	 * @return
	 */
	@Bean
	public Performer poeticDuke() {
		return new PoeticJuggler(sonnet29());
	}
}
