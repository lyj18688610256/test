package securibench.micro.datastructures;

import java.io.IOException;

import securibench.micro.A;
import securibench.micro.B;

public class Harness_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		A mA1=new A();
		B mB1=new B();
		//(new Sanitizers1()).doGet(mA, mB);
		(new Datastructures1()).doGet(mA1, mB1);
		(new Datastructures2()).doGet(mA1, mB1);
		(new Datastructures3()).doGet(mA1, mB1);
		(new Datastructures4()).doGet(mA1, mB1);
		(new Datastructures5()).doGet(mA1, mB1);
		(new Datastructures6()).doGet(mA1, mB1);
	}

}
