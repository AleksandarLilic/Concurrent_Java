package threads_dz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameStopwatch extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private int def_w = 250;
	private int def_h = 220;
	public boolean flagS;
	public boolean flagP;
	
	JButton Bt_start = new JButton ("Start");
	JButton Bt_stop = new JButton ("Stop");
	JButton Bt_pause = new JButton ("Pause");
	
	JLabel Lout = new JLabel ("Press Start", SwingConstants.CENTER);
	
	Stopwatch s1 = new Stopwatch(Lout);
	
	public FrameStopwatch(){
		super();
		Init();
	}
	
	public void Init(){
		this.setSize(def_w, def_h);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Counting Thread");
		
		Container content = getContentPane();
		//content.setLayout(new FlowLayout(FlowLayout.LEFT,5,15));
		content.setLayout(new GridLayout(0,1));

		Font f = Lout.getFont();
		String s = ""+f;
		Lout.setFont(new Font(s, Font.PLAIN, 20));
		
		content.add(Lout);
		
		JPanel p1 = new JPanel(new GridLayout(1,3,10,0));
		p1.add(Bt_start);
		p1.add(Bt_stop);
		p1.add(Bt_pause);
		
		content.add(p1);
		
		
		Bt_start.addActionListener(new listenerOne(this));
		Bt_stop.addActionListener(new listenerOne(this));
		Bt_pause.addActionListener(new listenerOne(this));
	}

}

class listenerOne implements ActionListener{
	FrameStopwatch frame;
	
	public listenerOne(FrameStopwatch f)
	{
		frame = f;
	}
	
	public void actionPerformed(ActionEvent aE)
	{
		if(aE.getSource() == frame.Bt_start){
			frame.s1.flagStart();
			Runnable th1 = new Thread(frame.s1);
			new Thread(th1).start();
		}
		else if(aE.getSource() == frame.Bt_stop){
			frame.s1.flagStop();
		}
		else if(aE.getSource() == frame.Bt_pause){
			frame.s1.flagPause();
		}
	}
}




