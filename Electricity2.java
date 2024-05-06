import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class Electricity2 extends JFrame
{
	Label lblpayment;
	JComboBox cb1;
	Button btn1,btn2;
	MyActionListener fm2 = new MyActionListener(this);
	Electricity2()
	{
		super("ELECTRICITY BILLING SYSTEM");
		setLayout(null);
		setBounds(0,0,1000,1000);
		setContentPane(new JLabel(new ImageIcon("C:\\ICT(Sem - 2)\\Object_Oriented_Pragramming\\OOP Project\\Pgvcl4.jpeg")));
		
		lblpayment = new Label("Payment Process");
		String[] choice = {"QR CODE"};
		cb1 = new JComboBox(choice);
		btn1 = new Button("BACK");
		btn2 = new Button("PAY");
		
		Font f1 =  new Font("Times",Font.BOLD,25);
		Font f2 =  new Font("Times",Font.BOLD,50);
		lblpayment.setFont(f1);
		cb1.setFont(f2);
		btn1.setFont(f1);
		btn2.setFont(f1);
		
		add(lblpayment);
		add(cb1);
		add(btn1);
		add(btn2);
		
		lblpayment.setBounds(400,100,250,50);
		cb1.setBounds(200,400,600,50);
		btn1.setBounds(200,800,150,50);
		btn2.setBounds(400,800,150,50);
		btn1.addActionListener(fm2);
		btn2.addActionListener(fm2);
		
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
		Electricity2 fm2 = new Electricity2();
		fm2.setVisible(true);
	}	
}