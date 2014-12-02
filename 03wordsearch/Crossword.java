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
    public void Horizon(String word){
	if (word.length() <col+1){
	    Random r=new Random();
	    r.nextInt(2);
	    Random chooseRow=new Random();
	    int chosenR=chooseRow.nextInt(rows+1);
	    if (r.equals(0)){
		for(int index=0;index<word.length();index++){
		    if (!puzzle[chosenR][index].equals(word.substring(index,index))|| !puzzle[chosenR][index].equals(null)){Horizon(word);}
		    puzzle[chosenR][index]=word.substring(index,index);}
		}
	    else{
		int diff=puzzle[chosenR].length()-word.length();
		for(int i=0;i<word.length();i++){
		    puzzle[chosenR][puzzle[chosenR].length()-diff-i]=word.substring(i,i);}
		}
}
    
    }
	    public void Vert(String word){	
		if (word.length() <rows+1){
		    Random r=new Random();
		    r.nextInt(2);
		    Random chooseCol=new Random();
		    int chosenC=chooseCol.nextInt(col+1);
		     if (r.equals(0)){
			 for(int index=0;index<word.length();index++){
			    if(!puzzle[index][chosenC].equals(word.substring(index,index))||!puzzle[index][chosenC].equals(null)){Vert();} 			   
			    puzzle[index][chosenC]=word.substring(index,index);}
		     }
		     else{
			int diff=puzzle[rows]-word.length;
			for(int index=0;index<word.length;index++){
			    if(!puzzle[rows-index][chosenC].equals(word.substring(index,index))||!puzzle[rows-index][chosenC].equals(null)){Vert();} 			   
			    puzzle[rows-index][chosenC]=word.substring(index,index);}

			}
		}}
	    public void diagonal(String word){}
}

 
