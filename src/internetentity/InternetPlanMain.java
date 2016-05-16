package internetentity;

public class InternetPlanMain {
	
		
	public static void main(String[] args) {
		
		//create a object of internetplan
		InternetPlan internetPlan = new InternetPlan();
		internetPlan.downloadLimit = 100;
		internetPlan.planName = "Thirtymbps";
		internetPlan.price = 1399;
		internetPlan.speed = 50;
		internetPlan.unlimited = 100;
		
		//create a object of InternetPlanMaker implementation
		InternetPlanMakerImpl internetPlanMakerImpl = new InternetPlanMakerImpl();
		
		//use internetPlanMakerImpl object to call createInternetPlan method
		internetPlanMakerImpl.createInternetPlan(internetPlan);
		
		//create a object of user
		User user = new User();
		user.address = "Bangalore";
		user.setContact(7899512234L);
		user.internetPlan = internetPlan;
		user.userid = "54321abcd";
		user.username = "Internetusername";
		
		//create a object of userMaker implementation
		UserMakerImpl userMakerImpl = new UserMakerImpl();
		
		//use userMakerImpl object to call createuser method
		userMakerImpl.createUser(user);
		
		//create a Billing class object
        Billing billing = new Billing();
        billing.amount = 2060;
        billing.billingId = "agvckv";
        billing.month = "March";
       
        
        //create a object of billingMaker implementation
        BillingMakerImpl billingMakerImpl = new BillingMakerImpl();
        
        //use billingMakerImpl object to call generateBill method
        billingMakerImpl.generateBill(billing);
		
		
	}
	

}
