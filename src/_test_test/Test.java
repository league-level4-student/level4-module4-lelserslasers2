package _test_test;

class Doctor{
    void doWork(){
              System.out.println("Doctor at work"); 
    }
}


class Pediatrician extends Doctor{ 
    void doWork(){
    	super.doWork();
             System.out.println("Pediatrician at work"); 
             
    }
}


public class Test {
	public static void main(String[] args) {
	
		someMethod();
		
	}
	
	public static void someMethod(){
		 Doctor d = new Pediatrician(); 
		 d.doWork();
		} 

}
