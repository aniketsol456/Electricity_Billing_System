import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;

public class MyActionListener implements ActionListener
{
	String Name;
	String MiddleName;
	String Surname;
	String Number;
	String MeterNo;
	String Unit;
	String Address;
	String custNO;
	int count = 0;
	int data=0;
	
	MyActionListener(String a,String b,String c,String d,String e,String f,String g,String h)
	{
		this.Name = a;
		this.MiddleName = b;
		this.Surname = c;
		this.Number = d;
		this.MeterNo = e;
		this.Unit=f;
		this.Address=g;
		this.custNO = h;
	}
	public String toString()
	{
		return this.Name+"#"+this.MiddleName+"#"+this.Surname+"#"+this.Number+"#"+this.MeterNo+"#"+this.Unit+"#"+this.Address+"#"+this.custNO;
	}
	String getName()
	{
		return this.Name;
	}
	String getMiddleName()
	{
		return this.MiddleName;
	}
	String getSurname()
	{
		return this.Surname;
	}
	String getNumber()
	{
		return this.Number;
	}
	String getMeterNo()
	{
		return this.MeterNo;
	}
	String getUnit()
	{
		return this.Unit;
	}
	String getAddress()
	{
		return this.Address;
	}
	String getCustNo()
	{
		return this.custNO;
	}
	Index mf;
	Electricity fm;
	Electricity1 fm1;
	Electricity2 fm2;
	Electricity3 fm3;
	MyActionListener(Index m)
	{
		this.mf = m;
	}
	MyActionListener(Electricity f)
	{
		this.fm = f;
	}
	MyActionListener(Electricity1 f)
	{
		this.fm1 = f;
	}
	MyActionListener(Electricity2 f)
	{
		this.fm2 = f;
	}
	MyActionListener(Electricity3 f)
	{
		this.fm3 = f;
	}
	ArrayList <MyActionListener> bill = new ArrayList<MyActionListener>();

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals("Get Bill"))
		{
			fm = new Electricity();
			fm.setVisible(true);
			mf.setVisible(false);
		}
		if(e.getActionCommand().equals("Close"))
		{
			mf.dispose();
		}
		if(e.getActionCommand().equals("Search"))
		{
			fm1 = new Electricity1();
			this.fm1.setVisible(true);
			this.fm.setVisible(false);
			System.out.println(this.fm.txt1.getText());
			
			try
			{
				File f1=new File("bill.txt");
				Scanner sc=new Scanner(f1);
				while(sc.hasNextLine())
				{
					sc.nextLine();
					count++;
				}	
			}
			catch(Exception ev)
			{
				System.out.println("ev");
			}
			try
			{
				BufferedReader br = new BufferedReader(new FileReader("bill.txt"));
				for(int j=0;j<count;j++)
				{
					String st1=br.readLine();
					String arr[] = st1.split(",");
					bill.add(new MyActionListener(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7]));
				}
				br.close();	
			}
			catch(Exception r)
			{
				System.out.println(r);
			}
			for(int i=0;i<bill.size();i++)
			{
				int cmp = bill.get(i).getCustNo().compareTo(this.fm.txt1.getText());
				if(cmp==0)
				{
					System.out.println(" corresponing details \n" + bill.get(i));
					this.fm1.txtName.setText(bill.get(i).getName());
					this.fm1.txtMiddileName.setText(bill.get(i).getMiddleName());
					this.fm1.txtSurname.setText(bill.get(i).getSurname());
					this.fm1.txtNumber.setText(bill.get(i).getNumber());
					this.fm1.txtMeter.setText(bill.get(i).getMeterNo());
					this.fm1.txtUnit.setText(bill.get(i).getUnit());
					this.fm1.txtAddress.setText(bill.get(i).getAddress());
					float a = (Integer.parseInt(bill.get(i).getUnit()))*5;
					float gst = (a*18)/100;
					a = a+gst;
					this.fm1.txtTotal.setText(String.valueOf(a));	
					this.fm1.txtTotal.setText(String.valueOf(a));
					data=1;
				}			
			}
			if(data==0)
				{
					JOptionPane.showMessageDialog(fm,"Enter Valid Coustomer Number ","Error", JOptionPane.INFORMATION_MESSAGE);
				}		
		}
		if(e.getActionCommand().equals("BaCk"))
		{
			mf = new Index();
			this.mf.setVisible(true);
			this.fm.setVisible(false);
		} 
		if(e.getActionCommand().equals("Next"))
		{
			fm2 = new Electricity2();
			this.fm2.setVisible(true);
			this.fm1.setVisible(false);
		}
		if(e.getActionCommand().equals("Back"))
		{
			fm = new Electricity();
			this.fm.setVisible(true);
			this.fm1.setVisible(false);
		}
		if(e.getActionCommand().equals("BACK"))
		{
			fm1 = new Electricity1();
			this.fm1.setVisible(true);
			this.fm2.setVisible(false);
		}
		if(e.getActionCommand().equals("PAY"))
		{
			fm3 = new Electricity3();
			this.fm3.setVisible(true);
			this.fm2.setVisible(false);
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		
	}
}