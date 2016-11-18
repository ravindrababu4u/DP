package Bank;

public class Account {

private static int balance=1000;
public Account(){
		
}
public  void deposit(int amount){
	
	System.out.println("Current balance amount before deposit "+balance);
	System.out.println("Now started deposting the amocunt: "+amount);
	synchronized (Account.class){
	balance= balance+amount;
	}
	System.out.println("Current balance amount after depositing "+balance);
}
}
