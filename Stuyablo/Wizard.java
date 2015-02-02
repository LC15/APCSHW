import java.util.Random;

public class Wizard extends Adventurer{
    private int mana;
    private Random rand=new Random();

 
    public Wizard(String n, int mana, int intel){
	super(n);
	this.setMana(mana);
	this.setINT(intel);}
    public Wizard(){
	this("Timothy", 25,5);}
    public Wizard(String n){
	this(n, 25,5);
    }

    public void setMana(int m){
	mana = m;
    }
    public int getMana(){
	return mana;
    }

   

 public void attack(Adventurer other){
     int damage=rand.nextInt(5);
	    if (damage >1){
		other.setHP(other.getHP()-damage+1);
		System.out.println(this.getName()+" attacked "+other.getName());}
	    else{
		System.out.println( this.getName() + " failed to attack " + other.getName());}
 }
    public void specialAttack(Adventurer other){
	int ran=rand.nextInt(3);
	if(ran>0){
	    if (this.getMana()>10){other.setHP(other.getHP()/2);
		System.out.println(this.getName()+" attacked "+other.getName());}
	    else{System.out.println(this.getName()+" needs more mana!");}}
       
	 else{System.out.println(this.getName()+" failed to attack "+other.getName());}
       

	}
}
