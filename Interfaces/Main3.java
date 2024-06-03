package com.javapractice;
//Define the Person interface

interface Person {
	void speak();
}

//Implement the Student class
class Student implements Person {
	public void speak() {
		System.out.println("Hi i am a Student");
	}
}

//Implement the Teacher class
class Teacher implements Person {
	public void speak() {
		System.out.println("Hi i am a Teacher");
	}
}

//Main class to test the implementation
public class Main3 {

	public static void main(String[] args) {
		// Create objects of Student and Teacher classes
		Person teacher = new Teacher();

		Person student = new Student();
		// Call the speak method on both objects
		teacher.speak(); // it will call speak method in Seacher class
		student.speak(); // it will call speak method in Student class

	}

}
