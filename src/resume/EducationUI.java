package resume;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import resume.ExperienceUI;

public class EducationUI extends JFrame implements ActionListener{
	  public String Name,DOB,FatherName,MotherName,Nationality,PhoneNo,email,imagePath;   
	  public JLabel l,l1,l2,l3,l4,l5,l6,l7,l8;
	  public JTextField t1,t2,t3;
	  public JComboBox j1,j2,j3,j4,j5,j6,j7,j8,j9,j10;
	  public JButton b1;
	  public Font f;
	  
	  public EducationUI(String Name , String DOB, String FatherName ,String  MotherName ,String Nationality ,String PhoneNo ,String email ,String imagePath) {
		  this.Name = Name;
		  this.DOB = DOB;
		  this.FatherName = FatherName;
		  this.MotherName = MotherName;
		  this.Nationality = Nationality;
		  this.PhoneNo =  PhoneNo;
		  this.email = email;
		  this.imagePath = imagePath;
		  
		  f = new Font("SansSerif", Font.BOLD, 20);
	 	  l = new JLabel("Education");
	 	  l.setFont(f);
	 	  l1 = new JLabel("School");
	 	  l2 = new JLabel("College");
	 	  l3 = new JLabel("University");
	 	  l4 = new JLabel("Time Period");
	 	  l5= new JLabel("English");
		  l6= new JLabel("German");
		  l7= new JLabel("Hindi");
		  l8= new JLabel("French");
	 	  t1 = new JTextField();
	 	  t2 = new JTextField();
	 	  t3 = new JTextField();
	 	  j1 = new JComboBox();
	 	  j2 = new JComboBox();
	 	  j3 = new JComboBox();
	 	  j4 = new JComboBox();
	 	  j5 = new JComboBox();
	      j6 = new JComboBox();
	      j7 = new JComboBox();
		  j8 = new JComboBox();
		  j9 = new JComboBox();
		  j10 = new JComboBox();
	      b1 = new JButton("Experience --->");
	      
	      for(int i=1950;i<=2050;i++) {
	    	  j1.addItem(i);
	      }
	      for(int i=1950;i<=2050;i++) {
	    	  j2.addItem(i);
	      }
	      for(int i=1950;i<=2050;i++) {
	    	  j3.addItem(i);
	      }
	      for(int i=1950;i<=2050;i++) {
	    	  j4.addItem(i);
	      }
	      for(int i=1950;i<=2050;i++) {
	    	  j5.addItem(i);
	      }
	      for(int i=1950;i<=2050;i++) {
	    	  j6.addItem(i);
	      }
	      for(int i=0;i<=100;i++){
		      j7.addItem(i);
		  }
		  for(int i=0;i<=100;i++){
		      j8.addItem(i);
		  }
		  for(int i=0;i<=100;i++){
		      j9.addItem(i);
		  }
		  for(int i=0;i<=100;i++){
		      j10.addItem(i);
		  }
	 	  
	 	  l.setBounds(260,10,250,20);
	 	  l1.setBounds(30,60,300,30);
	 	  l2.setBounds(30,110,300,30);
	 	  l3.setBounds(30,160,300,30);
	 	  l4.setBounds(450,30,250,20);
	 	  l5.setBounds(30,210,250,40);
		  l6.setBounds(30,260,250,40);
		  l7.setBounds(30,310,250,40);
		  l8.setBounds(30,360,250,40);
	 	  t1.setBounds(150,60,200,30);
	 	  t2.setBounds(150,110,200,30);
	 	  t3.setBounds(150,160,200,30);
	 	  j1.setBounds(400,60,80,25);
	 	  j2.setBounds(500,60,80,25);
	 	  j3.setBounds(400,110,80,25);
	 	  j4.setBounds(500,110,80,25);
	 	  j5.setBounds(400,160,80,25);
	 	  j6.setBounds(500,160,80,25);
	 	  j7.setBounds(150,210,100,30);
		  j8.setBounds(150,260,100,30);
		  j9.setBounds(150,310,100,30);
		  j10.setBounds(150,360,100,30);
	 	  b1.setBounds(400,300,200,50);
	 	  
	 	  Color mycolor = new Color(3, 166,200,100);           //setting background color
		  getContentPane().setBackground(mycolor);
	 	  
	 	  add(l);
	 	  add(l1);
	 	  add(l2);
	 	  add(l3);
	 	  add(l4);
	 	  add(l5);
	 	  add(l6);
	 	  add(l7);
	 	  add(l8);
	 	  add(t1);
	 	  add(t2);
	 	  add(t3);
	 	  add(j1);
	 	  add(j2);
	 	  add(j3);
	 	  add(j4);
	 	  add(j5);
	 	  add(j6);
	 	  add(j7);
	 	  add(j8);
	 	  add(j9);
	 	  add(j10);
	 	  add(b1);
	 	  b1.addActionListener(this);
	 	  
	 	  setLayout(null);
	 	  setVisible(true);
	 	  setResizable(false);
		  setSize(640,450);
		  setLocationRelativeTo(null);
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	  
	 }
	  
	  
	  @Override
		public void actionPerformed(ActionEvent e) {
			new ExperienceUI(Name, DOB, FatherName,MotherName, Nationality,email,PhoneNo,t1.getText(), t2.getText(),t3.getText(),j1.getSelectedItem().toString(),j2.getSelectedItem().toString(),j3.getSelectedItem().toString(),j4.getSelectedItem().toString(),j5.getSelectedItem().toString(),j6.getSelectedItem().toString(),imagePath,j7.getSelectedItem().toString(),j8.getSelectedItem().toString(),j9.getSelectedItem().toString(),j10.getSelectedItem().toString());
		}

}
