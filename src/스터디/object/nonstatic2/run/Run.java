package 스터디.object.nonstatic2.run;

import 스터디.object.nonstatic2.controller.NonStaticSample;

public class Run {
	public static void main(String[] args) {
		NonStaticSample nss = new NonStaticSample();
		nss.intArrayAllocation(5);
		System.out.println();
		System.out.print(nss.countChar("apple", 'p'));
		System.out.println();
		System.out.print(nss.totalValue(13, 7));
		System.out.println();
		System.out.println(nss.pCharAt("programming", 3));
		System.out.println();
		System.out.println(nss.pConcat("JAVA", "programming"));
	}

}
