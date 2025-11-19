package com.mkp.solid_principle.srp.solution;

public class MessageNotification implements INotfication {
	@Override
	public void send() {
		System.out.println("send message");
	}
}