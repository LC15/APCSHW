import java.util.Random;

public class Rogue extends Adventurer{
    private int endurance;
    private Random rando=new Random();

    public Rogue(){
	setName("Bob");
	setEndurance(20);
	setHP(50);

    }
    public Rogue(String n, int e, int dx){
	super(n);
	setEndurance(e);
	this.setDEX(dx);
    }
    public Rogue(String n){
	this(n,20,10);}
    public void setEndurance(int e){
	endurance=e;}
    public int  getEndurance(){
	return endurance;}

 

 public void specialAttack(Adventurer other){
     int rand;
     rand=rando.nextInt(3);
	if(rand>0){
	    if (this.endurance>10){other.setHP(other.getHP()/2);
		System.out.println(this.getName()+" attacked "+other.getName());}
	    else{System.out.println(this.getName()+" needs more endurance!");}}
	 else{System.out.println(this.getName()+" failed to attack "+other.getName());}
 }


 public String getStats(){
return this.getName() + "\nHP= " + this.getHP() + "\nSTR= " + this.getSTR() + "\nDEX= " + this.getDEX() + "\nINT= " + this.getINT();
    }
    
}
