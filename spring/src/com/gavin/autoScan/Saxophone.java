package com.gavin.autoScan;

import org.springframework.stereotype.Component;
import com.gavin.interfaces.Instrument;

/**
 * 
 * @author wenguang.xu
 * 萨克斯
 */
@Component
public class Saxophone implements Instrument {

	@Override
	public void play() {
		System.out.println("TOOT TOOT TOOT");
	}

}
