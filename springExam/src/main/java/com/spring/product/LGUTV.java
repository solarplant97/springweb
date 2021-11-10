package com.spring.product;

public class LGUTV implements TV {

	public LGUTV() {
		System.out.println("SamsungUTV객체 생성");
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("엘쥐TV전원을 킨다");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("엘쥐TV전원을 끈다");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("엘쥐TV소리를올린다");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("엘쥐TV소리를내린다");
	}

}
