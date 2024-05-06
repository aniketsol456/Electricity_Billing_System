import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class Index extends JFrame
{
	Button btn1,btn2;
	MyActionListener mf = new MyActionListener(this);
	Index()
	{
		super("HOME");
		setLayout(null);
		setVisible(true);
		setBounds(0,0,800,800);
		setContentPane(new JLabel(new ImageIcon("C:\\ICT(Sem - 2)\\Object_Oriented_Pragramming\\OOP Project\\Pgvcl.jpeg")));
		
		btn1 = new Button("Get Bill");
		btn2 = new Button("Close");
		
		Font f1 = new Font("Arial",Font.BOLD,25);
		btn1.setFont(f1);
		btn2.setFont(f1);
		
		add(btn1);
		add(btn2);
		
		btn1.setBounds(200,600,150,50);
		btn2.setBounds(400,600,150,50);
		
		btn1.addActionListener(mf);
		btn2.addActionListener(mf);
		
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
			Index mf = new Index();
			
	}
}
