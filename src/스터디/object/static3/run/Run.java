package 스터디.object.static3.run;

import 스터디.object.static3.controller.StaticSample;

public class Run {

	public static void main(String[] args) {
		StaticSample ss = new StaticSample();
		ss.setValue("Java");
		System.out.println("value : "+ss.getValue());
		ss.toUpper();
		System.out.println("길이 :"+ss.valueLength());
		System.out.println(ss.valueConcat("PROGRAMMING"));
		ss.setChar(0, 'C');
		
	}

}
