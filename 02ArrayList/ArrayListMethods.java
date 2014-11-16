import java.util.ArrayList;
public class ArrayListMethods{
    public static void collapseDuplicate(ArrayList<Integer> L){
	for(int n=0;n<L.size()-1;n++{
		if(L.get(i).equals(L.get(i+1))){L.remove(i);
		    i--;}}}}
    public static void randomize(ArrayList<Integer> L){
	new ArrayList<Integer> NewL;
	Random ra=new Random();
	for(int n=0;n<L.size();n++){
	    int num=ra.nextInt(L.size());
	    int keep=L.get(n);
	    L.set(n,L.get(num);
		  L.set(num,keep);}
	}
}

