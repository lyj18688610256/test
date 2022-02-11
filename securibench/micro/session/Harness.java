package securibench.micro.session;
import java.io.IOException;
import securibench.micro.*;
public class Harness {

	public static void main(String[] args) throws IOException {
		A mA1=new A();
		B mB1=new B();
		//(new Sanitizers1()).doGet(mA, mB);
		(new Session1()).doGet(mA1, mB1);
		(new Session2()).doGet(mA1, mB1);
		(new Session3()).doGet(mA1, mB1);
	}
}
