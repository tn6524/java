import java.util.Scanner;

 

public class ex6 {

 

	public static void main(String[] args) {

		 

		Scanner sc = new Scanner(System.in);

		System.out.println("1.입력 2.검색 3.가장 긴단어 찾기");

		String text = sc.next();

		String a[][] = {{"사과","바나나","키위"},{"apple","banana","kiwi"}};

		scan sa = new scan();

		if(Integer.parseInt(text)<3) {

			System.out.println("단어검색:");

		}else {

			System.out.println("banana");

		}

		String text2 = sc.next();

		sa.apple(a,text,text2);

		sa.banana();

	}

 

}

class scan{

	String [][] b = null;

	String fruit = null;

	String ss = null;

	public void apple(String[][]f,String t,String c) {

		this.b=f;

		this.fruit=t;

		this.ss=c;

		for (String[] element : b) {

			if(this.fruit.equals("1")) {

				

			if(this.fruit.equals("1")&&this.ss.equals("사과")||this.ss.equals("apple")) {

				System.out.println("영어단어:"+this.b[1][0]);

				System.out.println("한국어:"+this.b[0][0]);

				break;

			}else if(this.fruit.equals("1")&&this.ss.equals("바나나")||this.ss.equals("banana")) {

				System.out.println("영어단어:"+this.b[1][1]);

				System.out.println("한국어:"+this.b[0][1]);

				break;

			}else if(this.fruit.equals("1")&&this.ss.equals("키위")||this.ss.equals("kiwi")){

				System.out.println("영어단어:"+this.b[1][2]);

				System.out.println("한국어:"+this.b[0][2]);

				break;

			}

			

			

		}

			

			}

	}

	public void banana() {

		for (String[] element : b) {

			if(this.fruit.equals("2")&&this.ss.equals("사과")||this.ss.equals("apple")) {

				System.out.println(this.b[1][0]);

				System.out.println(this.b[0][0]);

				break;

			}else if(this.fruit.equals("2")&&this.ss.equals("바나나")||this.ss.equals("banana")) {

				System.out.println(this.b[1][1]);

				System.out.println(this.b[0][1]);

				break;

			}else if(this.fruit.equals("2")&&this.ss.equals("키위")||this.ss.equals("kiwi")){

				System.out.println(this.b[1][2]);

				System.out.println(this.b[0][2]);

				break;

			}

			

		}

		

		

	}

	

}