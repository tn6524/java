
public class ex2 {

	public static void main(String[] args) {
		/*���� Class�� return �޼ҵ带 �ϳ� �����մϴ�. ��, return �޼ҵ�� ����(����)�� ó���ϴ� �޼ҵ� �Դϴ�.
main �޼ҵ忡�� �ش� return �޼ҵ�� ���� 5�� ���ڰ����� �����ϴ�.
return �޼ҵ忡���� �ش� ���ڸ� ���� �� ���ϱ� 7�� �Ͽ� ��� ���� main �޼ҵ�� ������ main���� ������� 
��� �ǵ��� �մϴ�. 
��Ʈ(getter)*/
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