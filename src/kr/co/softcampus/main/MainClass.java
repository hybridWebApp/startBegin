package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorld;

public class MainClass {

	public static void main(String[] args) {

		HelloWorld hello1 = new HelloWorldKo(); //new HelloWorldEn();
		callMethod(hello1);
		
		
		HelloWorld hello2 = new HelloWorldKo(); //new HelloWorldEn();
		callMethod(hello2);
	}//main

	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
}//class
