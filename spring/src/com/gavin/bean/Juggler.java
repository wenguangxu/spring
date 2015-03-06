package com.gavin.bean;

import com.gavin.interfaces.Performer;

/**
 * 
 * @author wenguang.xu
 * 杂技师 类
 */
public class Juggler implements Performer{

	//豆袋子
	private int beanBags = 3;
	
	public Juggler(){}
	
	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}
	
	@Override
	public void perform() {
		System.out.println("JUGGLER " + beanBags + " BEANBAGS");
	}

}
