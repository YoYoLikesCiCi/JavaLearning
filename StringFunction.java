/*************************************************************************
	> File Name: StringFunction.java
	> Author: YoYoLikesCiCi-孙起
	> Mail: YoYoLikesCiCi@live.cn 
	> Created Time: 日  9/15 17:02:17 2019
 ************************************************************************/
class StringFunction{
public static void main(String[] args){
	String fullName = "Ada McGrath Stewart";
	System.out.println(fullName);

	String action = " hug ";

	System.out.println(fullName + action);


	String temp = "";
//	temp =

	System.out.println(action.equals(fullName));    //比较两个字符串是否相等

	int temp2 = fullName.length();
	System.out.println(temp2);

	temp = fullName.toUpperCase();
	System.out.println(temp);

	String part = "e";
	System.out.println(part.indexOf(fullName));
}
}
