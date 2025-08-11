package com.durga.introduction;

import java.util.List;

public class Thread2 extends Thread{
	
	List<Integer> l;
	
	Thread2(List<Integer> l, String threadName){
		super(threadName);
		this.l = l;
	}
	
	@Override
	public void run() {
		l.add(100);
		l.add(110);
		l.add(120);
		l.add(130);
		l.add(140);
	}

}
