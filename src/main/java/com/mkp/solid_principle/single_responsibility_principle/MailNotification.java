package com.mkp.solid_principle.single_responsibility_principle;

public class MailNotification implements INotfication {
	@Override
	public void send() {
		System.out.println("send mail");
	}
}
