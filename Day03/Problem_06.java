class person
{
    private String name;
    private int age;
    private String email;

    public String getname()
    {
        return name;
    }

    public void setname(String name)
    {
        this.name = name;
    }
    public int getage()
    {
        return age;
    }
    public void setage(int age)
    {
        this.age = age;
    }
    public String getemail()
    {
        return email;
    }
    public void setemail(String email)
    {
        this.email = email;
    }
    public void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Email: " + email);
    }
    public class Problem_06
    {
        public static void main(String[] args)
    {
        person p = new person();
        p.setname("Aarav");
        p.setage(20);
        p.setemail("aarav@gmail.com");
    }
}

}
    