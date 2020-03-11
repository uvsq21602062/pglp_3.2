package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendeurTest {

	@Test
	public void testGetSalaire() {
		Vendeur D = new Vendeur(1000);
		assertTrue(D.getSalaire() == 1000);
	}
	
	@Test
	public void testSetSalaire() {
		Vendeur D = new Vendeur(1000);
		D.setSalaire(500);
		assertTrue(D.getSalaire() == 500);	
	}
	
	@Test
	public void testGetAnciennete() {
		Vendeur D = new Vendeur(1000, 5);
		assertTrue(D.getAnciennete() == 5);	
	}
	
	@Test
	public void testSetAnciennete() {
		Vendeur D = new Vendeur(1000);
		D.setAnciennete(5);
		assertTrue(D.getAnciennete() == 5);	
	}
	
	@Test
	public void testGetCommission() {
		Vendeur D = new Vendeur(1000, 5, 100);
		assertTrue(D.getCommission() == 100);	
	}
	
	@Test
	public void testSetCommission() {
		Vendeur D = new Vendeur(1000, 5);
		D.setCommission(100);
		assertTrue(D.getCommission() == 100);	
	}
	
	@Test
	public void testGetSalaireTotal() {
		Vendeur v = new Vendeur(1000, 5, 100);
		assertTrue(v.getSalaireTotal() == 1000 + 5*20 + 100);	
	}

}
