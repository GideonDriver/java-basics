package constructordemo;

public class StaticDemo {

	public int num1 = 100;
	public static int num2 = 200;

	//adds 10 to num1, minuses 20 from num2
	public StaticDemo() {
		num1 += 10; // 10
		num2 -= 20; // 20
	}

	//num1 becomes 99, and num2 becomes 100
	public void display1() {
		num1 = num2++;
		num2 = 100;
		num1 = --num2;
	}

	//num2 minus 1
	public static void display2() {
		num2--;
	}

	public static void main(String[] args) {
		StaticDemo demo1 = new StaticDemo();
		//demo1.num1 = 110
		//demo(any).num2 = 180
		StaticDemo demo2 = new StaticDemo();
		//demo2.num1 = 110
		//demo(any).num2 = 160

		demo1.display1();
		//demo1.num1 = 99			-last
		//demo(any).num2 = 100

		demo2.display2();
		//demo2.num1 = 98
		//demo(any).num2 = 100
		display2();
		//demo2.num1 = 97
		//demo(any).num2 = 100
		StaticDemo.display2();
		//demo2.num1 = 96			-last
		//demo(any).num2 = 100		-last

		System.out.println("demo1 num1 " + demo1.num1);
		System.out.println("demo1 num2 " + demo1.num2);

		System.out.println("demo2 num1 " + demo2.num1);
		System.out.println("demo2 num2 " + demo2.num2);
	}

}