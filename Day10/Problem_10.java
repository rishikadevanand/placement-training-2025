// program to add elements in linked list and to reverse the linked list without using Collections.reverse()
 import java.util.LinkedList;
 public class Problem_10
 {
     public static void main(String[] args)
     {
         LinkedList <Integer> ll = new LinkedList<>();
         ll.add(11);
         ll.add(22);
         ll.add(33);
         ll.add(44);
         ll.add(55);
 
         System.out.println("Elements in Linked List are :" +ll);
         
         LinkedList<Integer> reversedList = new LinkedList<>();
         for (int i = ll.size() - 1; i >= 0; i--) {
             reversedList.add(ll.get(i));
         }
         
         System.out.println("Elements in Linked List after reversing are :" +reversedList);
     }
 }