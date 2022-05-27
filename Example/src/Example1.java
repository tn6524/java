import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * 응용문제 while문으로 코드를 작성해야 하며, 프로세서는 다음과 같습니다. 사용자가 상품을 전체 선택하였습니다. 상품 총 금액:
		 * 28000 입니다. 질문 "7000 결제하시겠습니까?" 라고 출력되며 숫자 1이라고 입력하면 최종결제 금액에 추가 되어 집니다.
		 * 단,2 라고 입력시 최종결제 금액에 추가 되어지면 안됩니다.
		 * 총 질문 횟수는 4번 입니다. 마지막에 최종 결제 금액이 나오도록 코드를 작성하시오
		 */
Scanner a= new Scanner(System.in);
int b=1;
int c;
int total = 0;
while(b<5) {
	System.out.println(" 결제를 원하시면 1번 결제를 원하시지 않으면 2번을 눌러주세요");
	System.out.println("7000결제하시겠습니까 ");
	c=a.nextInt();
	if(c==1) {
		total+=7000*c;
		System.out.println("상품이 추가됩니다.");
	}else  { 
		System.out.println("상품이 취소됩니다."); 
		
	}
	b++;
}a.close();
System.out.println("최종결제 금액은"+total+"입니다.");
	}

}
