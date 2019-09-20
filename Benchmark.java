/*************************************************************************
	> File Name: Benchmark.java
	> Author: YoYoLikesCiCi-孙起
	> Mail: YoYoLikesCiCi@live.cn 
	> Created Time: 一  9/16 07:44:47 2019
 ************************************************************************/
class Benchmark{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 60000;
		long index = 0;
		while(true){
			double  x = Math.sqrt(index);
			long now  = System.currentTimeMillis();
			if ( now > endTime ){
				break;
			}
			index ++;
		}
		System.out.println(index + " loops in one minute.");
	}
}
