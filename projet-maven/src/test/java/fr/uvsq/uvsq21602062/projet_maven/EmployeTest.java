package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeTest {
	
	@Test
	public void testGetSalaire() {
		Employe E = new Employe(1000);
		assertTrue(E.getSalaire() == 1000);
	}
	
	@Test
	public void testSetSalaire() {
		Employe E = new Employe(1000);
		E.setSalaire(500);
		assertTrue(E.getSalaire() == 500);
		
	}
}
