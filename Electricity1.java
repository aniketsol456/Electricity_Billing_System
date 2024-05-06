import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class Electricity1 extends JFrame
{
	Label lblyourbill,lblName,lblMiddleName,lblSurname,lblNumber,lblMeter,lblcity,lblUnit,lblAddress,lblTotal;
	TextField txtName,txtMiddileName,txtSurname,txtNumber,txtMeter,txtUnit,txtAddress,txtTotal;
	Button btnnext,btnback;
	MyActionListener fm1 = new MyActionListener(this);
	Electricity1()
	{
		super("ELECTRICITY BILLING SYSTEM");
		setLayout(null);
		setBounds(0,0,1000,1000);
		setContentPane(new JLabel(new ImageIcon("C:\\ICT(Sem - 2)\\Object_Oriented_Pragramming\\OOP Project\\Pgvcl3.jpeg")));
		
		lblyourbill = new Label("Your Bill Detail");
		lblName = new Label("Name");
		lblMiddleName = new Label("Middlename");
		lblSurname = new Label("Surname");
		lblNumber = new Label("Number");
		lblMeter = new Label("Meter No.");
		lblUnit = new Label("Unit");
		lblAddress = new Label("Address");
		lblTotal = new Label("Total");
		txtName = new TextField();
		txtMiddileName = new TextField();
		txtSurname = new TextField();
		txtNumber = new TextField();
		txtMeter = new TextField();
		txtUnit = new TextField();
		txtAddress = new TextField();
		txtTotal = new TextField();
		btnnext = new Button("Next");
		btnback = new Button("Back");
		
		Font f1 =  new Font("Times",Font.BOLD,25);
		lblyourbill.setFont(f1);
		lblName.setFont(f1);
		lblMiddleName.setFont(f1);
		lblSurname.setFont(f1);
		lblNumber.setFont(f1);
		lblMeter.setFont(f1);
		lblUnit.setFont(f1);
		lblAddress.setFont(f1);
		lblTotal.setFont(f1);
		txtName.setFont(f1);
		txtMiddileName.setFont(f1);
		txtSurname.setFont(f1);
		txtNumber.setFont(f1);
		txtMeter.setFont(f1);
		txtUnit.setFont(f1);
		txtAddress.setFont(f1);
		txtTotal.setFont(f1);
		btnnext.setFont(f1);
		btnback.setFont(f1);

		add(lblyourbill);
		add(lblName);
		add(lblMiddleName);
		add(lblSurname);
		add(lblNumber);
		add(lblMeter);
		add(lblUnit);
		add(lblAddress);
		add(lblTotal);
		add(txtName);
		add(txtMiddileName);
		add(txtSurname);
		add(txtNumber);
		add(txtMeter);
		add(txtUnit);
		add(txtAddress);
		add(txtTotal);
		add(btnnext);
		add(btnback);
		
		lblyourbill.setBounds(400,100,250,50);
		lblName.setBounds(100,160,150,50);
		lblMiddleName.setBounds(100,220,200,50);
		lblSurname.setBounds(100,280,150,50);
		lblNumber.setBounds(100,340,150,50);
		lblMeter.setBounds(100,400,150,50);
		lblUnit.setBounds(100,460,150,50);
		lblAddress.setBounds(100,520,150,50);
		lblTotal.setBounds(100,580,150,50);
		txtName.setBounds(350,160,500,50);
		txtMiddileName.setBounds(350,220,500,50);
		txtSurname.setBounds(350,280,500,50);
		txtNumber.setBounds(350,340,500,50);
		txtMeter.setBounds(350,400,500,50); 
		txtUnit.setBounds(350,460,500,50);
		txtAddress.setBounds(350,520,500,50);
		txtTotal.setBounds(350,580,500,50);
		btnnext.setBounds(400,800,250,50);
		btnback.setBounds(200,800,150,50);
		btnnext.addActionListener(fm1);
		btnback.addActionListener(fm1);
		
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
				Electricity1 fm1 = new Electricity1();
				fm1.setVisible(true);
		}			
}