
package ProducerConsumer;

public class TestOfProducerConsumer {

	public static void main(String[] args) {
		MemoeryBuffer buffer= new MemoeryBuffer();
		Producer pro= new Producer(buffer);
		Consumer con= new Consumer(buffer);
		pro.setName("PRoducer");
		con.setName("COnsumer");
		pro.start();
		con.start();
		}

}
