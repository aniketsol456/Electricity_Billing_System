import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class Electricity3 extends JFrame
{
	MyActionListener fm3 = new MyActionListener(this);
	Electricity3()
	{
		super("QR CODE");
		setLayout(null);
		setBounds(0,0,400,400);
		setContentPane(new JLabel(new ImageIcon("C:\\ICT(Sem - 2)\\Object_Oriented_Pragramming\\OOP Project\\Pgvcl5.jpeg")));
		
	addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					dispose();
				}
			});
	}
	public static void main(String args[])
	{
		Electricity3 fm3 = new Electricity3();
		fm3.setVisible(true);
	}	
}

