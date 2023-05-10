package com.edu;

import java.util.Scanner;

class CheckInputFloor extends Exception{

	public CheckInputFloor(String message) {
		super(message);
	}	
}

class Elevator{
	//instance variables, member variables
	char s,f,q;
	char choice;
	int floor;
	int backup_floor=1;
	
	//member methods
	void input() throws CheckInputFloor {
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("Options: (s)elect a floor, (f)ire alarm, (q)uit");
		choice = scan.next().charAt(0);
		if(choice=='s') {
			selectFloor();		
		}
		else if(choice=='f') {
			fireAlarm();
			//input();
		}
		else if(choice=='q') {
			System.exit(0);
		}
		else {
			System.out.println("Invalid Selection");
		}
		}
	}
	
	
	/*
	 * void inputChoice() throws CheckInputFloor {
	 * 
	 * if(choice=='s') { while(true) selectFloor();
	 * 
	 * } else if(choice=='f') { fireAlarm(); input(); } else if(choice=='q') {
	 * System.exit(0); } else { System.out.println("Invalid Selection"); }
	 * 
	 * }
	 */
	
	void selectFloor() throws CheckInputFloor{
		//int floor1=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the floor you'd like to go to: ");
		floor = scan.nextInt();
		//floor1 = floor;
		
		if(floor<1 || floor>10) {
			throw new CheckInputFloor("Invalid floor");
		}
		else {
			if(floor>backup_floor) {
				System.out.print("Going up..");
				for(int i=backup_floor+1;i<=floor;i++) {
					System.out.print(i + "..");
					backup_floor=floor;
				}
					System.out.println("Ding!");
			}
			else {
				System.out.print("Going down..");
				for(int i=backup_floor-1;i>=floor;i--) {
					System.out.print(i + "..");
					backup_floor=floor;
				}
				System.out.println("Ding!");
				}		
		}
	
		
	}
	
	
	void fireAlarm() throws CheckInputFloor {
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("Enter the floor you are on: "); int floor=scan.nextInt();
		 */
		if(floor==1) {
			throw new CheckInputFloor("Danger! You must exit the building now!");
		}
		else {
				throw new CheckInputFloor("Danger! You must exit the building now! Going to the First Floor!");
		}
		
	}
}


public class ElevatorProgram {

	public static void main(String[] args) throws CheckInputFloor {
		Elevator e = new Elevator();
		e.input();
	}

}