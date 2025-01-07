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
public class SelectionSort {
    List<IceCreamModel> iceCreamSortList;

    
    public SelectionSort(){
        iceCreamSortList = new ArrayList<>();
    }
    /**
     * Sorts a list of StudentModel objects by their LMU ID in ascending or
     * descending order.
     *
     * @param studentList the list of StudentModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<IceCreamModel> sortBySilkId(List<IceCreamModel> studentList, boolean isDesc) {
        this.iceCreamSortList.clear();
        this.iceCreamSortList.addAll(studentList);
        if (iceCreamSortList == null || iceCreamSortList.isEmpty()) {
            throw new IllegalArgumentException("Student list cannot be null or empty.");
        }

        for (int i = 0; i < iceCreamSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(iceCreamSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(iceCreamSortList, i, extremumIndex);
            }
        }

        return iceCreamSortList;
    }

    /**
     * Finds the index of the extremum value (minimum or maximum) in the list
     * from the start index.
     *
     * @param studentSortList the list of StudentModel objects
     * @param startIndex the index to start searching from
     * @param isDesc specifies whether to find the maximum (true) or minimum
     * (false)
     * @return the index of the extremum value
     */
    private int findExtremumIndex(List<IceCreamModel> studentSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < studentSortList.size(); j++) {
            if (shouldSwap(studentSortList.get(j).getsilkId(), studentSortList.get(extremumIndex).getsilkId(), isDesc)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     *
     * @param current the current value
     * @param extremum the current extremum value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwap(int current, int extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }

    /**
     * Swaps two elements in the list.
     *
     * @param studentSortList the list of StudentModel objects
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(List<IceCreamModel> studentSortList, int i, int j) {
        IceCreamModel temp = studentSortList.get(i);
        studentSortList.set(i, studentSortList.get(j));
        studentSortList.set(j, temp);
    }
}

    

