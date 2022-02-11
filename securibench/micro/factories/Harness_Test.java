package securibench.micro.factories;

import java.io.IOException;

import securibench.micro.A;
import securibench.micro.B;

public class Harness_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		A mA1=new A();
		B mB1=new B();
		//(new Sanitizers1()).doGet(mA, mB);
		(new Factories1()).doGet(mA1, mB1);
		(new Factories2()).doGet(mA1, mB1);
		(new Factories3()).doGet(mA1, mB1);
	}

}
