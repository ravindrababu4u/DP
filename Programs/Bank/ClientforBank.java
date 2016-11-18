package Bank;

public class ClientforBank {

	public static void main(String[] args) throws InterruptedException {
		DespsitingThread t1= new DespsitingThread(1000);
		DespsitingThread t2= new DespsitingThread(2000);
		t1.start();

		t2.start();
	}

}
