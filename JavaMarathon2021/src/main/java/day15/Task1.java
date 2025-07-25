package day15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String pathIn = "JavaMarathon2021\\src\\main\\resources\\shoes.csv";

        String pathOut = "JavaMarathon2021\\src\\main\\resources\\outOfStock.csv";

        writeFile(pathOut, readFile(pathIn));
    }

    public static List<Shoes> readFile(String path) {

        List<Shoes> outOfStock = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(path));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.split(";").length != 3) {
                    throw new IllegalArgumentException();
                }

                if (Integer.parseInt(line.split(";")[2]) == 0) {
                    outOfStock.add(new Shoes(line.split(";")[0],
                            Integer.parseInt(line.split(";")[1]),
                            Integer.parseInt(line.split(";")[2])));
                }
            }
            scanner.close();

        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
        return outOfStock;
    }

    public static void writeFile(String path, List<Shoes> outOfStock) {

        try {
            PrintWriter writer = new PrintWriter(path, StandardCharsets.UTF_8);

            for (Shoes shoes : outOfStock) {
                writer.println(shoes);
            }
            writer.close();

        } catch (IOException e) {
            System.out.println("Ошибка записи");
        }


    }
}
