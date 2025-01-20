/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.silk.controller.algorithms;

import com.silk.model.IceCreamModel;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aaryapaudel LMU ID:23048670
 */
public class BinarySearch {
    /**
     * Searches for an ice cream by its flavor name using binary search and updates the table.
     *
     * @param searchValue the flavor name to search for
     * @param iceCreamList the sorted list of IceCreamModel objects
     * @param left the starting index of the search range
     * @param right the ending index of the search range
     * @param table the JTable to update with the search result
     */
    public void searchAndUpdateTable(String searchValue, List<IceCreamModel> iceCreamList, int left, int right, JTable table) {
        IceCreamModel foundIceCream = searchByFlavorName(searchValue, iceCreamList, left, right);

        // Clear the table and update it with the search result
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows

        if (foundIceCream != null) {
            model.addRow(new Object[] {
                foundIceCream.getflavourName(),
                foundIceCream.getsilkId(),
                foundIceCream.getstockQuantity()
            });
        } else {
            System.out.println("Flavor not found.");
        }
    }

    /**
     * Searches for an ice cream by its flavor name using binary search.
     *
     * @param searchValue the flavor name to search for
     * @param iceCreamList the sorted list of IceCreamModel objects
     * @param left the starting index of the search range
     * @param right the ending index of the search range
     * @return the IceCreamModel object if found; otherwise, null
     */
    public IceCreamModel searchByFlavorName(String searchValue, List<IceCreamModel> iceCreamList, int left, int right) {
        // Base case: If the search range is invalid, return null
        if (right < left) {
            return null;
        }

        // Calculate the mid index
        int mid = (left + right) / 2;

        // Compare the search value with the flavor name at mid
        int comparison = searchValue.compareToIgnoreCase(iceCreamList.get(mid).getflavourName());

        if (comparison == 0) {
            // Match found
            return iceCreamList.get(mid);
        } else if (comparison < 0) {
            // Search in the left half
            return searchByFlavorName(searchValue, iceCreamList, left, mid - 1);
        } else {
            // Search in the right half
            return searchByFlavorName(searchValue, iceCreamList, mid + 1, right);
        }
    }
}
