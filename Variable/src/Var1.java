import java.util.*;

public class Var1 {
	public static void initVariable() {
		// 변수 초기화.
		// 변수를 저장하기 전 처음으로 값을 저장. 
		int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000;
		age = age + 1;
		
		System.out.println(year);
		System.out.println(age);
	}
	
	public static void swapVariable() {
		// 두 변수의 교환하기
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x:" + x + " y:" + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x:" + x + " y:" + y);
	}
	
	public static void primitiveType() {
		boolean bool = true;
		char  ch = 'C';
		byte   b = 127;
		short  s = 32767;
		int    i = 2147483647;
		long   l = 9223372036854775807L;
		float  f = 3.4E38f;
		double d = 1.8E307d;
		
		System.out.println("boolean:" + bool);
		System.out.println("char:" + ch);
		System.out.println("byte:" + b);
		System.out.println("short:" + s);
		System.out.println("int:" + i);
		System.out.println("long:" + l);
		System.out.println("float:" + f);
		System.out.println("double:" + d);
	}
	
	public static void constantLiteral() {
		final int MAX_SPEED = 10; // Constant(상수).
		// 정수형 리터럴.
		int octNum = 010;  // 8진수 접두사 '0'.
		int hexNum = 0x10; // 16진수 접두사 '0x'.
		int binNum = 0b10; // 2진수 접두사 '0b'.
		long big = 9_223_372_036_854_775_807L; // long 타입 접미사 'L' & 정수형 리터럴 중간 구분자 '_'. 
		
		// 실수형 리터럴.
		// 실수형의 기본 타입은 double.
		float f = 10.0F;
		double d = 10.000D;
		
		// 지수 표현.
		float exp = 3.14e3f;
		float flt = 3140.0f;
		float flt_non_dot = 3140f;
		
		// 문자/문자열 리터럴.
		char ch = 'J';
		String name = "Java";
		String name2 = new String("java");
		String name_sum = "Ja" + "va";
		String str = name_sum + 8.0;
		
		System.out.println("상수(Constant) : " + MAX_SPEED);
		System.out.println("8진수 : " + octNum);
		System.out.println("16진수 : " + hexNum);
		System.out.println("2진수 : " + binNum);
		System.out.println("Long 리터럴 : " + big);
		System.out.println("Float 리터럴 : " + f);
		System.out.println("Double 리터럴 : " + d);
		System.out.println("지수형 : 3.14e3f = " + exp + " / " + "Float : " + flt);
		System.out.println("3140f = " + flt_non_dot);
		System.out.println("char : " + ch);
		System.out.println("String 객체 : " + name);
		System.out.println("new String(\"java\") : " + name2);
		System.out.println("String 연산 : " + str);
	}
	
	public static void printFormatting() {
		byte  b = 1;
		short s = 2;
		char  c = 'A';
		
		int  i   = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010;
		int hexNum = 0x10;
		int binNum = 0b10;
		
		System.out.println("printf()");
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("i=[%5d]%n", i);
		System.out.printf("i=[%-5d]%n", i);
		System.out.printf("i=[%05d]%n", i);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); // '#'은 접두사(16진수 0x,8진수 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);	
	}
	
	public static void valueInput() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력 내용 : " + input);
		System.out.printf("num = %d%n", num);
		
		scanner.close();
	}
}
