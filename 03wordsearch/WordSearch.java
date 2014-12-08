import java.util.*;
import java.io.FileNotFoundException;
public class WordSearch{
    Integer rows;
    Integer cols;
    char[][] puzzle;
    char [][] ans;
    String wordkey;
    Random rand=new Random();
   
    public WordSearch(int rows, int cols, String file)throws FileNotFoundException{
	puzzle=new char[rows][cols];
	SetAll();  }


    public WordSearch(int rows, int cols, String file, long randSeed, int answer) throws FileNotFoundException{
	puzzle= new char [rows][cols];
	rand.setSeed(randSeed);
	SetAll();
    }
    public void SetAll(){
	for(int i=0;i<rows;i++){
	    for(int n=0;n<cols;n++){
		puzzle[i][n]='_';}}}
    //for clearing the puzzle and setting everything to '_'
   
    public void toString(String word){
	wordkey+="/n"+word;}
    //not sure how this would work tbh

    public boolean WorkPlease(String word,int rows, int cols, int dx, int dy){
	if (dx<-1||dx>1||dy<-1||dy>1||(dx==0&&dy==0)){return  false;}
	for(int i=0; i<word.length();i++){
	    if((rows+i*dy<0||rows+i*dy>=puzzle.length)||(cols+i*dx<0||cols+i*dx>=puzzle[0].length)||puzzle[rows+i*dy][cols+i*dx]!='_'&&word.charAt(i)!=puzzle[rows+i*dy][cols+i*dx]){return false;}
	}
	return true;
}
    //check if word fits and if dx and dy are good;

    public boolean addW(String word,int rows, int cols, int dx, int dy){
	if (WorkPlease(word,rows,cols,dx,dy)){
	    toString(word);	
	for(int i=0; i<word.length(); i++){
	    puzzle[rows+i*dy][cols+i*dx]=word.charAt(i);}
	return true;}
	else{return false;}
    }
    //adds word to actual puzzle and stringthing
    public void setSeed(long seed){
	rand.setSeed(seed);}
    //setseed. 
  

public void loadWordsFromFile(String filename ,boolean fillRandomLetters){}
    
    public void fillItUp(){
	for(int i=0;i<rows;i++){
	    for(int c=0;c<puzzle[rows].length;c++){puzzle[i][c]=ans[i][c];} }
	for(int f=0;f<rows;f++){
	    for(int fc=0;fc<puzzle[rows].length;fc++){
		if(puzzle[f][fc]=='_'){
		    Random letter=new Random();
		    letter.nextInt(27);
		    int le=letter;
		    puzzle[f][fc]="abcdefghijklmnopqrstuvwxyz".charAt(le);
		}}}}
}
 
 


