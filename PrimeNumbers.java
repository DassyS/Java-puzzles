
public class PrimeNumbers {
	
	public static boolean isItPrime(double num){
		if (num==0 || num==1){
			return false;
		}
		int divider = (int)Math.sqrt(num);
		for (int i=2; i<=divider; i++){
			double remainder= num/i;
			if (remainder==(int)remainder){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number=1;
		System.out.print(isItPrime(number));

	}

}

