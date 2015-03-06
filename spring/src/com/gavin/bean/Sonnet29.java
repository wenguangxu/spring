package com.gavin.bean;

import com.gavin.interfaces.Poem;

/**
 * 
 * @author wenguang.xu
 * 短诗第29
 */
public class Sonnet29 implements Poem{

	@Override
	public void recite() {
		System.out.println("Recite ： When in disgrace ...");
	}

}
