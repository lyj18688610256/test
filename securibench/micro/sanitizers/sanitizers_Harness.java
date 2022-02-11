package securibench.micro.sanitizers;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import securibench.micro.*;
public class sanitizers_Harness{

	public void show(HttpServletRequest mA1,HttpServletResponse mB1) throws IOException {
		//(new Sanitizers1()).doGet(mA, mB);
		(new Sanitizers1()).doGet(mA1, mB1);
		(new Sanitizers2()).doGet(mA1, mB1);
		(new Sanitizers3()).doGet(mA1, mB1);
//		(new Sanitizers4()).doGet(mA1, mB1);
		(new Sanitizers5()).doGet(mA1, mB1);
		(new Sanitizers6()).doGet(mA1, mB1);
	}
}
