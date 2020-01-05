package threads_lv;
import java.awt.event.*;

class ActionStopThread implements ActionListener {

	private boolean flag;
	
	public ActionStopThread(boolean f)
	{
		flag = f;
	}
	
	
	public void actionPerformed(ActionEvent event) {
		flag = false;		
	}

}