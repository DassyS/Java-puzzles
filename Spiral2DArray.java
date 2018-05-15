
public class Spiral2DArray {

	public static void main(String[] args) {
		Integer[][] multD = new Integer[][]{{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
		int midLine;
		int midCol;
		int m=0;//line
		int n=0;//column
		int len= multD.length;
		//Since the middle point is different for even size arrays and odd size arrays, I check for even size.
		 if(multD[0].length%2 == 0){
			 midLine=len/2;
		 }
		 else{
			 midLine=len/2;
		 }
		 if(multD[0].length%2 == 0){
			 midCol=multD[0].length/2-1;
		 }
		 else{
			 midCol=multD[0].length/2;
		 }
		while(n<midLine && m<midCol){
			for (m=m; m<(len-n-1);m++){
				System.out.print(multD[n][m]+", ");
			}
			for (n=n; n<m;n++){
				System.out.print(multD[n][m]+", ");
			}
			for (m=m; m>(len-1-n);m--){
				System.out.print(multD[n][m]+", ");
			}
			for (n=n; n>m+1;n--){
				System.out.print(multD[n][m]+", ");
			}
		}
		System.out.print(multD[midLine][midCol]+"!"); //prints out the middle point/last point.

	}

}
