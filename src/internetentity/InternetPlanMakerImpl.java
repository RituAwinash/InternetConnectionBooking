package internetentity;

public class InternetPlanMakerImpl implements InternetPlanMaker {

	//@Override
	//public void createInternetPlan() {
		//System.out.println("create internetplan call received");
		
	//}

	@Override
	public void createInternetPlan(InternetPlan internetPlan) {
		System.out.println("create internetplan call received");
		System.out.println("Downloadlimit - " + internetPlan.downloadLimit);
		System.out.println("Plan Name - " + internetPlan.planName);
		System.out.println("Price - " + internetPlan.price);
		System.out.println("Speed - " + internetPlan.speed);
		System.out.println("Unlimited - " + internetPlan.unlimited);
		
		
	}

}
