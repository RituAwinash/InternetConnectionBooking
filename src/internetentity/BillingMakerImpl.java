package internetentity;

public class BillingMakerImpl implements BillingMaker {

	@Override
	public void generateBill(Billing billing) {
		System.out.println("create billingmaker call received");
		System.out.println("amount - " + billing.amount);
		System.out.println("billingId - " + billing.billingId);
		System.out.println("month - " + billing.month);
	
	}

}
