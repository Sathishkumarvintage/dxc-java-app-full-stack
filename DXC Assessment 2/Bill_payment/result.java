package Bill_payment;

public class result {

	public static void main(String[] args) {
		 user user = new user(101, "Jack", "jack@dxc.com", 1000);
	     kycuser kycuser = new kycuser(201, "Jill", "jill@dxc.com", 3000);
	     
	     Epaywallet.processPaymentByUser(user, 700);
	     Epaywallet.processPaymentByUser(kycuser, 1500);
	     Epaywallet.processPaymentByUser(kycuser, 800);
	     Epaywallet.processPaymentByUser(kycuser, 1200);

	}

}
