package com.spring.product;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("Speaker 객체 생성");
	}
	@Override
	public void volumeUp() {
		System.out.println("Speaker 소리 올린다");
	}
	@Override
	public void volumeDown() {
		System.out.println("Speaker 소리 내린다");
	}
}
