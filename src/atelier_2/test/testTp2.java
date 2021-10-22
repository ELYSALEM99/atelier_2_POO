package atelier_2.test;
import atelier_2.*;
import java.util.GregorianCalendar;

import atelier_2.Adresse;
import atelier_2.Personne;

public class testTp2 {
	public static void main(String[] args) {
		Adresse A1=new Adresse(3,"rue charles de gaulle","75000","Paris");
		Personne p1=new Personne("Mo","salem",new GregorianCalendar(1996,10,29),A1);
		System.out.println(p1);
		Adresse A2=new Adresse(3,"rue charles ","75005","Paris");
		Personne p2=new Personne("Mo","salem",new GregorianCalendar(1996,10,29),A2);
		System.out.println(p2);
		Personne p3=new Personne("mama","zei", 10, 06, 2000, 03, "gaulle", "34000", "montpellier");
		Personne p4=new Personne("mama","zei", 10, 06, 2000, 03, "gaulle", "34000", "montpellier");
		//System.out.println(p2.plusAgee(p1));
		System.out.println(p3);
		System.out.println(p3.equals(p4));
		System.out.println(Employe.createEmploye("mama","zei", 10, 06, 2009, 03, "gaulle", "34000", "montpellier",2000,new GregorianCalendar(2000,9,11)));
		
	}

}
