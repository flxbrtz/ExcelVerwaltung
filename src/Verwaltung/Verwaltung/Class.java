package Verwaltung;

import java.util.ArrayList;
import java.util.List;


public class Classes {
	
	private String KlassenStufe;
	private String KlassenName;
	private List<Student> Schueler = new ArrayList<Student>();
	
	
	public Classes(String aKlassenStufe, String aKlassenName) 
	{
		KlassenStufe = aKlassenStufe;
		KlassenName  = aKlassenName;
	}
	
	
	
	
	//Start getter
	
	/**Gibt die Liste mit den Schülern aus*/
	public List<Student> getSchueler()
	{
		return Schueler;
	}

	/**Gibt die Stufe der Klasse aus*/
	public String getKlassenStufe()
	{
		return KlassenStufe;
	}
	
	/**Gibt die Bezeichnung der Klasse aus*/
	public String getKlassenName()
	{
		return KlassenName;
	}
	//Ende getter
	
	//Start setter
	
	/** Setzt die Liste mit den Schülern*/
	public void setSchueler(List<Student> newSchueler)
	{
		this.Schueler = newSchueler;
	}
	
	/**Setzt die Stufe der Klasse*/
	public void setKlassenStufe(String newKlassenStufe) 
	{
		this.KlassenStufe = newKlassenStufe;
	}
	
	/** Setzt die Bezeichnung der Klasse*/
	public void setKlassenName(String newKlassenName)
	{
		this.KlassenName = newKlassenName;
	}

	//Ende setter
}
