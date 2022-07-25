package week3.assignment5;

public class Automation extends MultipleLangauge implements Language,TestTool {

	/*Assignment 5 on Abstraction,
		===========
			Interface :Language
		     Methods   :Java()
		     Interface :TestTool
		     Methods   :Selenium()
		     AbstractClass :MultipleLangauge
		     Methods   :python() and un implemented method as ruby()
		  Execution class: Automation 
		Implement all the methods of interface and abstract class in Automation class*/


	public void Selenium() {
		System.out.println("Training for Selenium");
	}

	public void Java() {
		System.out.println("Training for Java");	
	}

	@Override
	public void ruby() {

		System.out.println("Training for Ruby");
	}

	public static void main(String[] args) {

		Automation at = new Automation();
		at.Selenium(); //Interface- TestTool
		at.Java(); // Interface - Language
		at.python(); // created in MultipleLanguage abstract class
		at.ruby(); // unimplemented method created in MultipleLanguage abstract class


	}
}
