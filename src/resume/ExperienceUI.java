package resume;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import resume.SavedResume;

public class ExperienceUI extends JFrame implements ActionListener{
	   public String Name, DOB, FatherName,MotherName, Nationality,email,PhoneNo,School,College,University,SchoolFrom,SchoolTo,CollegeFrom,CollegeTo,UniversityFrom,UniversityTo,imagePath,English,German,Hindi,French;
       public JLabel l,l1,l2,l3,l4;
       public JTextField t1,t2,t3;
       public JComboBox j1;
       public JButton b1;
       public Font f;
       
	
	public ExperienceUI(String Name,String DOB,String FatherName,String MotherName,String Nationality,String email, String PhoneNo, String School,String College,String University,String SchoolFrom,String SchoolTo,String CollegeFrom, String CollegeTo, String UniversityFrom, String UniversityTo, String imagePath,String English, String German, String French, String Hindi) {
		  this.Name = Name;
		  this.DOB = DOB;
		  this.FatherName = FatherName;
		  this.MotherName = MotherName;
		  this.Nationality = Nationality;
		  this.email = email;
		  this.PhoneNo = PhoneNo;
		  this.School = School;
		  this.College = College;
		  this.University = University;
		  this.SchoolFrom = SchoolFrom;
		  this.SchoolTo = SchoolTo;
		  this.CollegeFrom = CollegeFrom;
		  this.CollegeTo = CollegeTo;
		  this.UniversityFrom = UniversityFrom;
		  this.UniversityTo = UniversityTo;
		  this.imagePath = imagePath;
		  this.English = English;
		  this.German = German;
		  this.French = French;
		  this.Hindi = Hindi;
		
		  f = new Font("SansSerif", Font.BOLD, 20);
		  l = new JLabel("Experience And Skills");
		  l.setFont(f);
		  l1 = new JLabel("Company");
		  l2 = new JLabel("Designation");
		  l3 = new JLabel("Salary");
		  l4 = new JLabel("Years");
		
		  t1 = new JTextField();
		  t2 = new JTextField();
		  t3 = new JTextField();
		  j1 = new JComboBox();
		  for(int i=0;i<=30;i++) {
			  j1.addItem(i);
		  }
		  b1 = new JButton("Save");
		
		  l.setBounds(150, 10, 250,50);
		  l1.setBounds(50, 90, 250,40);
		  l2.setBounds(50, 130, 250,40);
		  l3.setBounds(50, 170, 250,40);
		  l4.setBounds(50,210,250,40);
		  t1.setBounds(150, 90, 200,40);
		  t2.setBounds(150, 130, 200,40);
		  t3.setBounds(150, 170, 200,40);
		  j1.setBounds(150,210,100,40);
		  b1.setBounds(300,300, 100,50);
		  
		  Color mycolor = new Color(3, 166,200,100);           //setting background color
		  getContentPane().setBackground(mycolor);
		  
		  add(l);
		  add(l1);
		  add(l2);
		  add(l3);
		  add(l4);
		  add(t1);
		  add(t2);
		  add(t3);
		  add(j1);
		  add(b1);
		  b1.addActionListener(this);
		
		  setLayout(null);
	 	  setVisible(true);
	 	  setResizable(false);
		  setSize(640,400);
		  setLocationRelativeTo(null);
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

    @Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Saved your details");
		new SavedResume(Name, DOB, FatherName, Nationality,email,PhoneNo,School,College,University,SchoolFrom,SchoolTo,CollegeFrom,CollegeTo,UniversityFrom,UniversityTo,t1.getText(), t2.getText(),t3.getText(),j1.getSelectedItem().toString(),imagePath,English,German,French,Hindi);
		
	}
}
