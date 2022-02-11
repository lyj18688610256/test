package securibench.micro.factories;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import securibench.micro.*;
public class factories_Harness{

	public void show(HttpServletRequest mA1,HttpServletResponse mB1) throws IOException {
		//(new Sanitizers1()).doGet(mA, mB);
		(new Factories1()).doGet(mA1, mB1);
		(new Factories2()).doGet(mA1, mB1);
		(new Factories3()).doGet(mA1, mB1);
		
	}
}
