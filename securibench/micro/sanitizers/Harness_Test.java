package securibench.micro.sanitizers;

import java.io.IOException;

import securibench.micro.A;
import securibench.micro.B;

public class Harness_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		A mA1=new A();
		B mB1=new B();
		//(new Sanitizers1()).doGet(mA, mB);
		(new Sanitizers1()).doGet(mA1, mB1);
		(new Sanitizers2()).doGet(mA1, mB1);
		(new Sanitizers3()).doGet(mA1, mB1);
//		(new Sanitizers4()).doGet(mA1, mB1);
		(new Sanitizers5()).doGet(mA1, mB1);
		(new Sanitizers6()).doGet(mA1, mB1);
	}

}
