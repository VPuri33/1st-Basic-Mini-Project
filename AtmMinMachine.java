package First;

public class AtmMinMachine {

	public static void main(String[] args) {
		String atmCard = "1234 5678 1234";
		String pinNum ="1234";
		
		int widtAmount = 5000;
		
		for (int i = 2 ; i <= 2 ; i++) { // 1 ATM card used for 3 Time a day, atm loop accept only for 3 time
			
			System.out.println("Insert your ATM Card : " +  atmCard );
			System.out.println("");
			System.out.println ("Enter your pin number : " + pinNum);
			System.out.println("");
			
			if (atmCard == "1234 5678 1234" && pinNum == "1234") { // If the condition is true enter bank name
			
			System.out.println("");	
			System.out.println("Welcome to VPM Bank of Corpartion");
			System.out.println("");
			
			/* int atm = 0;
			while(atm <= 5000) {
				
				System.out.println("Count in progress : " + atm);
				widtAmount = atm;
				atm = atm + 1000;
			} */
			System.out.println("Enter the amount to collect the cash");
			System.out.println("");
			//  in machine cash collect from 0 still the withdrawl amt
			for( int atm = 0; atm <= widtAmount ; atm = atm + 1000) {
				
				System.out.println("Count in progress : " + atm);
				//widtAmount = atm;
			}
			
			System.out.println("");
			System.out.println("PLease Collect your cash : " + widtAmount);
				
			}
			
		}
		

	}
	

}
