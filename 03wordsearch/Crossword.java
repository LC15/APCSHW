import java.util.Scanner;
import java.util.Random;
public class Crossword{
    Integer rows;
    Integer cols;
    char[][] puzzle;
    char [][] ans;
    String wordkey;
    public void SetSize(){
	System.out.println("How many rows would you like in this puzzle?");
	Scanner row=new Scanner(System.in);
        rows=Integer.valueOf(row.nextLine());
	System.out.println("How many columns would you like in this puzzle?");
	Scanner column=new Scanner (System.in);
	cols=Integer.valueOf(column.nextLine());
	puzzle= new char[rows][cols];}
    public void SetAll(){
	for(int i=0;i<rows;i++){
	    for(int n=0;n<cols;n++){
		puzzle[i][n]='_';}}}
    public void Horizon(String word){
	if (word.length() <cols+1){
	    Random r=new Random();
	    r.nextInt(2);
	    Random chooseRow=new Random();
	    int chosenR=chooseRow.nextInt(rows+1);
	    if (r.equals(0)){
		for(int index=0;index<word.length();index++){
		    if (puzzle[chosenR][index]==word.charAt(index)||puzzle[chosenR][index]=='_'){
		    puzzle[chosenR][index]=word.charAt(index);}
		    else{
			for(index--;index>-1;index--){
			    puzzle[chosenR][index]='_';}
			break;}
		}}
	  
	    else{
		int diff=puzzle[chosenR].length-word.length();
		for(int i=0;i<word.length();i++){ 
		    if( puzzle[chosenR][puzzle[chosenR].length-diff-i]==word.charAt(i)|| puzzle[chosenR][puzzle[chosenR].length-diff-i]=='_'){		  
			puzzle[chosenR][puzzle[chosenR].length-diff-i]=word.charAt(i);}
		    else{
			for (i--;i>-1;i--){
			    puzzle[chosenR][puzzle[chosenR].length-diff-i]='_';}
		}
		}}}}
	    //how to start over if a space is taken by a character
		
    
    
	    public void Vert(String word){	
		if (word.length() <rows+1){
		    Random r=new Random();
		    r.nextInt(2);
 		    Random chooseCol=new Random();
		    int chosenC=chooseCol.nextInt(cols+1);
		     if (r.equals(0)){
			 for(int index=0;index<word.length();index++){
			     if(puzzle[index][chosenC]==word.charAt(index)||puzzle[index][chosenC]=='_'){ 			   
				 puzzle[index][chosenC]=word.charAt(index);}
			 }}
				
		     else{
			 int diff=puzzle[rows].length-word.length();
			 for(int index=0;index<word.length();index++){
			    if(puzzle[rows-index][chosenC]==word.charAt(index)||puzzle[rows-index][chosenC]=='_'){			   
			    puzzle[rows-index][chosenC]=word.charAt(index);}
			    }

			}
		}}
	    public void diagonal(String word){
		if(word.length()<rows+1){
		    Random r=new Random();
		    r.nextInt(2);
		    Random startR=new Random();
		   int sR= startR.nextInt(rows-word.length());
		    Random startC=new Random();
		    int sC=startC.nextInt(cols-word.length());
		    if (r.equals(0)){		    
			    for(int i=0;i<word.length();i++){
				puzzle[sR+i][sC+i]=word.charAt(i);}}
			else{
			    int startBR=sR+rows-word.length();
			    int startBC=sC+cols-word.length();
			    for(int i=0;i<word.length();i++){
				puzzle[startBR][startBC]=word.charAt(word.length()-1-i);}}
		}

	    }
}

 
//have an add function and a function to check word size and a funcion to limit how many words are added to the puzzle. wordlist
//first  make functions that add words diagonally etc, a function that uses the 3 functions to add words.. there should be an upper and lower limit for number of words
//something to print the answers 


