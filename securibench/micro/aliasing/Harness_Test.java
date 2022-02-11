package securibench.micro.aliasing;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import securibench.micro.A;
import securibench.micro.B;

public class Harness_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HttpServletRequest mA1=new A();
		HttpServletResponse  mB1=new B();
		(new Aliasing1()).doGet(mA1, mB1);
		(new Aliasing2()).doGet(mA1, mB1);
		(new Aliasing3()).doGet(mA1, mB1);
		(new Aliasing4()).doGet(mA1, mB1);
		(new Aliasing5()).doGet(mA1, mB1);
		(new Aliasing6()).doGet(mA1, mB1);
	}

}
