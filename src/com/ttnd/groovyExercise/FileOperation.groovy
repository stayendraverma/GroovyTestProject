package com.ttnd.groovyExercise

class FileOperation {

	static main(args) {

		readFile("/home/satyendra/test/abc.txt");
		def multilineString="""hi
						this is satyendra
                        i am in multiline string"""
		writeInToFile("/home/satyendra/test/abc.txt",multilineString,true);
		readFile("/home/satyendra/test/abc.txt");
	}


	static readFile(def filePath) {

		new File(filePath).eachLine { line -> println(line) }
	}
	static writeInToFile(def filePath,def fileContent="",def appendMode=false) {
		def file=new File(filePath)
		if(file) {
			if(!appendMode)
				file.text=fileContent;
			else
				file.append(fileContent);
		}
	}
}
