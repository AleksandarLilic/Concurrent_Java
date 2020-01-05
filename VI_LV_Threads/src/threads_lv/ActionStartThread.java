package threads_lv;
import java.awt.event.*;

class ActionStartThread implements ActionListener {

	public boolean flag;
	
	public ActionStartThread(boolean f)
	{
		flag = f;
		System.out.println("acton start constr, flag: " + flag);
	}
	
	
	public void actionPerformed(ActionEvent event) {
		flag = true;
		System.out.println("acton performed, flag: " + flag);		
	}

}