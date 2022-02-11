package securibench.micro.collections;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import securibench.micro.*;
public class collections_Harness{

	public void show(HttpServletRequest mA1,HttpServletResponse mB1) throws IOException {
		//(new Sanitizers1()).doGet(mA, mB);
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
