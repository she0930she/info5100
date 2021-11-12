public class Main {

    public static void main(String[] args) {
	// write your code here
        SafeLinkedList list= new SafeLinkedList();
        list.addAtPosition(0, 0);
        list.addAtPosition(1,1);
        list.addAtPosition(2,2);
        list.addAtPosition(3,3);
        list.addAtPosition(4,4);
        list.printList();
        list.removeAtPosition(0, 0);
        list.removeAtPosition(3,3);
        list.printList();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());


    }




}
