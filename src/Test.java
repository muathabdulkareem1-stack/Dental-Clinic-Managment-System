package dcc;

import static org.junit.jupiter.api.Assertions.*;

import junit.framework.Assert;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Ordinary_Patient ordinary_Patient = new Ordinary_Patient();
		Dental_Consultant dental_Consultant = new Dental_Consultant();
		assertNotSame(ordinary_Patient, dental_Consultant);
	}

}
