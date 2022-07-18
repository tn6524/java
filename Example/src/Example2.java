import java.util.ArrayList;

public class Example2 {
 
	public static void main(String[] args) {

		/*
		  다음 숫자배열값을 짝수, 홀수 각각 값을 가져와서 배열로 처리합니다.
		  결과 : 짝수 [2,6,10,22,42,50]
		  홀수 [1,7,11,15,43,51]

		 */

		int[] num = { 1, 2, 6, 7, 10, 11, 15, 22, 42, 43, 50, 51 };

		ThreadExample t = null;

		threadex2 e = null;


				t = new ThreadExample(num);

				e = new threadex2(num);

				t.start();

				e.start();
		}
		
	}
class ThreadExample extends Thread {

	int[] n;

	public ThreadExample(int[] num) {
 
		this.n = num;

 

	}
	@Override
	public void run() {
		ArrayList<Integer> a = new ArrayList<>();
		for (int w = 0; w < n.length; w++) {

			if (n[w] % 2 == 0) {

				a.add(n[w]);

			}

		}

		System.out.println("짝수:"+a);

	}

}

class threadex2 extends Thread {

	int[] s;

	public threadex2(int[] num) {

		this.s = num;

	}

	@Override

	public void run() {

		ArrayList<Integer> b = new ArrayList<>();

		for (int y = 0; y < s.length; y++) {
			if (s[y] % 2 == 1) {
				b.add(s[y]);
			}
		}
		System.out.println("홀수:"+b);
	}
}