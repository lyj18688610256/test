package securibench.micro.session;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import securibench.micro.*;
public class session_Harness{

	public void show(HttpServletRequest mA1,HttpServletResponse mB1) throws IOException {
		//(new Sanitizers1()).doGet(mA, mB);
		(new Session1()).doGet(mA1, mB1);
		(new Session2()).doGet(mA1, mB1);
		(new Session3()).doGet(mA1, mB1);
		
	}
}
