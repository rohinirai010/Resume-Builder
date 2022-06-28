package resume;

import javax.swing.*;

import resume.Login;
import resume.Signup;

import java.awt.event.*;
import java.awt.*;


public class LandingPage extends JFrame implements ActionListener{
	
   public JLabel l1;
   public JButton b1,b2;
   public Font f;
    
   public LandingPage() {
		f = new Font("SansSerif", Font.BOLD, 40);
		l1 = new JLabel("Resume Builder");
		l1.setFont(f);
		b1 = new JButton("LOGIN");
		b2 = new JButton("SIGN UP");
		
		l1.setBounds(30, 50, 400, 100);
		b1.setBounds(80,160,100,50);
		b2.setBounds(200,160,100,50);
		
		Color mycolor = new Color(3, 166,200,100);           //setting background color
		getContentPane().setBackground(mycolor);
		
		add(l1);
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setTitle("");
		setLayout(null);
		setSize(400,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
	}
   
	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getSource())==b1) {
			new Login();
		}
		else{
			new Signup();
		}
		
	}
}