import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Driverr{
	public static void main(String[]args) throws FileNotFoundException{
		WordSearch w = new WordSearch(5,5,"words.txt");
		boolean dun = true;
		if (args.length < 2){
			System.out.println("\nType this:");
			System.out.println("java Driverr [rows] [cols] [seed(optional) [answers(optional)]]");
			System.out.println("rows, cols, and seed must all be integers");
			System.out.println("For answers, enter 1");
			return;
		}
		if (args.length == 2){
			w = new WordSearch(Integer.parseInt(args[0]),Integer.parseInt(args[1]),"words.txt");
		}
		if (args.length == 3){
			w = new WordSearch(Integer.parseInt(args[0]),Integer.parseInt(args[1]),"words.txt",Long.parseLong(args[2]),0);
		}
		if (args.length == 4){
			w = new WordSearch(Integer.parseInt(args[0]),Integer.parseInt(args[1]),"words.txt",Long.parseLong(args[2]),Integer.parseInt(args[3]));
			if (Integer.parseInt(args[3]) == 1){
				dun = false;
			}
		}
		w.wordload();
		if (dun){
			w.fillItUp();
		}
		System.out.println(w);
	}
}
