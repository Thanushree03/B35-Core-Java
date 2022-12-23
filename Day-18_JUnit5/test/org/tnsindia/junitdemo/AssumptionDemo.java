package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void test() {
System.setProperty("Thanu", "Bindhu");
		
		//Execute the body when the positive condition  else test will be skipped
		Assumptions.assumeTrue("Bindhu".equals(System.getProperty("Thanu")));
	}
	
	@Test
	void display() {
		System.setProperty("Thanu", "Bindhu");
		
		//Execute the body when the negative condition  else test will be skipped
		Assumptions.assumeFalse("Uday".equals(System.getProperty("Thanu")));
	}
	
	@Test
	void print() {
		System.setProperty("Thanu", "Bindhu");
		
		Assumptions.assumingThat(true, null);
	}

}
