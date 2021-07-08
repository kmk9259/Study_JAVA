package 스터디.API.hw1.controller;

public class TokenController {
	public String afterToken(String str)
	{
		String[] strArr = str.split(" ");
		String temp=" ";
		for(int i=0; i<strArr.length; i++)
		{
			temp = temp.concat(strArr[i]);
			temp = temp.trim();
		}
		return temp;
		
	}
	public String firstCap(String input)
	{
		String temp = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
		return temp;
		
	}
	public int findChar(String input, char one)
	{
		char[] temp = new char[input.length()];
		int count=0;
		for(int i=0; i<input.length(); i++)
		{
			 temp[i] = input.charAt(i);
			 if(temp[i] == one)
				 count++;
		}
			
		return count;
		
	}

}
