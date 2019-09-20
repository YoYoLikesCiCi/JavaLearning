import java.lang.Math;
class randomin100{
public static void main(String[] args){
	int [] randomnumber = new int[1000];
    int [] 	save = new int[100];
	int i=0, temp;
	for(;i<1000;i++)
	{
		//temp
		temp = (int)(Math.random()*100);
		randomnumber[i] = temp;
		save[temp]++;
	}
	temp = 0;
	for(i=0;i<100;i++)
	{
	    System.out.print(i+1);
		System.out.print("---");
		temp += save[i];
			System.out.print("times: " + save[i]);
			System.out.print("   total:");
			System.out.println(temp);
	}
    
    }
}
