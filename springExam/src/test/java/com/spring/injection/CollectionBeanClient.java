package com.spring.injection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class CollectionBeanClient {
	
	public static void main(String[] args) {
		AbstractApplicationContext factory =
				new GenericApplicationContext("applicationContext.xml");
		CollectionBean bean =(CollectionBean)factory.getBean("collectionBean");
	}
}
