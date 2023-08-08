package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        String name;
        String jobTitle;
        int year;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 5; i++) {
                System.out.println("---------Enter----------");
                System.out.print("name: ");
                name = reader.readLine();
                System.out.print("job Title: ");
                jobTitle = reader.readLine();
                System.out.print("year: ");
                year = Integer.parseInt(reader.readLine());
                if (year > 2023 || year < 2000)
                    throw new InvalidYear("Year is not correct");
                workers.add(new Worker(name, jobTitle, year));

            }
        } catch (IOException | InvalidYear e) {
            System.out.println(e.getMessage());
        }
        System.out.println(workers);
    }

}

class InvalidYear extends Exception {
    public InvalidYear(String message) {
        super(message);
    }
}
