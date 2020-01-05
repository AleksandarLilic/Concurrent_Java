package threads_dz;

import javax.swing.JLabel;

public class Stopwatch extends Thread{
	
	private int t = 0;
	private int s = 0;
	private int m = 0;
	private int h = 0;
	private boolean stop = true;
	private boolean pause = true;
	private String time;
	private static int period = 100;
	
	private JLabel Lnum = new JLabel();
	
	public Stopwatch(JLabel l){
		Lnum = l;
	}
	
	public void flagStart(){
		stop = false;
		pause = false;
	}
	
	public void flagStop(){
		stop = true;
		t = 0;
		s = 0;
		m = 0;
		h = 0;
	}
	
	public void flagPause(){
		pause = true;
	}
	
	public void run(){
		try{
			while(!stop){
				//sleep(period);
				//System.out.println(time);
				if(!pause){
					//System.out.println(time + " test");
					t++;
					if(t == 10){
						t = 0;
						s++;
						if(s == 60){
							s = 0;
							m++;
						}
						if(m == 60){
							m = 0;
							h++;
						}
					}
					time = h + ":" + m + ":" + s + "." + t;
					Lnum.setText(time);		
					//sleep (period);
				}
				sleep (period);
			}
		}
		catch (InterruptedException e){return;}		
	}
}
