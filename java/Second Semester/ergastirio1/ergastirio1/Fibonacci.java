class Fibonacci 
{
	public int Fib(int b)
	{
		if(b==1 || b==2)return 1;
		return (Fib(b-1) + Fib(b-2));
	}
}
class TestFibonacci 
{
	public static void main(String args[])
	{
		Fibonacci f = new Fibonacci();
		System.out.println(f.Fib(7)); 
	}
}