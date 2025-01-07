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
public class MergeSort {
    /**
     * Sorts a list of IceCreamModel objects by their stock quantity in ascending or descending order.
     *
     * @param iceCreamList the list of IceCreamModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return the sorted list
     */
    public List<IceCreamModel> sortByStockQuantity(List<IceCreamModel> iceCreamList, boolean isDesc) {
        if (iceCreamList == null || iceCreamList.isEmpty()) {
            throw new IllegalArgumentException("Ice cream list cannot be null or empty.");
        }

        return mergeSort(iceCreamList, isDesc);
    }

    /**
     * Recursively divides and merges the list for sorting.
     *
     * @param iceCreamList the list to be sorted
     * @param isDesc specifies the sort order
     * @return the sorted list
     */
    private List<IceCreamModel> mergeSort(List<IceCreamModel> iceCreamList, boolean isDesc) {
        if (iceCreamList.size() <= 1) {
            return iceCreamList;
        }

        int mid = iceCreamList.size() / 2;

        List<IceCreamModel> left = new ArrayList<>(iceCreamList.subList(0, mid));
        List<IceCreamModel> right = new ArrayList<>(iceCreamList.subList(mid, iceCreamList.size()));

        left = mergeSort(left, isDesc);
        right = mergeSort(right, isDesc);

        return merge(left, right, isDesc);
    }

    /**
     * Merges two sorted lists into one sorted list based on the order.
     *
     * @param left the left sublist
     * @param right the right sublist
     * @param isDesc specifies the sort order
     * @return the merged sorted list
     */
    private List<IceCreamModel> merge(List<IceCreamModel> left, List<IceCreamModel> right, boolean isDesc) {
        List<IceCreamModel> mergedList = new ArrayList<>();

        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (shouldSwap(left.get(i).getstockQuantity(), right.get(j).getstockQuantity(), isDesc)) {
                mergedList.add(right.get(j));
                j++;
            } else {
                mergedList.add(left.get(i));
                i++;
            }
        }

        while (i < left.size()) {
            mergedList.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            mergedList.add(right.get(j));
            j++;
        }

        return mergedList;
    }

    /**
     * Determines whether the two integers should be swapped based on the sort order.
     *
     * @param leftValue the value from the left list
     * @param rightValue the value from the right list
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return true if the values should be swapped; false otherwise
     */
    private boolean shouldSwap(int leftValue, int rightValue, boolean isDesc) {
        return isDesc ? leftValue < rightValue : leftValue > rightValue;
    }
}

