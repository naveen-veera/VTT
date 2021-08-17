package contoller;

import java.util.Scanner;

import model.User;



class Demo{
	public void showDemo() {
		System.out.println(" I am demo Class");
	}
	
	public void showDemo(int a) {
		System.out.println(" I am demo2 Class");
	}
}

class Demo2 extends Demo{
	public void showDemo() {
		System.out.println(" I am demo2 Class");
	}
}

class Demo3 extends Demo{
	public void showDemo() {
		System.out.println(" I am demo3 Class");
	}
}

class Demo4 extends Demo{
	public void showDemo() {
		System.out.println(" I am demo3 Class");
	}
}


public class Login{

	public static void main(String[] args) {

		Demo2 demo2 = new Demo2();
		demo2.showDemo();
	}

}

//github
