package atelier_2;

import java.time.LocalDate;
import java.time.Period;
import java.util.GregorianCalendar;

public class Employe extends Personne {
	private int salaire;
	private final GregorianCalendar dateEmbauche;
	private Employe(String nom, String prenom, int jour, int mois, int annee, int numero, String rue, String code_postal, String ville,int salaire,GregorianCalendar laDateEmb) {
			super(nom,prenom,jour,mois,annee,numero,rue,code_postal,ville);
			this.salaire=salaire;
			dateEmbauche=laDateEmb;
	}	
	public static Employe createEmploye(String nom, String prenom, int jour, int mois, int annee, int numero, String rue, String code_postal, String ville,int salaire,GregorianCalendar laDateEmb) {
		LocalDate aujourdhui = LocalDate.now(); 
		LocalDate naissance = LocalDate.of(annee,mois,jour); 
		Period periode = Period.between(naissance, aujourdhui);
		System.out.printf("Vous avez %d an(s) ", periode.getYears());
		if(periode.getYears()>16 && periode.getYears()<65) 
		{
			Employe e1=new Employe(nom,prenom,jour,mois,annee,numero,rue,code_postal,ville,salaire,laDateEmb);
			return e1;
		}
		else
		{
			return null;
		}
			
	}
}
