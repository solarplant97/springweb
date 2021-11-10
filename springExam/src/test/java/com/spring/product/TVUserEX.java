package com.spring.product;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUserEX {
	@Test
	public void TvTestEX() {
		AbstractApplicationContext factory=
				new GenericXmlApplicationContext("applicationContext.xml");
		
		TV tv = (TV)factory.getBean("tv");
		tv.powerOff();
		tv.volumeDown();
		tv.volumeUp();
		tv.powerOn();
		factory.close();
	}
}
