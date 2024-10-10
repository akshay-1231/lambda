package lambda;

import java.util.ArrayList;

public class MyClassArrayList {

	public static void main(String[] args) {
	 ArrayList<Integer>arrList=new	 ArrayList<Integer>();
	 arrList.add(20);
	 arrList.add(32);
	 arrList.add(43);
      //to display : 1 st use of lambda expression
	 arrList.forEach(n->System.out.println(n));
	 System.out.println("======================="); 
	 //display even number 2 nd use lambda expression
	 System.out.println("display even numbers");
	 arrList.forEach(n -> {
		 if(n%2==0)
			 System.out.println(""+n);
	 });
	 
	 
	}

}
