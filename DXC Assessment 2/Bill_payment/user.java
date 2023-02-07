package Bill_payment;

public class user {
	 private int id;
	    private String username;
	    private String email;
	    private double walletbalance;

	    public user(int id, String username, String email, double walletbalance) {
	        this.id = id;
	        this.username = username;
	        this.email = email;
	        this.walletbalance = walletbalance;
	    }
	    
	public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public double getWalletBalance() {
			return walletbalance;
		}

		public void setWalletBalance(double walletbalance) {
			this.walletbalance = walletbalance;
		}

	    public boolean makepayment(double billamount) {
	        if (walletbalance >= billamount) {
	            walletbalance -= billamount;
	            return true;
	        }
	        return false;
	    }

}
