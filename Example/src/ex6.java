import java.util.Scanner;

 

public class ex6 {

 

	public static void main(String[] args) {

		 

		Scanner sc = new Scanner(System.in);

		System.out.println("1.�Է� 2.�˻� 3.���� ��ܾ� ã��");

		String text = sc.next();

		String a[][] = {{"���","�ٳ���","Ű��"},{"apple","banana","kiwi"}};

		scan sa = new scan();

		if(Integer.parseInt(text)<3) {

			System.out.println("�ܾ�˻�:");

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

				

			if(this.fruit.equals("1")&&this.ss.equals("���")||this.ss.equals("apple")) {

				System.out.println("����ܾ�:"+this.b[1][0]);

				System.out.println("�ѱ���:"+this.b[0][0]);

				break;

			}else if(this.fruit.equals("1")&&this.ss.equals("�ٳ���")||this.ss.equals("banana")) {

				System.out.println("����ܾ�:"+this.b[1][1]);

				System.out.println("�ѱ���:"+this.b[0][1]);

				break;

			}else if(this.fruit.equals("1")&&this.ss.equals("Ű��")||this.ss.equals("kiwi")){

				System.out.println("����ܾ�:"+this.b[1][2]);

				System.out.println("�ѱ���:"+this.b[0][2]);

				break;

			}

			

			

		}

			

			}

	}

	public void banana() {

		for (String[] element : b) {

			if(this.fruit.equals("2")&&this.ss.equals("���")||this.ss.equals("apple")) {

				System.out.println(this.b[1][0]);

				System.out.println(this.b[0][0]);

				break;

			}else if(this.fruit.equals("2")&&this.ss.equals("�ٳ���")||this.ss.equals("banana")) {

				System.out.println(this.b[1][1]);

				System.out.println(this.b[0][1]);

				break;

			}else if(this.fruit.equals("2")&&this.ss.equals("Ű��")||this.ss.equals("kiwi")){

				System.out.println(this.b[1][2]);

				System.out.println(this.b[0][2]);

				break;

			}

			

		}

		

		

	}

	

}