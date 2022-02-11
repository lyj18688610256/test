package securibench.micro.arrays;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import securibench.micro.*;
public class arrays_Harness {

	public void show(HttpServletRequest mA1,HttpServletResponse mB1) throws IOException {
		// TODO Auto-generated method stub
		//(new Sanitizers1()).doGet(mA, mB);
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
