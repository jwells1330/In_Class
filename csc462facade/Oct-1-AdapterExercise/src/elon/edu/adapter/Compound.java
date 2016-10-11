package elon.edu.adapter;

public class Compound implements ChemicalCompound{
	private ChemicalDataBank dataBank = new ChemicalDataBank();
	private String name;
	
	public Compound(String compoundName){
		name = compoundName;
	}
	
	public Compound(){
	}
	
	@Override
	public String display() {
		String displayString = "Compound: " + name + " -----\n";
		displayString += "Formula: " + this.getMolecularFormula() + "\n";
		displayString += "Weight: " + this.getMolecularWeight() + "\n";
		displayString += "Melting PT: " + this.getMeltingPoint() + "\n";
		displayString += "Boiling PT: " + this.getBoilingPoint() + "\n";
		System.out.println(displayString);
		return null;
	}

	@Override
	public double getBoilingPoint() {
		return dataBank.getCriticalPoint(name, "");
	}

	@Override
	public double getMeltingPoint() {
		return dataBank.getCriticalPoint(name, "M");
	}

	@Override
	public String getMolecularFormula() {
		return dataBank.getMolecularStructure(name);
	}

	@Override
	public double getMolecularWeight() {
		return dataBank.getMolecularWeight(name);
	}
	
}
