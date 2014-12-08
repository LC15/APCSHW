import java.util.*;
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
	puzzle= new char[rows][cols];
	ans=new char[rows][cols];}

    public void SetAll(){
	for(int i=0;i<rows;i++){
	    for(int n=0;n<cols;n++){
		puzzle[i][n]='_';}}}
    //for clearing the puzzle and setting everything to '_'
   
    public toString(word){
	wordkey+="/n"+word}
    //not sure how this would work tbh

    public boolean WorkPlease(String word,int rows, int cols, int dx, int dy){
	if (dx<-1||dx>1||dy<-1||dy>1||(dx==0&&dy==0)){return  false;}
	for(int i=0; i<word.length();i++){
	    if((rows+i*dy<0||rows+i*dy>=puzzle.length)||(cols+i*dx<0||cols+i*dx>=puzzle[0].length)||puzzle[rows+i*dy][cols+i*dx]!='_'&&word.charAt(i)!=puzzle[rows+i*dy][cols+i*dx]){return false;}
	}
	return true;
}
    //check if word fits;erase instance var?

    public boolean addW(String word,int rows, int cols, int dx, int dy){
	if WorkPlease(word,rows,cols,dx,dy){toString(word);}	
	for(int i=0; i<word.length(); i++){
	    puzzle[row+i*dy][col+i*dx]=word.charAt(i);}
    }
    //adds word to actual puzzle and stringthing
    public void setSeed(long seed){
	rand.setSeed(seed);}
    //setseed. 
    public void wordIn(word){
	addW(rand.nextInt(puzzle.length),rand.nextInt(puzzle[0].length),rand.nextInt(3)-1,rand.nextInt(3)-1); 
	     }

public void loadWordsFromFile(String filename ,boolean fillRandomLetters){}
    
    public void fillItUp(){
	for(int i=0;i<rows;i++){
	    for(int c=0;c<puzzle[rows].length;c++){puzzle[i][c]=ans[i][c];} }
	for(int f=0;f<rows;f++){
	    for(int fc=0;fc<puzzle[rows].length;fc++){
		if(puzzle[f][fc]=='_'){
		    Random letter=new Random();
		    int le=letter.nextInt(27);
		    puzzle[f][fc]="abcdefghijklmnopqrstuvwxyz".charAt(le);
		}}}}
    public static void main(String[] args){}


}

 
 


