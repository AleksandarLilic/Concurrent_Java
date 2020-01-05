package input_form;
//import java.awt.Container;
//import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import java.awt.*;
//import javax.swing.JComboBox;

public class FrameF extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private JLabel Lprijava = new JLabel("  Prijava za ucesce na studentskom projektu ");
	
	// 1. Licni podaci:
	private JLabel Lime = new JLabel("Ime i prezime: ", SwingConstants.RIGHT);
	private JTextField TFime = new JTextField();
	private JTextField TFprezime = new JTextField();
	
	private JLabel Lpol = new JLabel("Pol: ", SwingConstants.RIGHT);
	private JRadioButton RBm = new JRadioButton("Muski");
	private JRadioButton RBz = new JRadioButton("Zenski");
	
	// 2. Podaci o studiranju:
	private JLabel Lindeks = new JLabel("Broj indeksa: ", SwingConstants.RIGHT);
	private JTextField TFindeks = new JTextField();
	
	private JLabel Lgodina = new JLabel("Godina studija: ", SwingConstants.RIGHT);
	String[] godina = { " I"," II", " III"," IV"," Master"};
	private JComboBox CBgodina = new JComboBox(godina);
	
	private JLabel Lstatus = new JLabel("Status: ", SwingConstants.RIGHT);
	private JRadioButton RBred = new JRadioButton("Redovni");
	private JRadioButton RBsam = new JRadioButton("Samofinansirajuci");
	
	// 3. Predznanja:
	private JLabel Lispit = new JLabel("Polozeni ispiti: ");
	
	private JCheckBox CBmat = new JCheckBox("Matematika");
	private JCheckBox CBprog = new JCheckBox("Programiranje");
	private JCheckBox CBmreze = new JCheckBox("Racunarske mreze");
	
	private JLabel Ldocs = new JLabel("Spisak svih do sada polozenih ispita sa ocenama dostavite u posebnom dokumentu: ");
	//browse
	private JFileChooser FCdocs = new JFileChooser();
	private JButton Bbrowse = new JButton("Browse");
	
	private JLabel Lprog = new JLabel("Poznavanje programiranja i WEB-a: ");
	String[] list_prog = { "HTML", "JavaScript", "PHP", "C"};
	private JList Liprog = new JList(list_prog);
	
	private JLabel Lrazlog = new JLabel("Obrazlozite vase motive za ucesce na projektu: ");
	private JTextArea TAmotiv = new JTextArea("test string test string test string test string test string");
	
	// 4. ID i Lozinka
	private JLabel LimeID = new JLabel("Korisnicno ime: ", SwingConstants.RIGHT);
	private JTextField TFimeID = new JTextField();
	private JLabel LpassID = new JLabel("Lozinka: ", SwingConstants.RIGHT);
	private JPasswordField PFpassID = new JPasswordField();
	private JLabel LpassIDr = new JLabel("Ponovite lozinku: ", SwingConstants.RIGHT);
	private JPasswordField PFpassIDr = new JPasswordField();
	
	// Buttons:
	private JButton Bsend = new JButton("Posalji");
	private JButton Bdel = new JButton("Obrisi");
	
	//Dimensions:
	int fw = 600;
	int pw = fw-16;
	int fh = 1000;
	int pgap = 45;
	private JLabel Lemp1 = new JLabel("  ");
	private JLabel Lemp2 = new JLabel("  ");
	private JLabel Lemp3 = new JLabel("  ");
	
	// Default Constructor
	public FrameF(){
		super();
		init();
	}
	
	private void init(){
		this.setSize(fw, fh);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Application Form for Project Participation");
		
		Container content = getContentPane();
		//content.setLayout(new GridLayout(0,1,15,15));
		content.setLayout(new FlowLayout(FlowLayout.LEFT,5,15));
		
		// 0. Prijava za ucesce
		initPrijava(content);		
		
		// 1. Licni podaci:
		initLpodaci(content);		
		
		// 2. Podaci o studiranju:
		initSpodaci(content);
		
		// 3. Predznanja:
		initPredznanja(content);
		
		// 4. ID i Lozinka:
		initID(content);
		
		// 5. Buttons
		initBttn(content);		
	}
	
	private void initPrijava(Container content){
		JPanel panel0 = new JPanel(new GridLayout(1,0));
		panel0.add(Lprijava);
		panel0.setPreferredSize(new Dimension(pw, 10));
		content.add(panel0);			
	}
	
	private void initLpodaci(Container content){
		JPanel panel1 = new JPanel(new GridLayout(2,0));
		panel1.setPreferredSize(new Dimension(pw, pgap*2));
		panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black, 1), "1. Licni podaci", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP));
		
		JPanel panel11 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		Lime.setPreferredSize(new Dimension (100,25));
		panel11.add(Lime);
		TFime.setPreferredSize(new Dimension(150,25));
		TFprezime.setPreferredSize(new Dimension(150,25));
		panel11.add(TFime);
		panel11.add(TFprezime);
		panel11.setSize(100, 100);
		panel1.add(panel11);
		
		JPanel panel12 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		Lpol.setPreferredSize(new Dimension (100,25));
		panel12.add(Lpol);
		RBm.setPreferredSize(new Dimension (65,20));
		RBz.setPreferredSize(new Dimension (65,20));
		panel12.add(RBm);		
		panel12.add(RBz);
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(RBm);
		bg1.add(RBz);
		panel1.add(panel12);
		
		content.add(panel1);
	}
	
	private void initSpodaci(Container content){
		JPanel panel2 = new JPanel(new GridLayout(0,1));
		panel2.setPreferredSize(new Dimension(pw, pgap*3));
		panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black, 1), "2. Podaci o studiranju", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP));
		
		JPanel panel21 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		Lindeks.setPreferredSize(new Dimension (100,25));
		panel21.add(Lindeks);
		TFindeks.setPreferredSize(new Dimension (80,25));
		panel21.add(TFindeks);
		panel2.add(panel21);
		
		JPanel panel22 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		Lgodina.setPreferredSize(new Dimension (100,25));
		panel22.add(Lgodina);
		CBgodina.setPreferredSize(new Dimension(78,25));
		panel22.add(CBgodina);
		panel2.add(panel22);
		
		JPanel panel23 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		Lstatus.setPreferredSize(new Dimension (100,25));
		panel23.add(Lstatus);
		panel23.add(RBred);
		panel23.add(RBsam);
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(RBred);
		bg2.add(RBsam);
		panel2.add(panel23);		
		
		content.add(panel2);
	}
	
	private void initPredznanja(Container content){
		//JPanel panel3 = new JPanel(new GridLayout(4,0));
		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		panel3.setPreferredSize(new Dimension(pw, pgap*10));
		panel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black, 1), "3. Predznanja", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP));				
		JPanel panel31 = new JPanel(new GridLayout(0,1,5,5));
		//panel31.setPreferredSize(new Dimension (pw-15, pgap));
		Lispit.setPreferredSize(new Dimension (pw-15, pgap/2));
		panel31.add(Lispit);
		panel3.add(panel31);
		//checkbox
		JPanel panel312 = new JPanel(new GridLayout(0,1,5,5));
		panel312.setPreferredSize(new Dimension(pw/4, 60));
		panel312.add(CBmat);
		panel312.add(CBprog);
		panel312.add(CBmreze);
		//panel312.add(Lemp);
		
		panel3.add(panel312);
		Lemp1.setPreferredSize(new Dimension (pw-15, 10));
		panel3.add(Lemp1);
		
		JPanel panel32 = new JPanel(new GridLayout(0,1,5,5));
		Ldocs.setPreferredSize(new Dimension (pw-15, pgap/2));
		panel32.add(Ldocs);
		panel3.add(panel32);
		//browse
		JPanel panel322 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		//panel322.setPreferredSize(new Dimension(50, 20));
		panel322.add(Bbrowse);
		//Bbrowse.setpre
		panel3.add(panel322);
		//private JButton Bbrowse = new JButton("Browse");
		Lemp2.setPreferredSize(new Dimension (pw-15, 10));
		panel3.add(Lemp2);
		
		JPanel panel33 = new JPanel(new GridLayout(0,1,5,5));
		panel33.add(Lprog);
		Lprog.setPreferredSize(new Dimension (pw-15, pgap/2));
		panel3.add(panel33);
		//list pick
		JPanel panel332 = new JPanel(new GridLayout(0,1,5,5));
		panel332.setPreferredSize(new Dimension(80, 72));
		//Liprog.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		panel332.add(Liprog);
		panel3.add(panel332);
		Lemp3.setPreferredSize(new Dimension (pw-15, 10));
		panel3.add(Lemp3);
		
		JPanel panel34 = new JPanel(new GridLayout(0,1,5,5));
		//JPanel panel34 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		//JPanel panel34 = new JPanel(new BorderLayout());
		//panel31.setPreferredSize(new Dimension (pw, pgap));
		panel34.setPreferredSize(new Dimension(pw-15, pgap/2));
		//panel34.setMaximumSize(new Dimension(pw, 100));
		//Lrazlog.setPreferredSize(new Dimension (pw-20, 0));
		//Lrazlog.setSize(pw, 20);
		panel34.add(Lrazlog);
		//panel34.add(Lrazlog, BorderLayout.NORTH);
		//TAmotiv.setPreferredSize(new Dimension (250,20));
		//TAmotiv.setSize(250,20);
		panel3.add(panel34);
		
		JPanel panel342 = new JPanel(new GridLayout(0,1,5,5));
		panel342.setPreferredSize(new Dimension(350, 72));
		TAmotiv.setLineWrap(true);
		TAmotiv.setWrapStyleWord(true);
		JScrollPane sp1 = new JScrollPane(TAmotiv);		
		sp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp1.setPreferredSize(new Dimension(120, 40));
		panel342.add(sp1);
		//panel34.add(sp1, BorderLayout.SOUTH);
		panel3.add(panel342);
		
		
		content.add(panel3);

	}
	
	private void initID(Container content){
		JPanel panel4 = new JPanel(new GridLayout(3,0));
		panel4.setPreferredSize(new Dimension(pw, pgap*3));
		panel4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black, 1), "4. ID i Lozinka", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP));
		
		JPanel panel41 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		LimeID.setPreferredSize(new Dimension (100,25));
		panel41.add(LimeID);
		TFimeID.setPreferredSize(new Dimension (120,25));
		panel41.add(TFimeID);
		panel4.add(panel41);
		
		JPanel panel42 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		LpassID.setPreferredSize(new Dimension (100,25));
		panel42.add(LpassID);
		PFpassID.setPreferredSize(new Dimension(120,25));
		panel42.add(PFpassID);
		panel42.setLocation(525, 525);
		panel4.add(panel42);
		
		JPanel panel43 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		LpassIDr.setPreferredSize(new Dimension (100,25));
		panel43.add(LpassIDr);
		PFpassIDr.setPreferredSize(new Dimension(120,25));
		panel43.add(PFpassIDr);
		panel4.add(panel43);		
		
		content.add(panel4);
	}
	
	private void initBttn(Container content){
		JPanel panel5 = new JPanel(new GridLayout(0,1));
		panel5.setPreferredSize(new Dimension(pw, pgap));
		
		JPanel panel51 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		
		panel51.add(Bsend);
		panel51.add(Bdel);
		panel5.add(panel51);
		
		content.add(panel5);
		
	}
}
