class Media {
    void play() {
        System.out.println("Playing media...");
    }
}

class Audio extends Media {
    void play() {
        System.out.println("Playing audio file");
    }
}

class Video extends Media {
    void play() {
        System.out.println("Playing video file");
    }
}

public class Problem_04 {
    public static void main(String[] args) {

        Media m1 = new Audio();  // Upcasting
        m1.play();               // Calls Audio play()

        Media m2 = new Video();  // Upcasting
        m2.play();               // Calls Video play()
    }
}
