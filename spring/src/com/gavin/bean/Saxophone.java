package com.gavin.bean;

import com.gavin.interfaces.Instrument;

/**
 * 
 * @author wenguang.xu
 * 萨克斯
 */
public class Saxophone implements Instrument {

	@Override
	public void play() {
		System.out.println("TOOT TOOT TOOT");
	}

}
