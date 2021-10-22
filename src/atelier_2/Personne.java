package atelier_2;
import java.util.*;
import java.time.LocalDate;
import java.time.Period;


public class Personne{
    private static final Adresse ADRESSE_INCONNUE = null;
    private String nom;
    private String prenom;
    private final GregorianCalendar dateNaissance;
    private Adresse adresse=ADRESSE_INCONNUE;
    private int nbPersonne=0;
	
	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse){
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
		nbPersonne++;
	}
	
	/** 
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'année de naissance
	 * @param numero le n° de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
		this(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville));
		nbPersonne++;
	}
	/**
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	/**
	 * Accesseur
	 * @return retourne le prénom
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * Accesseur
	 * @return retourne la date de naissance	 
	 */
	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * Accesseur
	 * @return retourne l'adresse	 
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * Modificateur
	 * @param retourne l'adresse	 
	 */
	public void setAdresse(Adresse a) {
		adresse=a;
	}
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String result="\nNom : "+nom+"\n"
		+"Prénom : "+prenom+"\n"+
		"Né(e) le : "+dateNaissance.get(Calendar.DAY_OF_MONTH)+
		"-"+dateNaissance.get(Calendar.MONTH)+
		"-"+dateNaissance.get(Calendar.YEAR)+"\n"+
		"Adresse : "+
		adresse.toString();
		return result;
	}
	public int getnbPersonne() {
		return nbPersonne;
	}
	public int annee() {
		return this.dateNaissance.get(Calendar.YEAR);
	}
	public int mois() {
		return this.dateNaissance.get(Calendar.MONTH);
	}
	public int jour() {
		return this.dateNaissance.get(Calendar.DAY_OF_MONTH);
	}
	public boolean plusAgee(Personne p) {
		boolean result=false;
		if(this.annee()<p.annee())
		{
			result=true;	
		}
		else if ((this.annee()==p.annee())&&(this.mois()<p.mois()))
		{
			result=true;
		}
		else if ((this.annee()==p.annee())&&(this.mois()==p.mois())&&(this.jour()<p.jour())) 
		{
			result=true;
		}
		return result;
	}
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if (obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Personne p=(Personne) obj;
		return ((this.nom.equals(p.nom))&&(this.prenom.equals(p.prenom))&&(this.annee()==p.annee())&&(this.mois()==p.mois())&&(this.jour()==p.jour()));
	}
}

    
   
   