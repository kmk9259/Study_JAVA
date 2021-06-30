package 스터디.object.static3.controller;

public class StaticSample {
	private static String value;
	private static char[] temp = new char[10];
	public static void toUpper() {
	// value 필드 값을 모두 대문자로 변경 --> char 배열 응
	
	for(int i=0; i<value.length(); i++)
	{
		temp[i] = value.charAt(i);
		temp[i] = Character.toUpperCase(temp[i]);
	}
	value = new String(temp);
	value = value.trim(); //공백 제거
	System.out.println("대문자로 : "+value);
	
	
	}
	public static void setChar(int index, char c) {
	// 전달받은 인덱스 위치의 value 값을 전달받은 문자로 변경하는 static 메소드
		System.out.print("J=>C :");
		for(int i=0; i<value.length(); i++)
		{
			temp[i] = value.charAt(i);
			if(index == i)
				temp[i] = c;
			System.out.print(temp[i]);
		}
		
	}
	public static int valueLength() {
	// value 필드 값에 기록되어 있는 문자 갯수 리턴
		return value.length();
	}
	public static String valueConcat(String str) {
	// 문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴
		String temp = value+str;
		temp = value.concat(str);
		System.out.printf("%s 붙여서 : ",str);
		return temp;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
