import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordSearch{
    private char[][]puzzle;
    private File bank;
    private Scanner input;
    private Random rand = new Random();
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private ArrayList<String> wordkey = new ArrayList<String>(); 
    private boolean finishit = true;

    public WordSearch(int rows,int cols,String filename)throws FileNotFoundException{
        puzzle = new char[rows][cols];
        bank = new File(filename);
        input = new Scanner(bank);
        SetAll();
    }
    public WordSearch(int rows,int cols,String filename,long randSeed,int answer) throws FileNotFoundException{
        puzzle = new char[rows][cols];
        bank = new File(filename);
        input = new Scanner(bank);
        rand.setSeed(randSeed);
        if (answer == 1){
            finishit = false;
        }
        SetAll();
    }

    private void SetAll(){
        for (int q = 0;q<puzzle.length;q++){
            for (int p = 0;p<puzzle[q].length;p++){
                puzzle[q][p] = '_';
            }
        }
    }

    public String toString(){
        System.out.println(wordsListed());
        String result = "";
        for (int q = 0;q<puzzle.length;q++){
            for (int p = 0;p<(puzzle[q].length);p++){
                result += puzzle[q][p] + " ";
            }
            result+="\n";
        }
        return result;
    }

    public boolean checkW(String word,int row,int col,int dx,int dy){
        if ((dx < -1 || dx > 1 || dy < -1 || dy > 1) || (dx == 0 && dy == 0) || (row+dy < 0) || (col+dx < 0)){
            return false;
        }

        for(int i = 0; i < word.length(); i++){
            if((row+i*dy < 0 || row+i*dy >= puzzle.length) || (col+i*dx < 0 || col+i*dx >= puzzle[0].length) || puzzle[row+i*dy][col+i*dx] != '_' && word.charAt(i) != puzzle[row+i*dy][col+i*dx]){
                return false;
            }
        }
        return true;
    }

    public boolean addW(String word,int row, int col, int dx, int dy){
        if (checkW(word,row,col,dx,dy)){
            wordkey.add(word);
            for (int q = 0;q<word.length();q++){
                puzzle[row+q*dy][col+q*dx] = word.charAt(q);
            }
            return true;
        }
        return false;
    }

    public String wordsListed(){
        String result = "";
        for (Object word : wordkey){
            result+=word;
            result+="\n";
        }
        return result;
    }

    public void setSeed(long seed){
        rand.setSeed(seed);
    }

    public void wordload(){
        while (input.hasNextLine()){
            String a = input.nextLine();
            outerloop:
            for(int i = 0;i<(rand.nextInt(9)+1);i++){
                if(addW(a,rand.nextInt(puzzle.length),rand.nextInt(puzzle[0].length),rand.nextInt(3)-1,rand.nextInt(3)-1)){
                    break outerloop;
                }
            }
        }
    }

    public void fillItUp(){
        for (int q = 0;q<puzzle.length;q++){
            for (int p = 0;p<(puzzle[0].length);p++){
                if (puzzle[q][p] == '_'){
                    puzzle[q][p] = alphabet.charAt(rand.nextInt(alphabet.length()));
                }
            }
        }
    }
}
