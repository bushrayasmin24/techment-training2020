package com.techment.training.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;

class Questions{
	String question,correctOption,option1,option2,option3,option4;
	
	//parameterized constructor 
	Questions(String q, String a, String b, String c, String d,String correctAnswer){
		this.question=q;
		this.option1=a;
		this.option2=b;
		this.option3=c;
		this.option4=d;
		this.correctOption=correctAnswer;
	}
	
	public String getQuestion() {  //getter
		return question;
	}
	
	public void setQuestion(String question) {   //setter
		this.question = question;
	}
	
	public String getOption1() {
		return option1;
	}
	
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	
	public String getOption2() {
		return option2;
	}
	
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	
	public String getOption3() {
		return option3;
	}
	
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	
	public String getOption4() {
		return option4;
	}
	
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	
	public String getCorrectOption() {
		return correctOption;
	}
	
	public void setCorrectOption(String correctOption) {
		this.correctOption = correctOption;
	}

}

public class QuizGameEx24 {

		public static void main(String[] args) {

			//questions
		Questions q1=new Questions("Who among the following has invented cut/copy and paste?","Ward Cunningham","Larry Tesler"," Lee de Forest"," Leonard Max Adleman","Larry Tesler");
		Questions q2=new Questions("Which among the following is the shortcut key to Zoom out window?","Win+[-]","Alt+F9","Ctrl+F6","Win+F2","Win+[-]");
		Questions q3=new Questions("An IP address is a ………. Number","32-bit","8-bit","16-bit","64-bit","32-bit");
		Questions q4=new Questions("192.168.0.0 IP address is belong to","class A","class B","class C","None","Class C");
		Questions q5=new Questions("001+110=?","111","001","101","110","111");
				
		
		HashMap map=new HashMap();
		map.put(1,q1);   //inserted into hash map
		map.put(2,q2);
		map.put(3,q3);
		map.put(4,q4);
		map.put(5,q5);

		System.out.println("Enter question no. between 1 to 5");
		Scanner sc=new Scanner(System.in);
		int qno=sc.nextInt();  //selecting question
		
		Questions selected=(Questions)map.get(qno);
		System.out.println(selected.getQuestion());
		System.out.println(selected.getOption1());
		System.out.println(selected.getOption2());
		System.out.println(selected.getOption3());
		System.out.println(selected.getOption4());
		
		System.out.println("Enter answer:");
		String answer=sc.next();  //storing answer
		
		if(answer.equals(selected.correctOption))  //checking for correct answer
			System.out.println("Correct Answer");
		else {
			System.out.println("Wrong Answer");
			System.out.println("Correct Answer is:"+selected.correctOption);
		}

	}
}

