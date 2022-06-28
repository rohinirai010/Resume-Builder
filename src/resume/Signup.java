package resume;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import resume.Login;

public class Signup extends JFrame implements ActionListener{
     
     public JLabel l,l1,l2,l3,l4,l5,l6,l7;
     public JTextField t1,t4;
     public JPasswordField t2,t3;
     public JRadioButton b1,b2,b3;
     public ButtonGroup bg = new ButtonGroup();
     public JButton b4;
     public Font f;
      
     public Signup(){
    	
  		
    	f = new Font("SansSerif", Font.BOLD, 20);
 		l = new JLabel("SIGN UP");
 		l.setFont(f);
 		l1=new JLabel("Username");
 		l2=new JLabel("Password");
 		l3=new JLabel("Confirm Password");
 		l4=new JLabel("Mobile No");
 		l5=new JLabel("Gender");
 		l6 = new JLabel("");
 		l7 = new JLabel("");
 		ImageIcon signupIcon = new ImageIcon("signup.png");
		Image scaledSignupImage = signupIcon.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
		l7=new JLabel(new ImageIcon(scaledSignupImage));
 		t1=new JTextField();
 		t2=new JPasswordField();
 		t3=new JPasswordField();
 		t4=new JTextField();
 		b1=new JRadioButton("Male");
 		b2=new JRadioButton("Female");
 		b3=new JRadioButton("Others");
 		b4=new JButton("Sign Up");
 		
 		bg.add(b1);
 		bg.add(b2);
 		bg.add(b3);
 		
 		l.setBounds(100, 10, 100, 100);
 		l1.setBounds(50,110,100,40);
 		l2.setBounds(50,155,100,40);
 		l3.setBounds(50,200,200,40);
 		l4.setBounds(50,245,100,40);
 		l5.setBounds(50,290,100,40);
 		l6.setBounds(120,10,300,150);
 		l7.setBounds(25,10,100,100);
 		t1.setBounds(200,110,200,40);
 		t2.setBounds(200,155,200,40);
 		t3.setBounds(200,200,200,40);
 		t4.setBounds(200,245,200,40);
 		b1.setBounds(200,290,100,20);
 		b2.setBounds(200,315,100,20);
 		b3.setBounds(200,340,100,20);
 		b4.setBounds(200,380,100,50);
 		Color mycolor = new Color(3, 166,200,100);           //setting background color
		getContentPane().setBackground(mycolor);
 		
 		b4.addActionListener(this);
 		
 		add(b4);
 		add(b1);
 		add(b2);
 		add(b3);
 		add(l);
 		add(l1);
 		add(l2);
 		add(l3);
 		add(l4);
 		add(l5);
 		add(l6);
 		add(l7);
 		add(t1);
 		add(t2);
 		add(t3);
 		add(t4);
		
		
		
		setTitle("");
  		setSize(500,500);
  		setLocationRelativeTo(null);
  		setResizable(false);
  		setLayout(null);
  		setVisible(true);
  		 
      }

	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = new String(t2.getPassword());
		String s2 = new String(t3.getPassword());
		if(s1.equals(s2) && !t1.getText().isEmpty() && !t4.getText().isEmpty()) {
			String fileName = "rohini.txt"+ t1.getText().trim()+ ".txt";
			try {
				File f = new File(fileName);
				FileWriter writer = new FileWriter(f);
				writer.write(s1);
				writer.close();
			}catch(Exception s){System.out.println(s);}
			new Login();
		}else 
		if(t1.getText().isEmpty() || t4.getText().isEmpty()){
			JOptionPane optionPane = new JOptionPane(l6,JOptionPane.WARNING_MESSAGE);
		    optionPane.showMessageDialog(l6,"Fill the above details");  
		}
		
	}
      
      
}
