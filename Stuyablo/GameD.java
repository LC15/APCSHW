import java.util.Arrays;
import java.util.*;
public class GameD{
	public static void main (String[] args){
	    Adventurer[] Party;
	    Adventurer opponent;

	System.out.println("Would you like a \n 1. Customize Party \n 2. Default Party");
	Scanner choose=new Scanner(System.in);
	int choice=choose.nextInt(); 
	if(choice==1){
	    System.out.println("How many players would you like in your party?");
	    Scanner nP=new Scanner(System.in);
	    int numP=nP.nextInt();
	    Party= new Adventurer[numP];
	    for(int i=0; i<numP+1; i++){
		System.out.println("What would you like Player"+""+i+" to be? \n 1. Warrior \n 2. Wizard  \n 3. Rogue");
		Scanner t=new Scanner(System.in);
		int type=t.nextInt();		
		if(type==1){Party[i]=new Warrior();}
		if(type==2){Party[i]=new Wizard();}
		if(type==3){Party[i]=new Rogue();}
	    }//name players or nah?

	    
	Random rrr=new Random();
	int oppType=rrr.nextInt(3);
	if(oppType==0){opponent= new Wizard();} n
	if(oppType==1){opponent= new Rogue();}
	if(oppType==2){opponent= new Warrior();}

	   
	    System.out.println("Let's begin the battle! \1. attack \n 2. specialattack");
	    Scanner att=new Scanner(System.in);
	    int attackType=att.nextInt();
	    Random rand= new Random();
	    Adventurer a =Party[rand.nextInt(numP)];
	    if(attackType==1){a.attack(opponent);
			      System.out.println(a.getName()+" has attacked the opponent");
			      a.getStats();
	    }
	    if(attackType==2){a.specialAttack(opponent);}   
	  


	    
	}
	if(choice==2){
	    Party=new Adventurer[3];
	    Party[0]=new Wizard();
	    Party[1]=new Rogue();
	    Party[2]= new Warrior();}
	else{System.out.println("Please type either '1' or '2' to indicate your choice. \n 1. Customize Party \n 2. Default Party");
	}
}

}

     
    

    



