public class InchToCM {

	public static void main(String[] args)
	{
		float inch,cm;
		inch = Float.parseFloat(args[0]);
		cm = inch*2.54F;
		System.out.println(inch+" Inch= "+cm+" centimeters");
	}
}
