package ru.sectorsj.algorithms_structures.lesson2.hw;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sort {

    public static final int NOTEBOOKS_COUNT = 10000;

    public static void main(String[] args) {
        List<Notebook> notebooks = initListNotebooks();

        long timeStart = System.currentTimeMillis();

        //Сортировка - выбором
        //notebooks = SortNoteBookSelection.sort(notebooks);

        //Сортировка - компаратором
        SortNoteBookSelection.sortLight(notebooks);


        long timeEnd = System.currentTimeMillis();

        displayNoteBooks(notebooks);
        System.out.printf("Прошло времени: %dms", timeEnd - timeStart);
    }

    private static void displayNoteBooks(List<Notebook> list) {
        for (Notebook noteBook : list) {
            System.out.printf("Ноутбук:\tс\\н: %s, \tцена: %s, \tпамять: %s, \tпроизводитель: %s%n", noteBook.getSerialId(),
                    noteBook.getPrice(),
                    noteBook.getRam(),
                    noteBook.getManufacturer());
        }
    }

    private static ArrayList<Notebook> initListNotebooks() {
        ArrayList<Notebook> arrayList = new ArrayList<>();
        for (int i = 0; i < NOTEBOOKS_COUNT; i++) {
            arrayList.add(createNotebook());
        }
        return arrayList;
    }

    private static Notebook createNotebook(){
        Random random = new Random();
        BigDecimal price = BigDecimal.valueOf(random.nextInt(50) * 500 + 3000);
        int ram = (random.nextInt(4) + 4) * 24;
        int manufacturerCount = Notebook.Manufacturer.values().length;
        Notebook.Manufacturer manufacturer = Notebook.Manufacturer.values()[random.nextInt(manufacturerCount)];
        return new Notebook(price, ram, manufacturer);
    }
}
