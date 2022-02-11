package securibench.micro.reflection;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import securibench.micro.*;
public class reflection_Harness{

	public void show(HttpServletRequest mA1,HttpServletResponse mB1) throws IOException {
		//(new Sanitizers1()).doGet(mA, mB);
		(new Refl1()).doGet(mA1, mB1);
		(new Refl2()).doGet(mA1, mB1);
		(new Refl3()).doGet(mA1, mB1);
		(new Refl4()).doGet(mA1, mB1);
		
	}
}
