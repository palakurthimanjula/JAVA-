package com.edu;

class StudentData1{
	String name;
	int score;
	String card;
	public StudentData1(String name, int score, String card) {
		super();
		this.name = name;
		this.score = score;
		this.card = card;
	}
}

class Classroom{
	
	String registerStudent(StudentData1 s1) {
		String name=s1.name.toUpperCase();
		if(s1.name.equals(name) ) {
			if(s1.score>=0&&s1.score<=100) {
				return "registered";
			}
			else
				return "invalide score";
		}
		else
			return "Block letters needed";
}
	
	String studentCard(StudentData1 s1) {
		boolean res=true;
		int len =s1.card.length();
		for(int i=0;i<len;i++) {
			if(!Character.isDigit(s1.card.charAt(i))) {
				res=false;
				break;
			}
			
		}
		if(res==true)
			return "valid card";
		else
			return "invalid user";
}


public class Source {
	public static void main(String[] args) {
		StudentData1 s= new StudentData1("A", 100,"12344onk123");
		
		Classroom cm = new Classroom();
		String msg =cm.registerStudent(s);
		System.out.println(msg);
		String msg1=cm.studentCard(s);
		System.out.println(msg1);
	}

}


}




