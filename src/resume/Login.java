package resume;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.*;

import resume.ResumeUI;


public class Login extends JFrame implements ActionListener {
	
	public JLabel l,l1,l2,l3,l4;
	public JTextField t1;
	public JPasswordField t2;
	public JButton b1;
	public Font f;
	
	
	public Login(){
		
		f = new Font("SansSerif", Font.BOLD, 20);
		l = new JLabel("LOGIN");
		l.setFont(f);
		l1 = new JLabel("USERNAME");
		l2 = new JLabel("PASSWORD");
		l3 = new JLabel("");
		t1 = new JTextField();
		t2 = new JPasswordField();
		l4=new JLabel("");
		ImageIcon loginIcon = new ImageIcon("logo (2).png");
		Image scaledloginImage = loginIcon.getImage().getScaledInstance(60, 60,Image.SCALE_DEFAULT);
		l4=new JLabel(new ImageIcon(scaledloginImage));
		b1 = new JButton("LOGIN");
		
		l.setBounds(180, 1, 100, 100);
		l1.setBounds(50,100,100,40);
		l2.setBounds(50,150,100,40);
		l3.setBounds(160,5,300,150);
		l4.setBounds(120,10,80,80);
		t1.setBounds(150,100,200,40);
		t2.setBounds(150,150,200,40);
		b1.setBounds(160,200,100,50);
		Color mycolor = new Color(3, 166,200,100);           //setting background color
		getContentPane().setBackground(mycolor);
	
		
		b1.addActionListener(this);
		
		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(b1);
		add(t1);
		add(t2);
	
		setTitle("LoginForm");
		
		setTitle("");
		setSize(400,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			try {
				String fileName = "rohini.txt"+ t1.getText().trim()+ ".txt";
				File f = new File(fileName);
				Scanner s = new Scanner(f);
				String pass = s.next();
				s.close();
				if(f.exists()) {
					String password = new String(t2.getPassword());
					if(password.equals(pass)) {
						new ResumeUI();
					}else {
						JOptionPane optionPane = new JOptionPane(l3,JOptionPane.WARNING_MESSAGE);
					    optionPane.showMessageDialog(l3,"Please provide a valid username and password.");
					}
				}
			}catch(Exception w) {
				System.out.println(w);
				JOptionPane optionPane = new JOptionPane(l3,JOptionPane.WARNING_MESSAGE);
			    optionPane.showMessageDialog(l3,"Please provide a valid username and password.");
			}
		}
	}
}
