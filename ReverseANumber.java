
public class ReverseANumber {
	
	public static int reverse(int num){
		int temp;
		int revNum=0;
		Math.abs(num);
		do{
			temp = num%10;
			num=num/10;
			revNum=revNum*10+temp;			
		}while(num!=0);
		
		 
		
		return revNum;
	}

	public static void main(String[] args) {
		int num= -123;
		System.out.print(reverse(num));

	}

}
