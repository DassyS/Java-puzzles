import java.util.*;

public class Hobbies {
	private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();
	
	public void add(String hobbyist, String...hobbies){
		this.hobbies.put(hobbyist, hobbies);
	}
	
	public List<String> findHobbyists (String hobby){
		List<String> myHobbies = new ArrayList<String>();
		String key;
		for (Map.Entry<String, String[]> entry : hobbies.entrySet()) {
			for (String e:entry.getValue()){
				if (e.equals(hobby)){
					key= entry.getKey();
					myHobbies.add(key);
					for (String v:entry.getValue()){
						myHobbies.add(v);
					}
				}
			}
        }
		return myHobbies;
	}
	
	public static void main(String[] args){
		Hobbies hobbies = new Hobbies();
		hobbies.add("John", "Piano", "Puzzles", "Yoga");
		hobbies.add("Adam", "Drama", "Fashion", "Pets");
		hobbies.add("Mary", "Magic", "Pets", "Reading");
		
		System.out.println(Arrays.toString(hobbies.findHobbyists("Puzzles").toArray()));
	}
}