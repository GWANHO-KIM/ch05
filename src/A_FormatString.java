
public class A_FormatString {
	public static void main(String[] args)
	{
		int age = 20;
		double height = 178.2;
		String name = "Hong Gil Dong";
		
		System.out.printf(" name: %s \n", name);
		System.out.println(" name: "  + name);
		System.out.print(" name: " + name + "\n");
		
		// 위의 세 시스템 아웃은 다 같은 값으로 출력이 되어진다!!!!!
		// 암기 요망 !!!!!
		
		
		System.out.printf(" age: %d \n height: %e \n\n", age, height);
		
		System.out.printf(" %d - %o - %x \n\n", 77, 77, 77);
		System.out.printf(" %g \n", 0.00014);
		System.out.printf(" %g \n", 0.00014);
	}

}
