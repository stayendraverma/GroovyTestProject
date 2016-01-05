package com.ttnd.groovyExercise

import groovy.transform.ToString

@ToString(includeNames=true, includeFields=true)
class Person {
	def name;
	def age;
	def address;
	def mobileNo;

	Person(def name="default person name",	def age =19,	def address="india",	def mobileNo="123") {
		this.name=name;
		this.age=age;
		this.address=address;
		this.mobileNo=mobileNo;
	}
}
