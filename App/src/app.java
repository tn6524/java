
public class app {

	public static void main(String[] args) {
	int a = 10;
	int b = 20;
	int c;
	// ��Ģ�����ȣ : + , - , * , / 
	//c = a + b;
	//c = a - b;
	//c = a * b;
	c = a / b;
	
	System.out.println(c);
    String a1 = "ȫ�浿";
    String b1 = "ȯ���մϴ�.";
    String c1;
    c1 = a1 + b1; //�������� �϶� +�� ����+���ڿ��� ǥ���� �� �ֽ��ϴ�.
    System.out.println(c1);
    
    /* ���빮��.
     * ������ ���� ��µǴ� �ڵ带 �ϼ��Ͻÿ�.
     ȫ�浿�� �������� 50000 �Դϴ�.
     ��, ȫ�浿 �� 50000�� ���� ���������� ��ȭ�� �� �ֽ��ϴ�.
     */
    String mname = "ȫ�浿";
   	int mpoint = 50000;
     
    System.out.println(mname+"�� �������� "+mpoint+" �Դϴ�.");
    
    String mname1 = "ȫ�浿";
   	int mpoint1 = 50000;
    String msg = mname1+"�� �������� "+mpoint1+" �Դϴ�.";
    System.out.println(msg);
    
    String a11;
    a11 = "ȫ�浿";
    String b11 = "�� �������� ";
    int c11;
    c11 = 50000;
    String d11 = " �Դϴ�.";
    String e11;
    e11 = a11 + b11 + c11 + d11;
    System.out.println(e11);
    
    /* ���빮��
     * �Ƹ��� ����Ʈ���� ��ǰ�� ���� �߽��ϴ�.
     * ��ٱ��Ͽ� ���� ��ǰ ������ ��� ���ؼ� �� ���� �ݾ��� 
     * ��µǵ��� �Ͻÿ�. ��, $ ȯ���� ��� �Ǿ�� �մϴ�.
     * 8.25
     * 4.02
     * 3.71
     * ��� ���� ������ ���� ����ϼ���.
     * �� �����ݾ� $ �Դϴ�.
     * 
     */
    double p1,p2,p3,p4;
    p1 = 8.25;
    p2 = 4.02;
    p3 = 3.71;
    p4 = p1 +p2 +p3;
    System.out.println("�� �����ݾ� $"+p4+" �Դϴ�.");
    
     double a12 = 8.25;
    double b12 = 4.02;
    double c12 = 3.71;
    String msg1 = "�� �����ݾ� $" +(a12 + b12 + c12)+ " �Դϴ�.";
    System.out.println(msg1);
    // ���� �Ѱ�
    double a13 = 8.25 + 4.02 + 3.71;
    System.out.println("�� �����ݾ� $"+ a13 + " �Դϴ�.");
    // ���� �Ѱ�
   
    int k = 9;
    int j = 3;
    double aw = k/j;
    System.out.println(aw);
   
    int k1 = 3;
    int j1 = 9;
    double aw1 = (double)k1/j1; //���������� �ڷ��� ���� �ִ� �ڵ�
    System.out.println(aw1);
    
   
    
	}

}
