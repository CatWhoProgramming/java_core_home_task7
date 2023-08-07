package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Price> list = readData();
        Collections.sort(list);
        System.out.println(list);
        showShop(list);

    }

    private static void showShop(ArrayList<Price> list) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String shop = reader.readLine();
            if (shop.equals(""))
                throw new InvalidNameShop("Shop cannot be empty");
            for (int i = 0; i < list.size(); i++) {

                if (shop.equals(list.get(i).shop))
                    System.out.println(list.get(i).name + " " + list.get(i).price);
                else System.out.println("This shop is not a real");

            }
        } catch (InvalidNameShop e) {
            System.out.println("invalid shop");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static ArrayList<Price> readData() {
        ArrayList<Price> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            String name = input.next();
            String shop = input.next();
            double price = input.nextDouble();
            list.add(new Price(name, shop, price));
        }
        return list;
    }


}

class InvalidNameShop extends Exception {
    public InvalidNameShop(String massage) {
        super(massage);
    }
}
