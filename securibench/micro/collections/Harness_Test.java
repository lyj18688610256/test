package securibench.micro.collections;

import java.io.IOException;

import securibench.micro.A;
import securibench.micro.B;

public class Harness_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		A mA1=new A();
		B mB1=new B();
		(new Collections1()).doGet(mA1, mB1);
		(new Collections2()).doGet(mA1, mB1);
		(new Collections3()).doGet(mA1, mB1);
		(new Collections4()).doGet(mA1, mB1);
		(new Collections5()).doGet(mA1, mB1);
		(new Collections6()).doGet(mA1, mB1);
		(new Collections7()).doGet(mA1, mB1);
		(new Collections8()).doGet(mA1, mB1);
		(new Collections9()).doGet(mA1, mB1);
		(new Collections10()).doGet(mA1, mB1);
		(new Collections11()).doGet(mA1, mB1);
		(new Collections12()).doGet(mA1, mB1);
		(new Collections13()).doGet(mA1, mB1);
		(new Collections14()).doGet(mA1, mB1);
	}

}
