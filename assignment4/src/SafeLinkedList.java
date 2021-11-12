import java.util.LinkedList;

public class SafeLinkedList {
    private LinkedList<Integer> linkedList;
    private Object obj;


    public SafeLinkedList(){
        linkedList= new LinkedList<Integer>();
        obj= new Object();
    }

    public void addAtPosition(int idx, int element){

        int size= linkedList.size();

        synchronized (obj){
            LinkedList<Integer> cur = new LinkedList();
            if (size ==0  || idx==0 ){
                linkedList.addFirst( element);
            }
            else if(idx== size ){ //insert the last
                linkedList.addLast( element);
            }
            else if(idx<0 || idx>= size){  //idx out of bound
                System.out.println("Wrong index operation.");
            }
            else  {   // linkedList.size()>1 )
                linkedList.add(idx, element);
                }
            }
            return;

    }


    public void removeAtPosition(int idx, int element){
        int size= linkedList.size();
        synchronized (obj){
            if (size==0 || idx> size-1 || idx<0){
                System.out.println("Wrong index operation.");
            }
            else if (idx==0) {
                linkedList.removeFirst();
            }
            else if (idx==size-1){
                linkedList.removeLast();
            }else{
                linkedList.remove(idx);
            }
        }

    }

    public Integer getFirst(){
        synchronized (obj){
            return linkedList.getFirst();
        }
    }

    public Integer getLast(){
        synchronized(obj){
            return linkedList.getLast();
        }
    }

    public int size(){
        synchronized (obj){
            return linkedList.size();
        }
    }
    public void printList(  ){
        System.out.println(linkedList);
    }


}
