package org.system;

public class Desktop {

	public void desktopSize() {

		System.out.println("The Desktop size is 18inch ");

	}
	public static void main(String[] args) {

		Computer c = new Computer(); //Single inheritance
		c.computerModel();
		c.desktopSize();
	}
}

