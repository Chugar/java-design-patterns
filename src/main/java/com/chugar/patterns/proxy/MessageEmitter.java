package com.chugar.patterns.proxy;

public class MessageEmitter implements MessageProxy {
	
	public void emitPassword() {
		System.out.println("The secret password is : helloWorld");
	}
	
	public void emitMessage() {
		System.out.println("Message emitted");
	}
	
	public void secretMethod() {
		System.out.println("Doing secret stuff");
	}
	
	public void knownMethod() {
		System.out.println("Doing some public stuff");
	}

}
