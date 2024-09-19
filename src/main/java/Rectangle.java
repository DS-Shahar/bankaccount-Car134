package bank;

public class Rectangle {
	private int length = 0;
	private int width =0;
	public Rectangle(int length, int width) {
		this.length=length;
		this.width=width;
	}
	public void Draw(){
		System.out.println("sorry dont know how to draw");
	}
	public void scale(int factor) {
		this.length = length*2;
		this.width = width*2;
	}
	public int calcPerimeter(){
		return (length*2) + (width*2);
	}
	public int calcArea() {
		return length*width;
	}

	public String toString() {
		return "length;" + length + "width:" + width;
	}
}
