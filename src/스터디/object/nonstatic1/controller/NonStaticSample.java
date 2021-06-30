package 스터디.object.nonstatic1.controller;

public class NonStaticSample {
	public void printLottoNumbers() {
		int[] ran = new int[6];
		System.out.print("1. 랜덤 값 : ");
		for(int i=0; i<ran.length; i++)
		{
			for(int j=0; j<i; j++)
			{
				ran[i] =(int)(Math.random()*45+1);
				if(ran[i] == ran[j])
				{
					i--;
					break;
				}
			}
			System.out.print(ran[i]+"  ");
		}
		System.out.println();
		
	}
	
	public void outputChar(int num, char c)
	{
		System.out.print("2. "+c+"문자 "+num+"개 출력 : ");
		for(int i=0; i<num; i++)
		{
			System.out.print(c+" ");
		}
		System.out.println();
	}
	public char alphabette()
	{//a =97 ~122 A=65 ~ 90
		char[]temp = new char[52];
		char alpha =' ';
		int num = (int)(Math.random()*52);
		for(int i=0; i<27; i++)
		{
			temp[i]=(char)((int)(Math.random()*26+97));
			for(int j=27; j<temp.length; j++)
			{
				temp[j]=(char)((int)(Math.random()*26+65));
			
			}
		}
		for(int i=0; i<temp.length; i++)
		{
			if(num == i)
				alpha = temp[num];
		}				
		return alpha;
	}
	public String mySubstring(String str, int index1, int index2)
	{
		char[] temp = new char [str.length()];
		if(str!=null)
		{
			
			for(int i=index1; i<index2; i++)
			{
				temp[i] =str.charAt(i);
				System.out.println("4. "+str+"의 "+index1+"번 "+index2+"번 인덱스 사이의 값 출력 : "+temp[i]);
				
			}
		}
		else
			return str=null;
		return str;
	}

}
