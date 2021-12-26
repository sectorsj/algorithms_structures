package ru.sectorsj.algorithms_structures.lesson2.hw;

import lombok.Value;

import java.math.BigDecimal;
import java.util.UUID;

@Value
public class Notebook implements Comparable<Notebook> {

    BigDecimal price;
    int ram;
    Manufacturer manufacturer;
    UUID serialId = UUID.randomUUID();


    public enum Manufacturer {
        LENUVO, ASOS, MACNOTE, ESER, XAMIOU
    }

    @Override
    public int compareTo(Notebook notebook) {
        int result = price.compareTo(notebook.getPrice());

        if (result == 0) {
            result = Integer.compare(ram, notebook.getRam());
            if (result == 0) {
                result = manufacturer.compareTo(notebook.getManufacturer());
            }
            return result;
        }
        return result;
    }
}
