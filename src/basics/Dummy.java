package basics;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import blind75.ContainsDuplicate;

class Parent{
	String name;
	void method() {
		System.out.println("it parent method");
	}
	
}
class Child extends Parent{
	String color;
	void method() {
		System.out.println("it child method");

	}
}


public class Dummy {
public static void main(String[] args) {
//	Parent p = new Parent();
//	p.name="madhav";
//	System.out.println(p.name);
//	p.method();
	Parent p = new Child();
	p.name="ch";
	p.method();
	System.out.println(p.name);
	Child c = new Child();
	c.name="madhav";
	c.color="blue";
	c.method();
	
}
}





































































