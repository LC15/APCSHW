import java.util.Scanner;
import java.util.Random;
public class Crossword{
    Integer rows;
    Integer col;
    char[][] puzzle;
    public void SetSize(){
	System.out.println("How many rows would you like in this puzzle?");
	Scanner row=new Scanner(System.in);
        rows=Integer.valueOf(row.nextLine());
	System.out.println("How many columns would you like in this puzzle?");
	Scanner column=new Scanner (System.in);
	col=Integer.valueOf(column.nextLine());
	puzzle= new char[rows][col];}
    public void inputHor(String word){
	if (word.length() < rows+1 && word.length() <col+1){
	    Random r=new Random();
	    r.nextInt(2);
  
    }
    }


}

 
