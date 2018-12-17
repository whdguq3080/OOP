package real;

import java.util.Scanner;

public class Member {
	String name; // 멤버변수

	public String bmi(double t , double w) {
		String bmi = ""; // 지역변수 -> 로컬변수

		double bmi2 = w/(t*t)*1000;

		if(bmi2>=40) {
			bmi= "고도비만";
		}else if(bmi2>=35) {
			bmi= "중등도비만";
		}else if(bmi2>=30) {
			bmi= "경도비만";
		}else if(bmi2>=25) {
			bmi="과체중";
		}else if(bmi2>=18.5) {
			bmi="정상";
		}else{
			bmi="저체중";
		}
		return bmi;
	}//bmi.end

	public String grade(int a,int b,int c,int d,int e) {
		String grade = ""; //로컬변수는 반드시 초기화 해야한다. 원치않는 값이 할당됨.

		int avr = a+b+c+d+e;
		int avr1 = avr/5 ;

		if(avr1>=90){
			grade = "A학점";	
		} else if(avr1>=80){
			grade = "B학점";	
		}  else if(avr1>=70){
			grade = "C학점";	
		} else if(avr1>=60){
			grade = "D학점";	
		} else if(avr1>=50){
			grade = "E학점";	
		} else {
			grade = "F학점";	
		}
		return grade;
	}

	public String cheker(String ssn1){

		String ssn="";
		
		char gen = ssn1.charAt(7);
		switch (gen) {
		case '1': case'3':ssn= "남자";	break;
		case '2': case'4':ssn= "여자";	break;
		case '5': case'6':ssn= "외국인";	break;
		default:ssn="다시 입력하십시오.";		break;
		}
		return ssn;
	}
}


