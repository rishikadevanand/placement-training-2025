import java.util.Scanner;
interface PluggedIn 
{
    void load();
    void execute();
    void unload();
}

class ImageEditorPlugin implements PluggedIn 
{
    public void load() 
    {
        System.out.println("Image Editor Plugin - Loaded");
    }
    public void execute() 
    {
        System.out.println("Image Editor Plugin is Executing");
    }
    public void unload() 
    {
        System.out.println("Image Editor Plugin - Unloaded");
    }
}

class MusicEditorPlugin implements PluggedIn
 {
    public void load() 
    {
        System.out.println("Music Editor Plugin Loaded");
    }
    public void execute()
     {
        System.out.println("Music Editor Plugin Executing");
    }
    public void unload() 
    {
        System.out.println("Music Editor Plugin Unloaded");
    }
}

public class Problem_05 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Image Editor Plugin/n 2.Music Editor Plugin");
       
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        PluggedIn plgin;

        if (choice == 1) {
            plgin = new ImageEditorPlugin();
        } else {
            plgin = new MusicEditorPlugin();
        }

        plgin.load();
        plgin.execute();
        plgin.unload();
    }
}
