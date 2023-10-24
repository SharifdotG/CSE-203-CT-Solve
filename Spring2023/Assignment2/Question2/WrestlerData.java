package Question2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WrestlerData {
    public static void main(String[] args) {
        ArrayList<Wrestler> wrestlers = new ArrayList<>();
        wrestlers.add(new Wrestler("John Cena", 46, "Attitude Adjustment"));
        wrestlers.add(new Wrestler("The Rock", 51, "Rock Bottom"));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Programming\\JetBrains\\CSE203Assignment2\\src\\Question2\\data.txt"))) {
            for (Wrestler wrestler : wrestlers) {
                writer.write(wrestler.toString() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
