import java.util.Random;
public class Warrior extends Adventurer{
    private int bonusHealth;
    private int Rage;
    
public Warrior(){
    super("Ted");
    
}
    public Warrior(String n,int rag, int strength){
	this.setName(n);
	this.setSTR(strength);
	this.setRage(rag);
    }
    public Warrior(String n){
	this(n,20,25);}
    public int getRage(){
	return Rage;}
    public void setRage(int rag){
	this.Rage=rag;}

    public int getHP(){
	return super.getHP()+bonusHealth;
    }
    

    public void attack(Adventurer other){
	Random random= new Random();	
	int damage;
	damage =random.nextInt(this.getSTR());
	if (damage>0){other.setHP(other.getHP()-damage-damage);
	    System.out.println(this.getName()+" attacked "+other.getName());}
	else{System.out.println(this.getName()+" failed to attack "+other.getName());}
    }
    public void specialAttack(Adventurer other){
	Random random2=new Random();
	int rand=random2.nextInt(3);
	if(rand>0){
	    if (this.getRage()>10){other.setHP(other.getHP()/2);System.out.println(this.getName()+" attacked "+other.getName());
		this.setRage(0);}
            else{System.out.println(this.getName()+" failed to attack "+other.getName());}
	}}}




