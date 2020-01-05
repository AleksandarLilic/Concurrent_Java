package threads_lv;

import javax.swing.JLabel;

public class NumThread implements Runnable
{
	private int num = 0;
	private JLabel text = new JLabel();
	public boolean flagStart = false;
	private boolean flagStop = false;
	public int period;
	
	NumThread(int p, JLabel t){
		text = t;
		period = p;
	}
	
	public boolean getFlagStart(){
		return flagStart;
	}
	
	public void run(){
		try{
			
			while(!flagStop){
				//System.out.println("flagStop loop, flag: " + flagStop);
				while(flagStart){
					System.out.println("flagStart loop, flag: " + flagStart);
					num++;
					if(num==10)
						num=1;
					text.setText(num+"");				
					System.out.println(num + " ");
					Thread.sleep (period);					
				}				
			}
		}
		catch (InterruptedException e){return;}
	}
}
