
public class ex2 {

	public static void main(String[] args) {
		/*메인 Class에 return 메소드를 하나 생성합니다. 단, return 메소드는 정수(숫자)를 처리하는 메소드 입니다.
main 메소드에서 해당 return 메소드로 숫자 5를 인자값으로 보냅니다.
return 메소드에서는 해당 숫자를 받은 후 곱하기 7을 하여 결과 값을 main 메소드로 보내어 main에서 결과값이 
출력 되도록 합니다. 
힌트(getter)*/
		abc a = new abc();
		int result = a.alpha(5); 
		System.out.println(result);
		
	}

}
class abc {
	int b =7;
	int total;
	public int alpha(int i) {
		this.total=b*i;
		return this.total;
	}
}