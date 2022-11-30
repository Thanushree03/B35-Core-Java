package org.tnsindia.finalkeyworddemo;

public class FinalMethodExecutor {

	public static void main(String[] args) {
		FinalMethodWithChild f=new FinalMethodWithChild ();
		f.aadhar_no=346573452129L;
		f.PAN_no="DFJ156379";
		//f.print();
		f.print(f.PAN_no);

	}
}
