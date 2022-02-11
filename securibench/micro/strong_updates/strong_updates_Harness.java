package securibench.micro.strong_updates;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import securibench.micro.*;
public class strong_updates_Harness{

	public void show(HttpServletRequest mA1,HttpServletResponse mB1) throws IOException {
		//(new Sanitizers1()).doGet(mA, mB);
		(new StrongUpdates1()).doGet(mA1, mB1);
		(new StrongUpdates2()).doGet(mA1, mB1);
		(new StrongUpdates3()).doGet(mA1, mB1);
		(new StrongUpdates4()).doGet(mA1, mB1);
		(new StrongUpdates5()).doGet(mA1, mB1);
		
	}
}
