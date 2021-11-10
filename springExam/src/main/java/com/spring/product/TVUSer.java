package com.spring.product;

import java.util.Scanner;

import org.junit.Test;

public class TVUSer {
		@Test
		public void TvTest() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("제조사명 : samsung,lg");
		System.out.println("제조사명 입력");
		String comName = scan.nextLine();
		
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(comName);
		tv.powerOff();
		tv.volumeDown();
		tv.volumeUp();
		tv.powerOn();
	}
}

