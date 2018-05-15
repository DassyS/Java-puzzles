
public class ArrayNoDuplications {

	public static void main(String[] args) {
		
		int [] duplicates={1,7,5,1,3,4,2,6,5,6,2,3,8,9};
		int size = duplicates.length;
		for (int e:duplicates){
			System.out.print(e+",");
		}
		
		for (int l=0; l<size;l++){
			for (int i=0; i<size;i++){
				if (duplicates[l]==duplicates[i] && l!=i){
					for (int j=i; j<(size-1);j++) {
						// Replace each value with the next value
						duplicates[j] = duplicates[j+1];
					}
						duplicates[size-2] = duplicates[size-1];
						duplicates[size - 1] = 0;
				}
			}

		}
		System.out.print("\n");
		
		for (int e:duplicates){
			System.out.print(+e+",");
		}
	}
}
