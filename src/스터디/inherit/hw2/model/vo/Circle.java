package 스터디.inherit.hw2.model.vo;

public class Circle extends Point{
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		super.draw();
		
		System.out.println("원의 면적 : "+ String.format("%.1f", (Math.PI * radius * radius)) );
		System.out.println("원의 둘레 : "+ String.format("%.1f", (Math.PI * radius * 2)));
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	

}