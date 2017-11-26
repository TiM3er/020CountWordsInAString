package main;

public class Count {
	static public  void liczSLowa(String zdanie )
	{
		int DlugoscZdania = zdanie.length();
		int spacja = 0;
		for (int i = 0 ; i < DlugoscZdania ; i++)
		{
			if ( Character.isWhitespace(zdanie.charAt(i)))
			{
				int j = i;
				j++;
				if( j < DlugoscZdania && !Character.isWhitespace(zdanie.charAt(j)) )
				{
					spacja++;
				}
			}
			
		}
		spacja++;
		System.out.println("Ilosc spacji jest rowna: " + spacja);
	}
}
