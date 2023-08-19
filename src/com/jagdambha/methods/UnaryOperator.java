package com.jagdambha.methods;

public class UnaryOperator {

	public static void main(String[] args) {
		
		UnaryOperator operator = new UnaryOperator();
		operator.postIncrement();
		operator.preIncrement();
		operator.postDecrement();
		operator.preDecrement();
		
		operator.mixed();

	}

	public void mixed() {
		
		int z = 67;
		System.out.println(z--);//67 , 66
		System.out.println(z++);//66 , 67
		System.out.println(++z);//68 , 68
		System.out.println(z--);//68 , 67
		System.out.println(--z);//66 , 66
		System.out.println(--z);//65 , 65
		System.out.println(++z);//66 , 66
		System.out.println(z++);//66 , 67
		System.out.println(z++);//67 , 68
		System.out.println(z);
		
	}

	public void preDecrement() {
		int a = 56;
//		--a;
//		System.out.println(--a);
		// 56 stack = 55 
		int c = --a + a-- + a++;//110,162,167,166
		System.out.println(c);
		
	}

	public void postDecrement() {
		
		int y = 21;

		System.out.println(y--);
		System.out.println(y);
		
	}

	public void preIncrement() {
		int x = 10;
//		++x;
		System.out.println(++x);
		
	}

	public void postIncrement() {
		int x = 10;
//		x++;
		System.out.println(x++);
		
	}
	
	

}
