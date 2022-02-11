package securibench.micro.pred;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import securibench.micro.*;
public class pred_Harness{

	public void show(HttpServletRequest mA1,HttpServletResponse mB1) throws IOException {
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
