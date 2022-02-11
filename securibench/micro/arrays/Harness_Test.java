package securibench.micro.arrays;

import java.io.IOException;

import securibench.micro.A;
import securibench.micro.B;

public class Harness_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		A mA1=new A();
		B mB1=new B();
		(new Arrays1()).doGet(mA1, mB1);
		(new Arrays2()).doGet(mA1, mB1);
		(new Arrays3()).doGet(mA1, mB1);
		(new Arrays4()).doGet(mA1, mB1);
		(new Arrays5()).doGet(mA1, mB1);
		(new Arrays6()).doGet(mA1, mB1);
		(new Arrays7()).doGet(mA1, mB1);
		(new Arrays8()).doGet(mA1, mB1);
		(new Arrays9()).doGet(mA1, mB1);
		(new Arrays10()).doGet(mA1, mB1);
	}

}
