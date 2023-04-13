package ss10.bai_tap.arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(5);
        myList.add(2);
        myList.add(55);
        myList.add(56);
        myList.add(1);
       // myList.addd(3,100);
        myList.remove(1);
        myList.display();


    }
}
