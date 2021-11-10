package com.spring.product;

public class SamsungUTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungUTV() {
		System.out.println("SamsungUTV객체 생성");
	}
	
	public SamsungUTV(Speaker speaker) {
		System.out.println("SamsungUTV 스피커객체 생성");
		this.speaker = speaker;
	}
	
	public SamsungUTV(Speaker speaker,int price) {
		System.out.println("SamsungUTV 스피커객체 생성과 가격");
		this.speaker = speaker;
		this.price = price;
	}
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker 호출");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("setPrice 호출");
		this.price = price;
	}
	public void initMethod() {
		System.out.println("객체초기화 작업 처리");
	}
	public void destroyMethod() {
		System.out.println("객체삭제전에 처리할 로직 처리");
	}
	@Override
	public void powerOn() {
		System.out.println("SamsungUTV전원을 켜다(가격 : "+price+")");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungUTV전원을 끈다");
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
