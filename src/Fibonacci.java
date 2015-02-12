
public class Fibonacci {
	public static int fibo(int num){
		if (num==0){
			return 0;
		}
		else if (num==1){
			return 1;
		}
		else{
			return fibo(num-1)+ fibo(num-2);
		}
	}
	public static void main(String[] args) {
		for (int x =0; x<=10; x++){	
			System.out.println("fibonacci of " + x + " is " + fibo(x));
		}	
	}
}
