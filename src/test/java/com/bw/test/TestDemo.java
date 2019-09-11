package com.bw.test;

import java.util.Date;

import org.junit.Test;

public class TestDemo {

	@Test
	public void getDaysByDeparted(){
		Date date = new Date();
		long time = date.getTime();
		System.out.println(time);
		int t = (int) (time/1000/60/60);
		System.out.println(t);
	}
}
