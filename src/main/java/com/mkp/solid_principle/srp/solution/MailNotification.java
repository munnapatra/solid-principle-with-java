package com.mkp.solid_principle.srp.solution;

public class MailNotification implements INotfication {
	@Override
	public void send() {
		System.out.println("send mail");
	}
}
