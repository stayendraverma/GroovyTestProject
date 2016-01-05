package com.ttnd.groovyExercise

class ConstructorTest {

	static main(args) {

		def per1=new Person(name:"satyendra",age:25,address:"Noida",mobileNo:"12345");
		println(per1);
		
		def per2=new Person();
		println(per2);
	}
}
