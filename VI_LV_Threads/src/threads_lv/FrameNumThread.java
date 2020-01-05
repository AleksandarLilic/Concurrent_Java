package threads_lv;
import javax.swing.*;
import java.awt.*;

public class FrameNumThread extends JFrame
{
	private static final long serialVersionUID = 1L;
	private int def_w = 250;
	private int def_h = 250;
	public boolean flag;
	
	JButton Bt_start = new JButton ("Start");
	JButton Bt_stop = new JButton ("Stop");
	JLabel TF_out = new JLabel ("1 - 9", SwingConstants.CENTER);
	JLabel TF_outS = new JLabel ("Stop Label", SwingConstants.CENTER);
	
	public FrameNumThread(){
		super();
		Init();
	}
	
	public void storeFlag(boolean f){
		flag = f;
		System.out.println("storeFlag func loop, flag: " + flag);
	}
	
	public void Init(){
		this.setSize(def_w, def_h);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Counting Thread");
		
		Container content = getContentPane();
		//content.setLayout(new FlowLayout(FlowLayout.LEFT,5,15));
		content.setLayout(new GridLayout(0,1));
		
//		TF_out.setFont(new Font("Serif", Font.PLAIN, 16));
		Font f = TF_out.getFont();
		String s = ""+f;
		TF_out.setFont(new Font(s, Font.PLAIN, 20));
		//TF_out.getFont()
		
//		Bt_start.addActionListener(new java.awt.event.ActionListener(){
//			public void actionPerformed(java.awt.event.ActionEvent e) {
//				
//			}
//		});
		
		
//		Bt_stop.addActionListener(stopAction);
		
		ActionStartThread startAction = new ActionStartThread(flag);
		Bt_start.addActionListener(startAction);
		
		
		content.add(TF_out);
		content.add(TF_outS);
		content.add(Bt_start);
		content.add(Bt_stop);		
	}
	
	public void CountStop()
	{
		TF_outS.setText("Done!");
	}
	
	public JLabel GetLabel()
	{
		return TF_out;
	}
	
	//private void startAction()

}
