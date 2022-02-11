package securibench.micro.strong_updates;

import java.io.IOException;

import securibench.micro.A;
import securibench.micro.B;

public class Harness_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		A mA1=new A();
		B mB1=new B();
		//(new Sanitizers1()).doGet(mA, mB);
		(new StrongUpdates1()).doGet(mA1, mB1);
		(new StrongUpdates2()).doGet(mA1, mB1);
		(new StrongUpdates3()).doGet(mA1, mB1);
		(new StrongUpdates4()).doGet(mA1, mB1);
		(new StrongUpdates5()).doGet(mA1, mB1);
	}

}
