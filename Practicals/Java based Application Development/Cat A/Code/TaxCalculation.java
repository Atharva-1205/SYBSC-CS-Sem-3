public class TaxCalculation {    

	public static void main(String[] args)
	{
		double Price, Tax, Total;
		Price = Double.parseDouble(args[0]);
		Tax = Price*(8.25/100);
		Total = Price+Tax;
		System.out.println("Tax= "+Tax+"\n Total price= "+Total);
	}


}
