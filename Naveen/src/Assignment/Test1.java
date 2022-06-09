package Assignment;
import java.util.Scanner; 
public class Test1 {
  
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		 System.out.println("Input a:"); 
		 int a=s.nextInt(); 
		 System.out.println("Input b:"); 
		 int b=s.nextInt(); 
		 System.out.println("Input c:"); 
		 int c=s.nextInt(); 
		 
		 if(a>b && a>c) 
		 { 
		 System.out.println("A value is Bigger"); 
		 } 
		 else if(b>a && b>c) 
		 { 
		 System.out.println("B value is Bigger"); 
		 } 
		 else { 
		 System.out.println("c value is Bigger"); 
	}

}}
   
