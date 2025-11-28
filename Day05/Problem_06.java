import java.util.Scanner;
interface Exporter {
    void export(String data);
}

class PDFExporter implements Exporter {
    public void export(String data) {
        System.out.println("Exporting to PDF: " + data);
    }
}

class CSVExporter implements Exporter {
    public void export(String data) {
        System.out.println("Exporting to CSV: " + data);
    }
}

class DatabaseExporter implements Exporter {
    public void export(String data) {
        System.out.println("Exporting to Database: " + data);
    }
}

public class Problem_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. PDF Exporter");
        System.out.println("2. CSV Exporter");
        System.out.println("3. Database Exporter");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter data to export: ");
        String data = sc.nextLine();

        Exporter exporter;

        if (choice == 1) {
            exporter = new PDFExporter();
        } else if (choice == 2) {
            exporter = new CSVExporter();
        } else {
            exporter = new DatabaseExporter();
        }

        exporter.export(data);
    }
}
