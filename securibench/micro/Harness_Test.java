package securibench.micro;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import securibench.micro.aliasing.aliasing_Harness;
import securibench.micro.arrays.arrays_Harness;
import securibench.micro.basic.basic_Harness;
import securibench.micro.collections.collections_Harness;
import securibench.micro.datastructures.datastructures_Harness;
import securibench.micro.factories.factories_Harness;
import securibench.micro.inter.inter_Harness;
import securibench.micro.pred.pred_Harness;
import securibench.micro.reflection.reflection_Harness;
import securibench.micro.sanitizers.sanitizers_Harness;
import securibench.micro.session.session_Harness;
import securibench.micro.strong_updates.strong_updates_Harness;

public class Harness_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HttpServletRequest mA1=new A();
		HttpServletResponse mB1=new B();
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
