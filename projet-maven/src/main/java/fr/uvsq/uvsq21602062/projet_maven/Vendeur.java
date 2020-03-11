package fr.uvsq.uvsq21602062.projet_maven;

public class Vendeur extends Employe {
	protected float commission;
	
	public Vendeur(float salaire) {
		super(salaire);
		this.commission = 0;
	}
	
	public Vendeur(float salaire, int anciennete) {
		super(salaire, anciennete);
		this.commission = 0;
	}
	
	public Vendeur(float salaire, int anciennete, float commission) {
		super(salaire, anciennete);
		this.commission = commission;
	}
	
	public float getCommission() {
		return this.commission;
	}
	
	public void setCommission(float commission) {
		this.commission = commission;
	}
}
