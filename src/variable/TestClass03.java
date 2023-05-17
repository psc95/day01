package variable;

public class TestClass03 {
public static void main(String[] args) {
	/*
	 형변환
	 - 자료형을 변화시키는 것
	 */
	int num = 65;
	System.out.println( num );
	System.out.println( (char)num );
	
	char ch = 'A', ch3;
	//char ch3
	int ch2;
	
	num = 5;
	ch2 = ch + num;
	ch3 = (char)(ch + num);
	
	System.out.println( ch2 );
	System.out.println( ch3 );
	
	float f1 = (float)1.11;
	float f2 = 1.11f;		//위에꺼랑 똑같은데 다른게 표시한 코드
	
	double dou = 1.11;
	
	String name = "홍길동";		//문자열이기 때문에 작은 따옴표로 할수가 없음
	System.out.println("당신 이름 : "+name);
	
	
}
}
