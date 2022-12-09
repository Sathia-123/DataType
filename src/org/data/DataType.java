package org.data;

public class DataType {
	private void dataType() {
		byte num=120;
		System.out.println("RegNum:"+num);
		short num2=1234;
		System.out.println("Id num:"+num2);
		int sel=25000;
		System.out.println("Salary:"+sel);
		long phone=7868848412l;
		System.out.println("Phone Number:"+phone);
		float value=123.55555f;
		System.out.println("Decimal Value:"+value);
		double val=3.957836455366;
		System.out.println("Double Value:"+val);
		char initial='R';
		System.out.println("Sathia Initial:"+initial);
		String emailId="sathiaseelan2000@gmail.com";
		System.out.println("EMAIL:"+emailId);
		boolean b=false;
		System.out.println("Boolean Result:"+b);
	}
	public static void main(String[] args) {
		DataType data=new DataType();
		data.dataType();
	}

}
