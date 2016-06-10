interface Multiply
{
	public abstract int multiplyTwo(int n1, int n2);
  	int multiplyThree(int n1, int n2, int n3);

}

class AbstractDemo2 implements Multiply
{
   	public int multiplyTwo(int num1, int num2)
	{
      		return num1*num2;
   	}
   	public int multiplyThree(int num1, int num2, int num3)
	{
      		return num1*num2*num3;
   	}
   	public static void main(String args[])
	{
      		AbstractDemo2 obj = new AbstractDemo2();
      		System.out.println(obj.multiplyTwo(3, 7));
      		System.out.println(obj.multiplyThree(1, 9, 0));
   }
}
