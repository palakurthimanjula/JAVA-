package com.edu;
class SingletonClass{
private static SingletonClass sob=new SingletonClass(); //object is private and static 
	
	
	private SingletonClass() {}// restrict user not to create an object
	
	public void display() {
		System.out.println("Display method");
	}
	
	public static SingletonClass getInstance() {
		return sob;
   }
	
}

public class SingletonMain {

	public static void main(String[] args) {
		//get the object
		//SingletonClass ob=new SingletonClass();  //error, 
		//SingletonClass ob1=new SingletonClass();//when you create object , it will call const
          
		SingletonClass	sob=SingletonClass.getInstance();
		sob.display();
		   
      }
}

