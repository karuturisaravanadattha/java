class Fibonacci
{
	public static void main(String[] args)
	{
		int first =0 ,second=1;
		System.out.println("Fibonacci Series are: ");
		while(first<=100)
		{
			System.out.println(first+" ");
			int next=first+second;
			first=second;
			second=next;
		}
	}
}
