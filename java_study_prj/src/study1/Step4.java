package study1;

public class Step4 {
	
	public static void q1() {
		int x = 0;
		char ch = ' ';
		int year = 0;
		boolean powerOn = false;
		String str = "";

		//1
		if(x > 10 && x < 20) {
			
		}
		
		//2
		if(ch != ' ' && ch != '\t') {
			
		}
		
		//3
		if(ch != 'x' && ch != 'X') {
			
		}
		
		//4
		if(ch > 47 && ch <58) {
			
		}
		
		//5
		if(ch > 64 && ch < 91 || ch > 97 && ch < 123) {
			
		}
		
		//6
		if(year%400 == 0 || year%4 == 0 && year%100 == 0) {
			
		}
		
		//7
		if(powerOn == false) {
			
		}
		
		//8
		if(str.equals("yes")) {
			
		}
		
	}
	
	public static void q2() {
		int sum = 0;
		
		for(int i=0;i<21;i++) {
			if(!(i%2 == 0 && i%3 == 0)) {
				sum += i;
			}
		}
		
		System.out.println("2번 답 : "+sum);
	}
	
	public static void q3() {
		int sum = 0;
		int total = 0;
		
		for(int i=0;i<11;i++) {
			sum += i;
			total += sum;
		}
		
		System.out.println("3번 답 : "+total);
	}
	
	public static void q4() {
		int sum = 0;
		int answer = 0;
		
		for(int i=0;;i++) {
			if(i%2 == 0) {
				sum -= i;
			}else {
				sum += i;
			}
			
			if(sum > 100) {
				answer = i;
				break;
			}
		}
		
		System.out.println("4번 답 : "+answer);
	}
	
	public static void q5() {
		System.out.println("5번 답 : ");
		int i = 0;
		int j = 0;
		while(i<=10) {
			System.out.println();
			i++;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
		}
	}
	
	public static void q6() {
		System.out.println("6번 답 : ");
		for(int i=1;i<7;i++) {
			for(int j=1;j<7;j++) {
				if(i+j == 6) {
					System.out.println(i+", "+j);
				}
			}
		}
	}
	
	public static void q7() {
		int random = 0;
		
		random = (int)(Math.random()*100)+1;
		
		System.out.println("7번 답 : (int)(Math.random()*100)+1 --> "+random);
	}
	
	public static void q8() {
		System.out.println("8번 답 : ");
		for(int x=0;x<11;x++) {
			for(int y=0;y<11;y++) {
				if(2*x+4*y == 10) {
					System.out.println("x = "+x+", y = "+y);
				}
			}
		}
	}
	
	public static void q9() {
		String str = "12345";
		int sum = 0;
		
		for(int i=0;i<str.length();i++) {
			sum += str.charAt(i);
		}
		
		System.out.println("9번 답 : "+sum);
	}
	
	public static void q10() {
		int num = 12345;
		int sum = 0;
		
		for(int i=0;i<5;i++) {
			int square = 0;
			int mult = 0;
			
			for(int j=0;j<5-i;j++) {
				square *= 10;
			}
			
			mult = num/square;
			
			sum += mult;
		}
		
		System.out.println("10번 답 : "+sum);
	}
	
	public static void q11() {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		System.out.print("11번 답 : "+num1+", "+num2);
		
		for(int i=0;i<8;i++) {
			num1 = num2;
			num2 = num3;
			num3 = num1+num2;
			System.out.print(", "+num3);
		}
		
		System.out.println();
	}
	
	public static void q12() {
		System.out.println("12번 답 : ");
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<4;j++) {
				int x = (j+1)+((i-1)/3*3);
				int y = i%3==0?3:i%3;
				
				if(x > 9) {
					break;
				}
				
				System.out.print(x+"*"+y+"="+x*y+"\t");
			}
			
			System.out.println();
			if(i%3 == 0) {
				System.out.println();
			}
		}
	}
	
	public static void q13() {
		System.out.println("13번 답 : ");
		
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i=0;i<value.length();i++) {
			ch = value.charAt(i);
			
			if(ch < 48 || ch > 57) {
				isNumber = false;
				break;
			}
		}
		
		if(isNumber) {
			System.out.println(value+"는 숫자입니다.");
		}else {
			System.out.println(value+"는 숫자가 아닙니다..");
		}
	}
	
	public static void q14() {
		System.out.println("14번 답 : ");
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요");
			input = s.nextInt(); 
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if(answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 "+count+"번입니다.");
				break;
			}
		}while(true);
	}
	
	public static void q15() {
		System.out.println("15번 답 : ");
		
		int number = 12321;
		int tmp = number;
		int result = 0; 
		
		while(tmp !=0) {
			result = result*10 + tmp % 10;
			tmp /= 10;
		} 
		
		if(number == result) {
			System.out.println( number + "는 회문수 입니다.");
		}else {
			System.out.println( number + "는 회문수가 아닙니다."); 
		}
	}
	
	public static void main(String[] args) {
//		q2();
//		q3();
//		q4();
//		q5();
//		q6();
//		q7();
//		q8();
//		q9();
//		q10();
//		q11();
//		q12();
//		q13();
//		q14();
//		q15();
	}

}
