package com.gavin.bean;

import com.gavin.interfaces.Poem;

/**
 * 
 * @author wenguang.xu
 * 会朗诵诗歌的杂技师
 */
public class PoeticJuggler extends Juggler{

	private Poem poem;
	
	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags,Poem poem) {
		super(beanBags);
		this.poem = poem;
	}

	@Override
	public void perform() {
		super.perform();
		this.poem.recite();
	}
	
	
}
