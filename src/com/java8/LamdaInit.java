package com.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LamdaInit {
	
	Function<String, String> atr = (name) -> {return "@" + name;};
	
	
	
	public static void main(String[] args) {
		
		LamdaInit l  = new LamdaInit();
		//using apply() from Function 
		System.out.println(l.atr.apply("ivan"));
		
		///////////////////////////////////////////////////////////////////////
		
		display(() -> 10);
		display(() -> 100);
		display(() -> (int) (Math.random() * 100));
		
		////////////////////////////////////////////////////////////////////////
		
		// Create ArrayList and add four String elements.
		ArrayList<String> list = new ArrayList<>();
		list.add("cat");
		list.add("dog");
		list.add("cheetah");
		list.add("deer");

		// Remove elements that start with c.
		list.removeIf(element -> element.startsWith("c"));
		System.out.println(list.toString());
		
		
		////////////////////////////////////////////////////////////////////////
		
		// This consumer calls a void method with the value.
		Consumer<Integer> consumer = x -> display(x - 1);

		// Use the consumer with three numbers.
		consumer.accept(1);
		consumer.accept(2);
		consumer.accept(3);
		
		///////////////////////////////////////////////////////////////////////
		
		Map<String, String> hash = new HashMap<>();
		hash.put("cat", "orange");
		hash.put("dog", "black");
		hash.put("snake", "green");
		// Use lambda expression that matches BiConsumer to display HashMap.
		hash.forEach((string1, string2) -> System.out.println(string1 + "..."
			+ string2 + ", " + string1.length()));
		
	}
	
	public static void display(Supplier<Integer> arg) {
		System.out.println(arg.get());
	}
	
	
	static void display(int value) {

		switch (value) {
		case 1:
		    System.out.println("There is 1 value");
		    return;
		default:
		    System.out.println("There are " + Integer.toString(value)
			    + " values");
		    return;
		}
	}
	
	
	public void runnableLamdas() {
		
		//both work with lamdas
		Runnable r = () -> System.out.println("hello world");
		r.run();
		
		new Thread(
			    () -> System.out.println("hello world")
			).start();
	}
	
	public void startingThread() {
		
		//Old way:
		new Thread(new Runnable() {
		  @Override
		  public void run() {
		      System.out.println("Hello from thread");
		  }
		}).start();

		//New way:
		new Thread(
		  () -> System.out.println("Hello from thread")
		).start();

		
	}
	
	//for swing
	public void actionListenerImp() {
		
//		//Old way:
//		button.addActionListener(new ActionListener() {
//		    @Override
//		    public void actionPerformed(ActionEvent e) {
//		        System.out.println("The button was clicked using old fashion code!");
//		    }
//		});
//		 
//		//New way:
//		button.addActionListener( (e) -> {
//		        System.out.println("The button was clicked. From lambda expressions !");
//		});
//		
	}
}




//(int a, int b) -> {  return a + b; }
//
//() -> System.out.println("Hello World");
//
//(String s) -> { System.out.println(s); }
//
//() -> 42
//
//() -> { return 3.1415 };