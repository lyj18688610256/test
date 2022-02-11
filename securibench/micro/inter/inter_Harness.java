package securibench.micro.inter;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import securibench.micro.*;
public class inter_Harness{

	public void show(HttpServletRequest mA1,HttpServletResponse mB1) throws IOException {
		//(new Sanitizers1()).doGet(mA, mB);
		(new Inter1()).doGet(mA1, mB1);
		(new Inter2()).doGet(mA1, mB1);
		(new Inter3()).doGet(mA1, mB1);
		(new Inter4()).doGet(mA1, mB1);
		(new Inter5()).doGet(mA1, mB1);
		(new Inter6()).doGet(mA1, mB1);
		(new Inter7()).doGet(mA1, mB1);
		(new Inter8()).doGet(mA1, mB1);
		(new Inter9()).doGet(mA1, mB1);
		(new Inter10()).doGet(mA1, mB1);
		(new Inter11()).doGet(mA1, mB1);
		(new Inter12()).doGet(mA1, mB1);
		(new Inter13()).doGet(mA1, mB1);
		(new Inter14()).doGet(mA1, mB1);
		
	}
}
