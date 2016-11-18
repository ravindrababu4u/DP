package Bank;

public class DespsitingThread extends Thread{
	Account a;
	int amount;
	public DespsitingThread(int deAmount){
		 a= new Account();
		 this.amount=deAmount;
		
	}
	
	public void run(){
		
		a.deposit(amount);
		//Thread.join();
	}

}
