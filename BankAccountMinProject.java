package twoPratice;
class Ac{ // Account
	int acNo;
	String holderName;
	float amt;
	
	void insert (int ac, String n , float a) {
		acNo = ac;
		holderName = n;
		amt = a;
	}
	
	//deposite method
	
	void deposite(float cash) {
		amt = cash + amt;
		System.out.println("Deposite Cash = " + amt);
	}
	
	// Withdrawl method
	void with(float takeMoney)
	{
		if  (amt<takeMoney)
		{
			System.out.println("Insuffient Balance");
		}
		else {
			amt = amt - takeMoney;
			System.out.println("WIthdrwal cash = " + takeMoney);
		}
	}
	
	// Method to check balance
	void balance () {
		System.out.println("Your balance is = " + amt);
	}
	
	void displayInfo()
	{
		System.out.println(acNo + " " + holderName + " " + amt);
	}
}

public class BankAccountMinProject {

	public static void main(String[] args) {
		Ac a1 = new Ac();
		a1.insert(5456 , "Mentalu" , 1000);
		a1.displayInfo();
		a1.deposite(9000);
		a1.balance();
		a1.with(500);
		a1.balance();
	}

}
