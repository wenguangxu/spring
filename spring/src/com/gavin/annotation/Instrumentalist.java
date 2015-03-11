package com.gavin.annotation;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.gavin.interfaces.Instrument;
import com.gavin.interfaces.Performer;

/**
 * 
 * @author wenguang.xu
 * 乐器演奏家
 * 注解注入Bean
 */
public class Instrumentalist implements Performer{

	@Value("东风破")
	private String song;
	
	@Autowired(required=false)
	@Qualifier("saxophone")
	private Instrument instrument;
	
	@Inject
	@Named("saxophone")
	private Instrument instrument2;
	
	@Override
	public void perform() {
		System.out.println("Playing " + song + " : ");
		if(instrument2 != null) {
			instrument2.play();
		}
	}
	
	public void setSong(String song) {
		this.song = song;
	}

	/*@Autowired
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}*/

}
