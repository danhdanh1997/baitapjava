package cau1_th;

import java.util.Scanner;

import cau1_th.Point2D;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D() {
		super();
	}
	
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	private void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao toa do x:");
		x=scanner.nextDouble();
		System.out.println("Nhap vao toa do y:");
		y=scanner.nextDouble();
	}
	
	@SuppressWarnings("unused")
	private double khoangcach(Point2D a) {
		double kq=0;
		kq=(double)Math.sqrt(Math.pow((this.x-this.y),2) + Math.pow((a.x- a.y),2));
		return kq;
	}
	private void xuat() {
		System.out.println("("+x+";"+y+")");
	}
	
	public static void main(String[] args) {
		Point2D A = new Point2D();
		Point2D B = new Point2D();
		A.nhap();
		A.xuat();
		
		B.nhap();
		B.xuat();
		
		double dodai=A.khoangcach(B);
		System.out.println("Khoang cach giua hai diem A va B:"+dodai);
	}
	
}