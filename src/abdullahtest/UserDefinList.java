package abdullahtest;

import java.util.ArrayList;
import java.util.List;

public class UserDefinList {
	
	public static void main(String[] args) {
		
		AbdullahName a = new AbdullahName();
		a.setEmpName("java");
		a.setEmpID(12);
		
		AbdullahName a1 = new AbdullahName();
		a1.setEmpName("selenium");
		a1.setEmpID(13);
		
		List<AbdullahName> li = new ArrayList<AbdullahName>();
		li.add(a1);
		li.add(a);
		
		for (int i = 0; i < li.size(); i++) {
			
			System.out.println(li.get(i).getEmpID());
			System.out.println(li.get(i).getEmpName());
			
		}
		
	}

}
