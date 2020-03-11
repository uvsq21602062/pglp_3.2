package fr.uvsq.uvsq21602062.projet_maven;

public class Manager extends Employe {
	private int nbreSousSesOrdres;
	
	public Manager(float salaire) {
		super(salaire);
		this.nbreSousSesOrdres = 0;
	}
	
	public Manager(float salaire, int anciennete) {
		super(salaire, anciennete);
		this.nbreSousSesOrdres = 0;
	}
	
	public Manager(float salaire, int anciennete, int nbreSousSesOrdres) {
		super(salaire, anciennete);
		this.nbreSousSesOrdres = nbreSousSesOrdres;
	}
	
	public float getNbreSousSesOrdres() {
		return this.nbreSousSesOrdres;
	}
	
	public void setNbreSousSesOrdres(int nbreSousSesOrdres) {
		this.nbreSousSesOrdres = nbreSousSesOrdres;
	}
	
	public float getSalaireTotal() {
		return this.salaire + this.anciennete*20 + this.nbreSousSesOrdres * 100;
	}
}
