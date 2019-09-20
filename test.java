class test{
	public static void main(String[] args){
		int[] numbers = new int [] {11,18,2,8,17};
		int temp,j;
		int size = numbers.length;
		for ( int i = 1; i< size ; i++ ){
			temp = numbers[i];
			for (j=i; j> 0 && temp > numbers[j-1]; j-- ){
				numbers[j] = numbers[j-1];
			}
			numbers[j] = temp;
					for( int t = 0; t < 5 ; t ++ ){
						System.out.print(numbers[t] + "-");
					}
					System.out.println("");
				}
			}
		}
