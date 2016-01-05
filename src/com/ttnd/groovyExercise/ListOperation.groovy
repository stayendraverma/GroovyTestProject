package com.ttnd.groovyExercise

class ListOperation {

	static main(args) {
		List ll=[1, 2, 3, [4, 5, 6, 7],"a","b","c"]
		//println(ll);

		ll.eachWithIndex {item,i->
			print(item)
			println("==="+i)
		}
	}
}
