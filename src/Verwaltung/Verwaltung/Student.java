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
	/**Gets the first name of the student*/
	public String GetVorname() 
	{
		return Vorname;
	}
	
	/**Gets the family name of the student*/
	public String GetName() 
	{
		return Name;
	}
	
	/** Gets the email adress of the student*/
	public String GetEmail() 
	{
		return Email;
	}
	
	/** Gets the grade of the student*/
	public String GetKlassenStufe() 
	{
		return KlassenStufe;
	}
	
	/**Gets the name of the students class*/
	public String GetKlassenName() 
	{
		return KlassenName;
	}
	
	/**Gets the students date of birth*/
	public Date GetGeburtsdatum() 
	{
		return Geburtsdatum;
	}
	
	/** Gets the students gender*/
	public String GetGeschlecht() 
	{
		return Geschlecht;
	}
	// Ende Getter
	
	// Setter
	/**Sets the first name of the student*/
	public void SetVorname(String NewVorname) 
	{
		this.Vorname = NewVorname;
	}
	
	/**Sets the family name of the student*/
	public void SetName(String newName) 
	{
		this.Name = newName;
	}
	
	/** Sets the Email adress of the student*/
	public void SetEmail(String NewEmail) 
	{
		this.Email = NewEmail;
	}
	
	/** Sets the grade of the student*/
	public void SetKlassenStufe(String NewKlassenStufe) 
	{
		this.KlassenStufe = NewKlassenStufe;
	}
	
	/**Sets the name of the students class*/
	public void SetKlassenName(String NewKlassenName) 
	{
		this.KlassenName = NewKlassenName;
	}
	
	/**Sets the students date of birth*/
	public void SetGeburtsdatum(Date NewDate) 
	{
		this.Geburtsdatum =  NewDate;
	}
	
	/** Gets the students gender*/
	public void SetGeschlecht(String NewGeschlecht) 
	{
		this.Geschlecht = NewGeschlecht;
	}
	//Ende Setter
	
	
	
}
