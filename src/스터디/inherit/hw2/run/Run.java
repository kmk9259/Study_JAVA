package 스터디.inherit.hw2.run;

import 스터디.inherit.hw2.model.vo.Circle;
import 스터디.inherit.hw2.model.vo.Rectangle;

public class Run {
	public static void main(String[] args) {
		Circle[] c = new Circle[2];
		Rectangle[] r = new Rectangle[2];
		
		c[0] = new Circle(1, 2, 3);
		c[1] = new Circle(3, 3, 4);
		r[0] = new Rectangle(-1, -2, 5, 2);
		r[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("=====circle=====");
		for(Circle cir : c)
		{
			cir.draw();
		}
		System.out.println("=====Rectangle=====");
		for(Rectangle rec : r)
		{
			rec.draw();
		}
			
		
	}

}
