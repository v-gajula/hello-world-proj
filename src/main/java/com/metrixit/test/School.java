package com.metrixit.test;

public class School {

public static String name;  
public static int id;
	
public School() {
	System.out.println("Welcome to my page");
}

public void ProfileName(){
  	name = "vamshi";
  	id = 1;
  	System.out.println("I am "+ name + " my id number "+ id); 	
}

public School(String end) {
	System.out.println("end");
	
}

public static void main(String[] args) {
	School loadpage = new School();
	loadpage.ProfileName();
	School loadpage1 = new School("Thankyou");
	
}
	
}
