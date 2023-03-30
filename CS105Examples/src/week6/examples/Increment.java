package week6.examples;

import week5.examples.Person;

public class Increment {
	  public static void main(String[] args) {
		  Person p=new Person(123,"Naz");
		  System.out.println(p.getName());
	    int x = 1;
	    System.out.println("Before the call, x is " + x);
	    increment(x,p);
	    System.out.println(p.getName());
	    System.out.println("After the call, x is " + x);
	  }

	  public static void increment(int x, Person p) {
	    x++;
	    p.setName("Hasan");
	    System.out.println("n inside the method is " + x);
	    System.out.println(p.getName());
	  }
	}

