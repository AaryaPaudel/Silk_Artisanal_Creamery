/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.silk.controller.algorithms;

import com.silk.model.IceCreamModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aaryapaudel LMU ID:23048670
 */
public class InsertionSort {
    private List<IceCreamModel> iceCreamSortList;

    public InsertionSort() {
        iceCreamSortList = new ArrayList<>();
    }

    /**
     * Sorts a list of IceCreamModel objects by their flavor in ascending or descending order.
     *
     * @param iceCreamList the list of IceCreamModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return the sorted list
     */
    public List<IceCreamModel> sortByFlavor(List<IceCreamModel> iceCreamList, boolean isDesc) {
        this.iceCreamSortList.clear();
        this.iceCreamSortList.addAll(iceCreamList);

        if (iceCreamSortList == null || iceCreamSortList.isEmpty()) {
            throw new IllegalArgumentException("Ice cream list cannot be null or empty.");
        }

        for (int i = 1; i < iceCreamSortList.size(); i++) {
            IceCreamModel current = iceCreamSortList.get(i);
            int j = i - 1;

            while (j >= 0 && shouldSwap(iceCreamSortList.get(j).getflavourName(), current.getflavourName(), isDesc)) {
                iceCreamSortList.set(j + 1, iceCreamSortList.get(j));
                j--;
            }

            iceCreamSortList.set(j + 1, current);
        }

        return iceCreamSortList;
    }

    /**
     * Determines whether two string values should be swapped based on the sort order.
     *
     * @param previous the previous value
     * @param current the current value
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return true if the values should be swapped; false otherwise
     */
    private boolean shouldSwap(String previous, String current, boolean isDesc) {
        int comparison = previous.compareTo(current);
        return isDesc ? comparison < 0 : comparison > 0;
    }
}

