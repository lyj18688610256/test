package securibench.micro.reflection;
import java.io.IOException;
import securibench.micro.*;
public class Harness {

	public static void main(String[] args) throws IOException {
		A mA1=new A();
		B mB1=new B();
		//(new Sanitizers1()).doGet(mA, mB);
		(new Refl1()).doGet(mA1, mB1);
		(new Refl2()).doGet(mA1, mB1);
		(new Refl3()).doGet(mA1, mB1);
		(new Refl4()).doGet(mA1, mB1);
	}
}
