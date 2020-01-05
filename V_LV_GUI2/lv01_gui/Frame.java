package lv01_gui;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame
{	
	private static final long serialVersionUID = 1L;
	private int def_w = 320;
	private int def_h = 250;
	
	JButton Bt_pal = new JButton ("Palindrome?");	
	JTextField TF_input = new JTextField();
	JTextField TF_output = new JTextField();
	JLabel L_word = new JLabel ("Word:  ");
	JLabel L_resp = new JLabel ("Response:  ");
	
	public Frame() {
		super();
		Init();
	}
	
	public void Init(){
		this.setSize(def_w, def_h);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Palindrome Test");
		
		Container content = getContentPane();		
		content.setLayout(new GridLayout(0,1));
		
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER,5,15));		
		panel1.add(L_word);
		TF_input.setPreferredSize(new Dimension(150,25));
		panel1.add(TF_input);	
		content.add(panel1);
		
		JPanel panel2=new JPanel(new FlowLayout(FlowLayout.CENTER,5,15));
		panel2.add(Bt_pal);
		Bt_pal.setPreferredSize(new Dimension(110,25));
		Bt_pal.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e) {
				String s = TF_input.getText();
				String empty = "";
				if(empty.equalsIgnoreCase(s))
					TF_output.setText("Please enter word to test");
				else
				TF_output.setText(" " + palindrome(s));
			}
		});
		content.add(panel2);
		
		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER,5,15));		
		panel3.add(L_resp);
		TF_output.setPreferredSize(new Dimension(150,25));
		TF_output.setEditable(false);
		panel3.add(TF_output);	
		content.add(panel3);		
		
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		setLocation((screenWidth - def_w)/ 2, (screenHeight - def_h) / 2);		
	}
	
	static boolean palindrome(String t)
	{
		StringBuffer s = new StringBuffer(t);
		s.reverse();
		String s1 = new String (s);		
		boolean test = false;		
		test = s1.equalsIgnoreCase(t);
		return test;		
	}
}
