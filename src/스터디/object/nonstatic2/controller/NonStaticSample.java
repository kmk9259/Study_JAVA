package 스터디.object.nonstatic2.controller;

public class NonStaticSample {
	public int[] intArrayAllocation(int length) {
		int[] arr = new int[length];
		
		for(int i=0; i<arr.length; i++)
		{
			int num = (int)(Math.random()*100+1);
			arr[i] = num;
		}
		System.out.print("크기가 "+length+"인 배열의 랜덤 값 : ");
		display(arr);
		System.out.print("내림차순 출력: ");
		sortDescending(arr);
		System.out.print("오름차순 출력: ");
		sortAscending(arr);
		return arr;
		}
	public void display(int[] arr) {
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		
	}
	public void swap(int[] arr, int idx1, int idx2) {
		int temp=0;
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	public void sortDescending(int[] arr) {
	
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(arr[i]<arr[j])
				{
					swap(arr,i,j);
				}
			}
		}
		display(arr);
	}
	public void sortAscending(int[] arr) {
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(arr[i]>arr[j])
				{
					swap(arr,i,j);
				}
			}
		}
		display(arr);
	}
	public int countChar(String str, char c) {
		char[] temp = new char[str.length()];
		int cnt=0;
		for(int i=0; i<str.length(); i++)
		{
			temp[i] = str.charAt(i);
			if(c == temp[i])
				cnt++;
		}
		System.out.print(str+"문자열에 "+c+"의 개수 : ");
	return cnt;
	}
	public int totalValue(int num1, int num2) {
		int sum=0;
		if(num1<num2)
		{
			for(int i=num1+1; i<num2; i++)
			{
				sum +=i;
			}
		}
		else
		{
			for(int i=num2+1; i<num1; i++)
			{
				sum +=i;
			}
		}
		System.out.printf("%d 과 %d 사이 정수들의 합계 :",num1, num2);
	return sum;
	}
	public char pCharAt(String str, int index) {
		char[] temp = new char[str.length()];
		char temp2=' ';
		for(int i=0; i<str.length(); i++)
		{
			temp[i] = str.charAt(i);
			if(index == i)
				temp2 = temp[i];
				
		}
		System.out.printf("%s 문자열의 %d번 인덱스 문자 :", str, index);
		return temp2;
	}
	public String pConcat(String str1, String str2) {
	
		String str ="";
		str = str1.concat(str2);
		System.out.printf("%s와 %s을 합친 문자열 :", str1, str2);
		return str;
	}

}
