/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)

public class ASCIIArt {

	public static void main(String[] args) {
		System.out.println("It's A  Canadaian Flag!");
		ln();
		empty();
		ln();
		empty();
		ln();
		body();
		last();
		ln();
		last();
		ln();
		last();
		ln();
		empty();
	}
		
	public static void sides() {
		System.out.print("canadacanadacana");	
	}
	
	public static void ln() {
		System.out.println();
	}
	
	public static void empty() {
		sides();
		System.out.print("                                     ");
		sides();
	}
	
	public static void last() {
		sides();
		System.out.print("                  c                  ");
		sides();
	}
	
	public static void body() {
		sides();
		System.out.print("                 / \\                 ");
		sides();
		ln();
		sides();
		System.out.print("                canad                ");
		sides();
		ln();
		sides();
		System.out.print("            ca nadacan ad            ");
		sides();
		ln();
		sides();
		System.out.print("             canadacanad             ");
		sides();
		ln();
		sides();
		System.out.print("           c anadacanada c           ");
		sides();
		ln();
		sides();
		System.out.print("      \\an ada canadacan ada ca/      ");
		sides();
		ln();
		sides();
		System.out.print("       canadacanadacanadacanad       ");
		sides();
		ln();
		sides();
		System.out.print("       canadacanadacanadacanad       ");
		sides();
		ln();
		sides();
		System.out.print("     canadacanadacanadacanadacan     ");
		sides();
		ln();
		sides();
		System.out.print("        canadacanadacanadacan        ");
		sides();
		ln();
		sides();
		System.out.print("          canadacanadacanad          ");
		sides();
		ln();
		sides();
		System.out.print("         canad   aca   nadac         ");
		sides();
		ln();
	}
	
}