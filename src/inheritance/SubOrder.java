package inheritance;
class Order extends Object {
	int i;
	static {
		System.out.println("1. Order class static block ");
	}
	Order() 
	{
		i = 10;
		System.out.println("4. Order class constructor,i= 10 ... " + i);		//10
	} 
	{
		System.out.println("3. Order class instance block,i= 0 ... " + i);	//0
	}
}
public class SubOrder extends Order {
	int j = 9;
	static {
		System.out.println("2. SubOrder class static block");
	}
	SubOrder() {
		j = 15;
		System.out.println("6. SubOrder class constructor,j= 15 ... " + j);
	}
	{
		System.out.println("5. SubOrder class instance block,j= 9 ... " + j);
	}
	public static void main(String str[]) {
		SubOrder subOrder = new  SubOrder();
		System.out.println("7. Print command,i="+subOrder.i+",j="+subOrder.j);
	}
}