package securibench.micro.aliasing;
import java.io.IOException;
import securibench.micro.*;
import securibench.micro.sanitizers.Sanitizers1;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
public class aliasing_Harness {

	public void show(HttpServletRequest mA1,HttpServletResponse mB1) throws IOException {
		// TODO Auto-generated method stub

		(new Aliasing1()).doGet(mA1, mB1);
		(new Aliasing2()).doGet(mA1, mB1);
		(new Aliasing3()).doGet(mA1, mB1);
		(new Aliasing4()).doGet(mA1, mB1);
		(new Aliasing5()).doGet(mA1, mB1);
		(new Aliasing6()).doGet(mA1, mB1);
	}
}
