package fr.uvsq.uvsq21602062.projet_maven;

import java.util.ArrayList;

public class Entreprise {
	
	private ArrayList<Employe> employe;
	
	public Entreprise() {
		this.employe = new ArrayList<Employe>();
	}
	
	public void addEmploye(Employe e) {
		this.employe.add(e);
	}
	
	public Employe getEmploye(int i) {
		return this.employe.get(i);
	}
	
	public float getSalaireTotal() {
		float somme=0;
		for(int i=0; i<this.employe.size(); i++) {
			somme += this.employe.get(i).getSalaireTotal();
		}
		return somme;
	}
}
