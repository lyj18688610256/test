package securibench.micro.pred;
import java.io.IOException;
import securibench.micro.*;
public class Harness {

	public static void main(String[] args) throws IOException {
		A mA1=new A();
		B mB1=new B();
		//(new Sanitizers1()).doGet(mA, mB);
		(new Pred1()).doGet(mA1, mB1);
		(new Pred2()).doGet(mA1, mB1);
		(new Pred3()).doGet(mA1, mB1);
		(new Pred4()).doGet(mA1, mB1);
		(new Pred5()).doGet(mA1, mB1);
		(new Pred6()).doGet(mA1, mB1);
		(new Pred7()).doGet(mA1, mB1);
		(new Pred8()).doGet(mA1, mB1);
		(new Pred9()).doGet(mA1, mB1);
	}
}
