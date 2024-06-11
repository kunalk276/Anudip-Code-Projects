package com.anudip.springdemo;


public class Painter implements Performer {

	Shape shape;
	
	public Painter(Shape shape) {
		super();
		this.shape = shape;
	}

	@Override
	public void perform() {
		
		shape.draw();
	}

	
}


//public class Painter implements Shape{
//
//	Shape shape;
//	
//	
//	public Painter(Shape shape) {
//		super();
//		this.shape = shape;
//	}
//
//
//
//
//
//
//	@Override
//	public void draw() {
//		// TODO Auto-generated method stub
//		
//	}
//}
