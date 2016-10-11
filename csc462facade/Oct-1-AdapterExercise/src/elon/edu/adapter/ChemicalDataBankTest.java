package elon.edu.adapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChemicalDataBankTest {

	private ChemicalDataBank dataBank = new ChemicalDataBank();
	@Test
	public void testGetCriticalPoint() {
		assertTrue(dataBank.getCriticalPoint("water", "M") == 0);
		assertTrue(dataBank.getCriticalPoint("benzene", "M") == 5.5);
		assertTrue(dataBank.getCriticalPoint("alcohol", "M") == (float)(-114.1));
		
		assertTrue(dataBank.getCriticalPoint("water", "") == 100);
		assertTrue(dataBank.getCriticalPoint("benzene", "") == (float)(80.1));
		assertTrue(dataBank.getCriticalPoint("alcohol", "") == (float)(78.3));
	}
	@Test
	public void testGetMolecularStructure(){
		assertTrue(dataBank.getMolecularStructure("water").equals("H2O"));
		assertTrue(dataBank.getMolecularStructure("benzene").equals("C6H6"));
		assertTrue(dataBank.getMolecularStructure("alcohol").equals("C2H6O2"));
	}
	@Test
	public void testGetMolecularWeight(){
		assertTrue(dataBank.getMolecularWeight("water") == 18.015);
		assertTrue(dataBank.getMolecularWeight("benzene") == 78.1134);
		assertTrue(dataBank.getMolecularWeight("alcohol") == 46.0688);
	}

}
