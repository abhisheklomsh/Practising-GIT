import java.util.*;

class DSwap{
	int a,b;

void swapf(DSwap cobj){
int temp = a;
a = b;
b = temp;
}
}
class Swap{
public static void main(String args[]){
System.out.println("Welcome!\n"+"Please enter two numbers to switch");
Scanner obj = new Scanner(System.in);
 DSwap cobj = new DSwap();
 System.out.println("\nFirst: ");
 cobj.a = obj.nextInt();
 System.out.println("\nSecond: ");
cobj.b = obj.nextInt();
cobj.swapf(cobj);
System.out.println("\nFirst number is "+cobj.a+"\nSecond number is "+cobj.b); 

}
}
