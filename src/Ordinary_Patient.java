package dcc;

public class Ordinary_Patient extends Patient{
	private double fees = 30;
	@Override
	public double getFees() {
		return fees;
		
	}

	@Override
	public void setFees() {
		this.fees = 30;
		
	}



}
