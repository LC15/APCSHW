public class SuperArray{
    Object[] array;
    int x;
    public SuperArray(){
	array= new Object[10];}
    public SuperArray(int n){
       
	array= new Object[n];}
    
public String toString(){
    	
	String s="[ ";
	for(Object ob :array){
	    s+=ob+",";}
	return s+"]";
}
    
public void add(Object e){
    //	Object[] LongerArray;
    resize(array.length+1);
	array[array.length-1]=e;
}


   
 public int Size(){
	int s=0;
	int a=0;	
	while (array[a]!=null){
	    a++;
	    s++;}
	return s;}
    
public void resize(int newCapacity){
	Object[] NewSArray;
	NewSArray=new Object[newCapacity];
	int a=0;

	while(a<newCapacity && a<array.length ){
	    NewSArray[a]=array[a];
	    a++;}
	array=NewSArray;}
	//will this even work?
   
 public Object get(int index){
	if(index>-1&&index<array.length){return array[index];}
	else{System.out.println("ERROR:number entered is out of range");
	    return null;}}
    public void add(int index, Object o){
	int a;
	Object[] more;
	more= new Object[array.length];
	more[index]=o;
	for(int j=0;j<index;j++){
	    more[j]=array[j];}
	for(a=index+1;a<array.length;a++){
	    more[a]=array[a];}}
 public Object set(int index, Object o){
     if (index>-1&&index<array.length){
	int a;
	Object[] more;
	more= new Object[array.length];
	more[index]=o;
	for(int j=0;j<index;j++){
	    more[j]=array[j];}
	for(a=index+1;a<array.length;a++){
	    more[a]=array[a];}
	return o;
}
     else{return "Index is out of range";}}

    public String remove(int index){
 	if(index>-1&&index<array.length){
	    array[index]=null;	    
	    return "Successfully removed";
	    }
	else{return "Index is out of range";}}

   
	
	

}
   
  
    




