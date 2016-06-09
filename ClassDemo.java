public class ClassDemo
{
	class led
		{
			int watt=230;
			boolean state=true;
			boolean IsWorking()
			{	
				return state;
			}
		}
	class bulb extends  led
		{	
			int wattb=250;
			 void better()
			{
				if(watt>wattb)
				System.out.println("led better");
				else 
				System.out.println("Bulb better");
			}
		}
	
	public static void main(String args[])
	{
	static led a = new led();
	static	bulb b = new bulb();
		a.IsWorking();
		b.better();
	}
	
}

		
