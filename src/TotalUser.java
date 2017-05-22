import java.util.ArrayList;
import java.util.List;

public class TotalUser {
	private static List<User> totalUser = new ArrayList<User>();

	public TotalUser() {}

	public void addUser(User newUser) {	
		totalUser.add(newUser);
	}
	
	public int getUserCount(){
		return totalUser.size();
	}
	
	public User getUser(int index){
		return totalUser.get(index);
	}
	
		
	
	public void gName(String name){
		for (int i = 0; i < totalUser.size(); i++) {
			if(totalUser.get(i).getName() == name){
				System.out.println(totalUser.get(i).getName());
			}
			else {
				
			}
		}
		
		
	}
	
}
