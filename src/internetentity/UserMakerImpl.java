package internetentity;

public class UserMakerImpl implements UserMaker {

	@Override
	public void createUser(User user) {
	
		System.out.println("create user call received");
		System.out.println("Address - " + user.address);
		System.out.println("setContact - " + user.contact);
		System.out.println("internetPlan - " + user.internetPlan);
		System.out.println("userid - " + user.userid);
		System.out.println("username - " + user.username);
		
	}

}