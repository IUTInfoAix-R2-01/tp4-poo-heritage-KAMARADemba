package Cycles;

public class VeloElec extends Velo {
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
	}
	
	public VeloElec(double diamRoue, double coupleMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec() {
		super();
		this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}

	public static double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}

	public static void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double dEFAUT_FACTEUR_PUISSANCE_MOTEUR) {
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR = dEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}

	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}

	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}

	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	
}
