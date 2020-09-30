package Verwaltung;

import java.sql.Date;

public class Student 
{
	private String Vorname;
	private String Name;
	private String Email;
	private String KlassenStufe;
	private String KlassenName;
	private Date Geburtsdatum;
	private String Geschlecht;
	
	// Constructor
	public Student(
			  String aVorName
			, String aName
			, String aEmail
			, String aKlassenStufe
			, String aKlassenName
			, Date aGeburtsdatum
			, String aGeschlecht
			) 
	{
		Vorname 	 = aVorName;
		Name 		 = aName;
		Email 		 = aEmail;
		KlassenStufe = aKlassenStufe;
		KlassenName  = aKlassenName;
		Geburtsdatum = aGeburtsdatum;
		Geschlecht   = aGeschlecht;
	}
	
	
	// Getter
	public String GetVorname() 
	{
		return Vorname;
	}
	
	public String GetName() 
	{
		return Name;
	}
	
	public String GetEmail() 
	{
		return Email;
	}
	
	public String GetKlassenStufe() 
	{
		return KlassenStufe;
	}
	
	public String GetKlassenName() 
	{
		return KlassenName;
	}
	
	public Date GetGeburtsdatum() 
	{
		return Geburtsdatum;
	}
	
	public String GetGeschlecht() 
	{
		return Geschlecht;
	}
	// Ende Getter
	
	// Setter
	public void SetVorname(String NewVorname) 
	{
		this.Vorname = NewVorname;
	}
	
	public void SetName(String newName) 
	{
		this.Name = newName;
	}
	
	public void SetEmail(String NewEmail) 
	{
		this.Email = NewEmail;
	}
	
	public void SetKlassenStufe(String NewKlassenStufe) 
	{
		this.KlassenStufe = NewKlassenStufe;
	}
	
	public void SetKlassenName(String NewKlassenName) 
	{
		this.KlassenName = NewKlassenName;
	}
	
	public void SetGeburtsdatum(Date NewDate) 
	{
		this.Geburtsdatum =  NewDate;
	}
	
	public void SetGeschlecht(String NewGeschlecht) 
	{
		this.Geschlecht = NewGeschlecht;
	}
	//Ende Setter
	
	
	
}
