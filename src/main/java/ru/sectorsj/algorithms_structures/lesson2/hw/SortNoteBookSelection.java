package ru.sectorsj.algorithms_structures.lesson2.hw;

import ru.sectorsj.algorithms_structures.lesson2.sort.SelectionSort;

import java.util.Comparator;
import java.util.List;

public class SortNoteBookSelection extends SelectionSort {

    public static List<Notebook> sort(List<Notebook> notebooks) {
        int min = 0;

        for (int i = 0; i < notebooks.size() - 1; i++) {
            min = i;

            for (int j = i + 1; j < notebooks.size(); j++) {
                if(notebooks.get(j).compareTo(notebooks.get(min)) < 0) {
                    min = j;
                }
            }

            if (i == min) {
                continue;
            }

            Notebook temp = notebooks.get(i);
            notebooks.set(i, notebooks.get(min));
            notebooks.set(min, temp);
        }

        return notebooks;
    }

    public static void sortLight(List<Notebook> notebooks) {
        Comparator<Notebook> comparator = Comparator.comparing(Notebook::getPrice)
                .thenComparing(Notebook::getRam)
                .thenComparing(Notebook::getManufacturer);
        notebooks.sort(comparator);
    }
}
