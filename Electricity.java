import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class Electricity extends JFrame
{
	JLabel lblcosnum;
	JTextField txt1;
	JButton btn1,btn2;
	MyActionListener fm = new MyActionListener(this);
	Electricity()
	{
		super("ELECTRICITY BILLING SYSTEM");
		setLayout(null);
		setVisible(true);
		setBounds(0,0,800,800);
		setContentPane(new JLabel(new ImageIcon("C:\\ICT(Sem - 2)\\Object_Oriented_Pragramming\\OOP Project\\Pgvcl2.jpeg")));
		
		lblcosnum = new JLabel("Customer Num :");
		txt1 = new JTextField( );
		btn1 = new JButton("BaCk");
		btn2 = new JButton("Search");
		
		Font f1 =  new Font("Times",Font.BOLD,25);  
		lblcosnum.setFont(f1);
		txt1.setFont(f1);
		btn1.setFont(f1);
		btn2.setFont(f1);
		
		lblcosnum.setForeground(Color.white);
		add(lblcosnum);
		add(txt1);
		add(btn1);
		add(btn2);
		
		lblcosnum.setBounds(100,200,250,50);
		txt1.setBounds(400,200,250,50);
		btn1.setBounds(300,600,150,50);
		btn2.setBounds(500,600,150,50);
		btn1.addActionListener(fm);
		btn2.addActionListener(fm);
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
		Electricity fm = new Electricity();
	}	
}
