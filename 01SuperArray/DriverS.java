public class DriverS{


 public static void main(String[] args){
  
	SuperArray L= new SuperArray();
	L.add(new Integer (5));
	L.add(new Integer(99));
    L.add(new String("Working"));
    L.add(2015);
    System.out.println(L);//[5,99,Working,2015]
    L.resize(8);
    L.Size();//8
    L.get(99);//1 
    L.set(2, "Replaced");
    System.out.println(L);
    L.remove(1);
    System.out.println(L);
 }
}


