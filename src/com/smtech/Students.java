package com.smtech;

public class Students {
	int id;
	String name;
	int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students s1 = new Students(111, "Raaj");
		Students s2 = new Students(222,"Aryan", 25);
		s1.display();
		s2.display();

	}

	
	Students(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	Students(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	void display() {System.out.println(id+" "+name+" "+ age);}

	
}
