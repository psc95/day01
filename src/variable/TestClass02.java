package variable;

public class TestClass02 {
public static void main(String[] args) {
	char ch = 'A'; //char 작은 따옴표로 묶어줘야함 
	int num = 123;
	System.out.println("연산 전 ch : "+ch);
	System.out.println("연산 전 num : "+num);
	ch = 'B';
	num = num +123;
	System.out.println("연산 후 : "+ch);
	System.out.println("연산 후 : "+num);
	
	ch = 'a';
	num = 5;
	System.out.println("ch+num => " + (ch + num) );
}
}
