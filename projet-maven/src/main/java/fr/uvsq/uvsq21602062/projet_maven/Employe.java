package fr.uvsq.uvsq21602062.projet_maven;

public class Employe {
	protected float salaire;
	protected int anciennete;
	
	public Employe(float salaire) {
		this.salaire = salaire;
		this.anciennete = 0;
	}
	
	public Employe(float salaire, int anciennete) {
		this.salaire = salaire;
		this.anciennete = anciennete;
	}
	
	
	public float getSalaire() {
		return this.salaire;
	}
	
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	
	public int getAnciennete() {
		return this.anciennete;
	}
	
	public void setAnciennete(int anciennete) {
		this.anciennete = anciennete;
	}
	
	public float getSalaireTotal() {
		return this.salaire + this.anciennete*20;
	}
}
