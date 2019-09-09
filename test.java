import java.io.IOException;
class test{
	public static void main(String[] args) throws IOException

		{
			int  i, n ;
		    double	sum =1;
			n = System.in.read();
			n -= 48;
			for (i = 1;  i<= n; i++)
			{
				sum *= i;
			}
			System.out.println(n+"!=" + sum);
		}

		
	}

