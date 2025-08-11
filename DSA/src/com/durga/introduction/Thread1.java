package com.durga.introduction;

import java.util.List;

public class Thread1 extends Thread{
	
	List<Integer> l;
	
	Thread1(List<Integer> l, String threadName){
		super(threadName);
		this.l = l;
	}
	
	@Override
	public void run() {
		l.add(60);
		l.add(70);
		l.add(80);
		l.add(90);
	}

}
