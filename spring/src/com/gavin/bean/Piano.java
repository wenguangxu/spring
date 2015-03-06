package com.gavin.bean;

import com.gavin.interfaces.Instrument;

/**
 * 
 * @author wenguang.xu
 * 钢琴
 */
public class Piano implements Instrument {

	@Override
	public void play() {
		System.out.println("PLINT PLINT PLINT");
	}

}
