package simran;
import java. util.Scanner; 
public class simrsn7 {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner (System. in);
		//SWITCH CASE BREAK
		//System.out.println("enter a year");
		//int year = sc.nextInt();*/
		/*switch(year)
		{
		case 1975:
			System.out.println("WEST INDIES");
			break;
		case 1979:
			System.out.println("WEST INDIES");
			break;
		case 1983:
			System.out.println("AUSTRALIA");
			break;
		case 1990:
			System.out.println("AUSTRALIA");
			break;
		case 1998:
			System.out.println("INDIA");
			break; 
		case 2004:
			System.out.println("CANADA");
			break;
		case 2011:
			System.out.println("INDIA");
			break;
			default: 
				System. out.println("there is no world cup happened in this year");
		}*/
		//MERGING SWITCH CASE IF SIMILAR COUNTRY REPEATED LIKE EXAMPLE
		/*switch(year)
		{
		case 1975:
		case 1979:
			System.out.println("WEST INDIES");
			break;
		case 1983:
		case 1990:
			System.out.println("AUSTRALIA");
			break;
		case 1998:
		case 2011:
			System.out.println("INDIA");
			break;	 
		case 2004:
			System.out.println("CANADA");
			break;
			default: 
				System. out.println("there is no world cup happened in this year");
		}*/
		//using character, constant,string in switch
		/*switch('A')
		{
			case('A'):
			System.out.println("145");
			break;
		}
		switch('A')
				{
					case(65):
						System.out.println("256");
					break;
		}
		switch(65)
		{
		case('A'):
		{
			System.out.println("568");
			}*/
	//	String name ="SIMRAN";
		//switch(name)
		//{
		//case"SIMRAN":
			//System.out.println("string allowed");
		//}
		System.out.println("enter a month");
		int month= sc.nextInt();
		switch(month)
		{
		case 1:
			System.out.println("JAN");
			break;
		}
		switch(month)
		{
		case 2:
			System.out.println("FEB");
			break;
		}
		switch(month)
		{
		case 3:
			System.out.println("MARCH");
			break;
		}
		switch(month)
		{
		case 4:
			System.out.println("APRIL");
			break;
		}
		switch(month)
		{
		case 5:
			System.out.println("MAY");
			break;
		}
		switch(month)
		{
		case 6:
			System.out.println("JUN");
			break;
		}
		switch(month)
		{
		case 7:
			System.out.println("JULY");
			break;
		}
		switch(month)
		{
		case 8:
			System.out.println("AUG");
			break;
		}
		switch(month)
		{
		case 9:
			System.out.println("SEP");
			break;
		}
		switch(month)
		{
		case 10:
			System.out.println("OCT");
			break;
		}
		switch(month)
		{
		case 11:
			System.out.println("NOV");
			break;
		}
		switch(month)
		{
		case 12:
			System.out.println("DEC");
			break;
		default:
			System.out.println("invalid input ");
		}
}
}
