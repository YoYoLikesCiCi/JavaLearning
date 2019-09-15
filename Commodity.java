/*************************************************************************
	> File Name: Commodity.java
	> Author: YoYoLikesCiCi-孙起
	> Mail: YoYoLikesCiCi@live.cn 
	> Created Time: 日  9/15 18:21:07 2019
 ************************************************************************/
class Commodity{
	public static void main(String[] args){
		String command = "BUY";
		int balance = 550;
		int quantity = 42;

		switch(command) {
			case "BUY":
				quantity += 5;
				balance -= 20;
				break;

			case "SELL":
				quantity -= 5;
				balance += 15;
		}

		System.out.println("Balance: "+ balance + "\n" + "Quantity: " + quantity);
	}
}
