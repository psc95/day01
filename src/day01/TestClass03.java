package day01;

public class TestClass03 {
	public static void main(String[] args) {
		System.out.println(100 + 100);
		System.out.println(100 + 100.123);
		
		System.out.println("백" + 100);
		System.out.println("백" + 100.123);
		
		System.out.println("백" + (100 + 200) );
		//문자와 숫자가 먼저 합쳐져서 뒤에서 100 + 200 연산이 되지않음
		//()를 해주면 우선순위때매 숫자가 먼저연산됨
		
		System.out.println("안녕" + "하세요");
		
		System.out.println("100" + 500 + 300);
		
		
		//ex1)
		System.out.println("=========================================");
		System.out.println("이름\t 나이\t 전화번호\t \t  회비");
		System.out.println("=========================================");
		System.out.println("홍길동\t" + "\"" + 15 + "\"" + "\t" + 3672+"-"+1234 + "\t" + "\\"+20000);
		System.out.println("고길동\t" + "\"" + 15 + "\"" + "\t" + 2238+"-"+1234 + "\t" + "\\"+30000);
		System.out.println("김말이\t" + "\"" + 15 + "\"" + "\t" + 1234+"-"+1234 + "\t" + "\\"+50000);
		
		System.out.println("-----------------------------------------");
		System.out.println("총합계\t" + "\t \t \t" + "\\"+100000);
		System.out.println("-----------------------------------------");
		
		
		
		
	}
}
