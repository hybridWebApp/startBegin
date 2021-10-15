package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorld;

public class HelloWorldKo implements HelloWorld {

	@Override
	public void sayHello() {
		System.out.println("안녕하세요.");
	}

}
