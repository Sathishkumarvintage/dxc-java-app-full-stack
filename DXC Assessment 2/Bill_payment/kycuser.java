package Bill_payment;

public class kycuser extends user {
	private double rewardpoints;

    public kycuser(int id, String username, String email, double walletbalance) {
        super(id, username, email, walletbalance);
    }

    public double getRewardPoints() {
		return rewardpoints;
	}

	public void setRewardPoints(double rewardpoints) {
		this.rewardpoints = rewardpoints;
	}

	@Override
    public boolean makepayment(double billamount) {
        boolean paymentSuccess = super.makepayment(billamount);
        if (paymentSuccess) {
            rewardpoints += billamount * 0.1;
        }
        return paymentSuccess;
    }

}


