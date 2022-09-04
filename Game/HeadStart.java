import java.util.ArrayList;

class HeadStart {

public static void main(String[] args){
	System.out.println("Hello World");

	ArrayList<Integer> myList = new ArrayList<Integer>();
	myList.add(12);
	System.out.println(myList.get(0));
	myList.add(34);
	System.out.println(myList);
	myList.set(0, 99);
	System.out.println(myList);	
	myList.remove(1);
	System.out.println(myList);
	System.out.println(myList.size());
	myList.clear();
	System.out.println(myList.isEmpty());

	for(int i = 0; i<10; i++){
		myList.add(i);
		}
 	
	System.out.println(myList);

	for(int i : myList){
		myList.set(i, myList.get(i) + 10);
		}
	System.out.println(myList);

	}


}