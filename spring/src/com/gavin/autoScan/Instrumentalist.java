package com.gavin.autoScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.gavin.interfaces.Instrument;
import com.gavin.interfaces.Performer;

/**
 * 
 * @author wenguang.xu
 * 乐器演奏家
 * autoScan注入Bean
 */
@Service
public class Instrumentalist implements Performer{

	@Value("东风破")
	private String song;
	
	@Autowired
	private Instrument instrument;
	
	@Override
	public void perform() {
		System.out.println("Playing " + song + " : ");
		if(instrument != null) {
			instrument.play();
		}
	}
	
}
