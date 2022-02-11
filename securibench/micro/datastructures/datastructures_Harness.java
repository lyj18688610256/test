package securibench.micro.datastructures;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import securibench.micro.*;
public class datastructures_Harness{

	public void show(HttpServletRequest mA1,HttpServletResponse mB1) throws IOException {

		(new Datastructures1()).doGet(mA1, mB1);
		(new Datastructures2()).doGet(mA1, mB1);
		(new Datastructures3()).doGet(mA1, mB1);
		(new Datastructures4()).doGet(mA1, mB1);
		(new Datastructures5()).doGet(mA1, mB1);
		(new Datastructures6()).doGet(mA1, mB1);
		
	}
}
