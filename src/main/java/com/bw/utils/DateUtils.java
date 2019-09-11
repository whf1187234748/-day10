package com.bw.utils;

import java.util.Date;

public class DateUtils {

	public static int getAge (Date src) {
		Date date = new Date();
		
		return 0;
	}
	
	public static Date getDateByMonthInit (Date src) {
		Date date = new Date();
		return src;
	}
	
	public static Date getDateByMonthLast(Date src) {
		Date date = new Date();
		return src;
	}
	
	public static int getDaysByFuture (Date future) {
		Date date = new Date();
		return 0;
	}
	
	public static int getDaysByDeparted (Date departed) {
		Date date = new Date();
		long time = date.getTime();
		long time2 = departed.getTime();
		long time3 = time-time2;
		return (int) time3;
	}
}
