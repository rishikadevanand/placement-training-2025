public class problem_03{
public static void main(String[] args){
    String[] arr = {"hello","hi","where","java"};
    int smallestlength = arr[0].length();
    String smalleststring = arr[0];
    for(int i=0 ; i<arr.length;i++){
        if(arr[i].length()<smallestlength){
            smallestlength =arr[i].length();
            smalleststring = arr[i];
        }
    }
    System.out.println("Smallest string is: " + smalleststring);
    }
}
