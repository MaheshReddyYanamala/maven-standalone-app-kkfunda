package com.kk.sample;

/**
 * Hello world!
 *
 */
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Welcome to Maven Build Tool !! KK FUNDA institute !!! Today Date is:  " + getLocalCurrentDate());

	}

	private static Date getLocalCurrentDate() {
		String m = "KK FUNDA";
		return new Date();

	}

}
