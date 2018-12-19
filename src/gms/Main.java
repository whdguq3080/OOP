package gms; 

  import javax.swing.JOptionPane; 
  public class Main { 
  	public static void main(String[] args) {   	
  		while(true) { 
  			String menu = JOptionPane.showInputDialog( 
  					"0.종료\n " 
  					+ "1.회원관리 \n" 
  					+ "2.계산기 \n" 
  					+ "3.로또 \n" 
  					+ "4.달력 \n"); 
  			switch(menu) { 
  			case "0": 
  				JOptionPane.showMessageDialog(null,"시스템 종료"); 
  				return; 
  			case "1": 
  				Member m = new Member(); 
  				String name = JOptionPane.showInputDialog("이름 입력"); 
  				m.name = name; 
  				JOptionPane.showMessageDialog(null, 
  						String.format("환영합니다 %s 님", m.name)); 
  				 
  				String mMenu = JOptionPane.showInputDialog("[회원관리 메뉴] \n" 
  						+ "1. BMI(키, 몸무게) \n" 
  						+ "2. 학점(국어, 영어, 수학, 과학, 사회) \n" 
  						+ "3. 성별체크(SSN)");
  				
  				switch (mMenu) { 
  				case "1": 
  					String[] arr = JOptionPane.showInputDialog(null, 
  							"키,몸무게 입력").split(","); 
  					String bmi = m.bmi(Double.parseDouble(arr[0]),Double.parseDouble(arr[1])); 
  					JOptionPane.showMessageDialog(null, 
  							String.format("%s 님은 %s 입니다.",  
  									m.name, 
  									bmi)); 
  					break; 
  				case "2": 
  					String[] arr1 = JOptionPane.showInputDialog(null, 
  							"국,영,수,사,과의 점수를 입력하십시오.").split(","); 
  					String grade = m.grade(Integer.parseInt(arr1[0]),
  										Integer.parseInt(arr1[1]),
  										Integer.parseInt(arr1[2]),
  										Integer.parseInt(arr1[3]),
  										Integer.parseInt(arr1[4])); 
  					JOptionPane.showMessageDialog(null, 
  							String.format("학점은 %s 입니다.",grade)); 
  					break; 
  				case "3": String ssn1 = JOptionPane.showInputDialog(null, 
							"주민등록번호를 입력하십시오.");
  					JOptionPane.showMessageDialog(null,String.format("%s는(은) %s입니다.",m.name,m.cheker(ssn1))); 
  					break; 
  
  				} 
  			case "2": 
  				Calc c = new Calc();
  			
  				String res=JOptionPane.showInputDialog(null,"숫자 두개를 계산하시오");
  				String[] arr2 = res.split(" ");
  				
  				switch (arr2[1]) {
				case "+":JOptionPane.showMessageDialog(null,String.format("%s입니다.",c.plus(arr2)));	break;
				case "-":JOptionPane.showMessageDialog(null,String.format("%s입니다.",c.minus(arr2)));	break;
				case "*":JOptionPane.showMessageDialog(null,String.format("%s입니다.",c.multi(arr2)));	break;
				case "/":JOptionPane.showMessageDialog(null,String.format("%s입니다.",c.divid(arr2)));	break;
				default:JOptionPane.showMessageDialog(null,String.format("%s입니다.",c.mod(arr2)));	break;
				}
  			case "3":
  				Lotto l = new Lotto();
  				JOptionPane.showMessageDialog(null,String.format("%s",l.randomNum())); 
				break; 
  			case "4": 
  				String ca = JOptionPane.showInputDialog(null, 
						"연도를 입력하십시오.");
  				MyCalender ca1 = new MyCalender();
				JOptionPane.showMessageDialog(null,String.format("%s",ca1.leapYear(ca))); 
  				break;
  			} 
	  		
  		} 
  		 
  	} 
  } 
