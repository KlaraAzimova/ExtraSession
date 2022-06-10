package com.peaksoft.comparator;

import com.peaksoft.Cast;

import java.util.Comparator;

public class ComparatorByActor implements Comparator<Cast> {

    @Override
    public int compare(Cast o1, Cast o2) {
        return o1.getActor().compareTo(o2.getActor());
    }
}
