class Student
{
    String name;
    int id;

    Student(String name , int id)
    {
        this.name = name;
        this.id = id;
    }
}

public class Problem_12
{
    public static void main(String[] args) 
    {
        Student s = new Student("Rishika" , 45);
        Student s1 = s;  //GC 
    }
}