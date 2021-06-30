package 스터디.object.nonstatic1.run;

import 스터디.object.nonstatic1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		NonStaticSample nss = new NonStaticSample();
		nss.printLottoNumbers();
		nss.outputChar(5, 'a');
		System.out.println("3. 랜덤 영문자 출력 : "+nss.alphabette());
		nss.mySubstring("apple", 2, 4);
		
	}

}
