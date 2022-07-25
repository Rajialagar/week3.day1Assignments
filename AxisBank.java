package week3.assingment3;

public class AxisBank {
	
	public void deposit(String str) {
		
		System.out.println(str); 
		
	}
	public static void main(String[] args) {
		
		String str = "Other Deposit Acocunt: Axis Bank - Sample method for Overriding cocept";
		
		BankInfo bk = new BankInfo();
		bk.saving();
		bk.fixed();
		bk.deposit();
		bk.deposit(str);//overriding the method deposit by using different arguments
		
		
	}

}
