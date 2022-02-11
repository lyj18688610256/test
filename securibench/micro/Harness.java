package securibench.micro;
import securibench.micro.aliasing.*;
import securibench.micro.arrays.*;
import securibench.micro.basic.*;
import securibench.micro.collections.*;
import securibench.micro.datastructures.*;
import securibench.micro.factories.*;
import securibench.micro.inter.*;
import securibench.micro.pred.*;
import securibench.micro.reflection.*;
import securibench.micro.sanitizers.*;
import securibench.micro.session.*;
import securibench.micro.strong_updates.*;
import java.io.IOException;
import securibench.micro.*;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
public class Harness {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		HttpServletRequest mA1=new A();
		HttpServletResponse mB1=new B();
		//(new Sanitizers1()).doGet(mA, mB);
		(new aliasing_Harness()).show(mA1,mB1);
		(new arrays_Harness()).show(mA1,mB1);
		(new basic_Harness()).show(mA1,mB1);
		(new collections_Harness()).show(mA1,mB1);
		(new datastructures_Harness()).show(mA1,mB1);
		(new factories_Harness()).show(mA1,mB1);
		(new inter_Harness()).show(mA1,mB1);
		(new pred_Harness()).show(mA1,mB1);
		(new reflection_Harness()).show(mA1,mB1);
		(new sanitizers_Harness()).show(mA1,mB1);
		(new session_Harness()).show(mA1,mB1);
		(new strong_updates_Harness()).show(mA1,mB1);
	}
}
