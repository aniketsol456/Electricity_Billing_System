public class Elec
{
	String Name;
	String MiddleName;
	String Surname;
	String Number;
	String MeterNo;
	String Unit;
	String Address;
	String custNO;
	
	Elec(String a,String b,String c,String d,String e,String f,String g,String h)
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
}