package fibannoci;
import java.util.*;
public class fabnocci {

	public static void main(String[] args) {
		int num;
		int c;
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		System.out.println("eneter a number");
		num=sc.nextInt();
		System.out.print(a);
		System.out.print(" "+b);
		for(int i=2;i<num;i++){
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
		

	}

}
