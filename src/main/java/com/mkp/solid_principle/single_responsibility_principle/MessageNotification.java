package com.mkp.solid_principle.single_responsibility_principle;

public class MessageNotification implements INotfication {
	@Override
	public void send() {
		System.out.println("send message");
	}
}