package Abstraction;



/**
 * Abstraction - hiding implementation only showing the functionality
 * can achieve using abstract class and interface
 * 
 * 
 * **/
public abstract class Car {
	private int a;
	private int b;
	
	Car(){
		System.out.println("car called");
	}
	// concrete or instance or non static or non abstact
	public void sleep() {
		System.out.println("sleeping");
	}
	
	public static void add() {
		System.out.println("addition");
	}
	
	public abstract void run() ;
	
	public abstract void shutdown();

}
