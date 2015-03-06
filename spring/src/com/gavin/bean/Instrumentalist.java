package com.gavin.bean;

import com.gavin.interfaces.Instrument;
import com.gavin.interfaces.Performer;

/**
 * 
 * @author wenguang.xu
 * 乐器演奏家
 * setter注入Bean
 */
public class Instrumentalist implements Performer{

	private String song;
	private Instrument instrument;
	
	@Override
	public void perform() {
		System.out.println("Playing " + song + " : ");
		instrument.play();
	}
	
	public void setSong(String song) {
		this.song = song;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

}
