package com.gavin.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.gavin.interfaces.Performer;

/**
 * 
 * @author wenguang.xu
 * 乐器演奏家
 * aop
 */
@Service
public class Instrumentalist implements Performer{

	@Value("东风破")
	private String song;
	
	@Override
	public void perform() {
		System.out.println("Playing " + song + " : ");
	}
	
}
