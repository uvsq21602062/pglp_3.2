package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class EntrepriseTest {

	@Test
	public void testSetGetEmploye() {
		Entreprise ent = new Entreprise();
		Employe e = new Employe(1000);
		ent.addEmploye(e);
		assertTrue(ent.getEmploye(0) == e);
	}

	@Test
	public void testGetSalaireTotal() {
		Entreprise ent = new Entreprise();
		Employe e = new Employe(1000, 5);
		Vendeur v = new Vendeur(2000, 2, 100);
		ent.addEmploye(e);
		ent.addEmploye(v);
		assertTrue(ent.getSalaireTotal() == 1000 + 5*20 + 2000 + 2*20 + 100);
	}
}
