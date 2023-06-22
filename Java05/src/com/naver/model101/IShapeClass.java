package com.naver.model101;

public interface IShapeClass {
	abstract void draw();
	
	public static void pr(IShapeClass ih) {
		ih.draw();
	}
}
