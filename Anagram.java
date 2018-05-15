
public class Anagram {


	public static boolean isAnagram(StringBuilder wordOne, StringBuilder wordTwo){

		int count=0;
		if (wordOne.length()== wordTwo.length()){
			for (int i=0; i<(wordOne.length()); i++){
				String s= wordOne.substring(i,i);
				int index=wordTwo.indexOf(s);
				if (index>=0){
					count++;
					wordTwo.setCharAt(index, '!');
				}
				if (count==wordTwo.length()){
					return true;
				}
			}
		}
		return false;
	}


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				StringBuilder wordOne = new StringBuilder();
				StringBuilder wordTwo = new StringBuilder();
				wordOne.append("silent");
				wordTwo.append("margy");
				System.out.print(isAnagram(wordOne,wordTwo));

			}

		}
