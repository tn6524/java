import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {

		/*
		 * {"사과=2000","딸기=1500","키위=2500"}
		 * 
		 * 
		 * 
		 * 해당 상품을 선택해 주세요? [1.사과, 2.딸기,3.키위]2
		 * 
		 * 
		 * 
		 * 해당 상품 갯수를 입력해 주세요? 5
		 * 
		 * 
		 * 
		 * 구매하신 총 가격은 총 가격은 7500원입니다.
		 * 
		 * 
		 * 
		 * abstract 사용
		 * 
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int b = 0;

		int a = 0;

		System.out.println

		("해당 상품을 선택해 주세요? [1.사과, 2.딸기,3.키위]");

		a = sc.nextInt();

		System.out.println("해당 상품 갯수를 입력해주세요?");

		b = sc.nextInt();

		apple ap = new apple();

		ap.fruit(a, b);

	}

}

abstract class shape {

	public abstract void fruit(int a, int b);

	int apple = 2000;

	int berry = 1500;

	int kiwi = 2500;

	int total = 0;

}

class apple extends shape {

	@Override

	public void fruit(int a, int b) {

		for (int w = 1; w < 4; w++) {

			if (a == 1) {

				this.total = this.apple * b;

			} else if (a == 2) {

				this.total = this.berry * b;

			} else {

				this.total = this.kiwi * b;

			}

		}

		System.out.println("구매하신 총 가격은 총 가격은:" + this.total + "원입니다.");

	}

}