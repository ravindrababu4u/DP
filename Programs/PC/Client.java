package PC;

public class Client {

	public static void main(String[] args) {
     Producer p = new Producer();
     Consumer c= new Consumer();
     p.setPriority(10);
     c.setPriority(1);
     p.start();
     c.start();
	}

}
