/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.silk.util;
import java.util.regex.Pattern;

/**
 *
 * @author aaryapaudel LMU ID:23048670
 */
public class ValidationUtil {
     // Validation Patterns
    private static final Pattern SILKID_PATTERN = Pattern.compile("^\\d+$"); // Only numbers
    private static final Pattern FLAVOR_NAME_PATTERN = Pattern.compile("^[a-zA-Z]+([ '-][a-zA-Z]+)*$"); // Alphabetical only
    private static final Pattern AVAILABILITY_PATTERN = Pattern.compile("^[a-zA-Z]+([ '-][a-zA-Z]+)*$"); // Alphabetical only
    private static final Pattern STOCK_QUANTITY_PATTERN = Pattern.compile("^\\d+$"); // Only numbers
    private static final Pattern CALORIE_PER_SCOOP_PATTERN = Pattern.compile("^\\d+$"); // Only numbers
    private static final Pattern ALLERGENS_PATTERN = Pattern.compile("^[a-zA-Z]+([, ]?[a-zA-Z]+)*$"); // Alphabetical, can include commas
    private static final Pattern SPECIAL_NOTES_PATTERN = Pattern.compile("^[a-zA-Z]+([ '-][a-zA-Z]+)*$"); // Alphabetical only
    
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }
    
    public static boolean isValidID(int silkId) {
        return SILKID_PATTERN.matcher(String.valueOf(silkId)).matches();
    }
    
    public static boolean isValidFlavorName(String flavorName) {
        return !isNullOrEmpty(flavorName) && FLAVOR_NAME_PATTERN.matcher(flavorName).matches();
    }
    
    public static boolean isValidAvailability(String availability) {
        return !isNullOrEmpty(availability) && AVAILABILITY_PATTERN.matcher(availability).matches();
    }
    
    public static boolean isValidStockQuantity(int stockQuantity) {
        return STOCK_QUANTITY_PATTERN.matcher(String.valueOf(stockQuantity)).matches();
    }
    
    public static boolean isValidPricePerScoop(float pricePerScoop) {
                 return pricePerScoop < 1000;
    }
    
    public static boolean isValidcaloriePerScoop(int caloriePerScoop) {
        return CALORIE_PER_SCOOP_PATTERN.matcher(String.valueOf(caloriePerScoop)).matches();
    }
    
    public static boolean isValidallergens(String allergens) {
        return !isNullOrEmpty(allergens) && ALLERGENS_PATTERN.matcher(allergens).matches();
    }
    
    public static boolean isValidspecialNotes(String specialNotes) {
        return !isNullOrEmpty(specialNotes) && SPECIAL_NOTES_PATTERN.matcher(specialNotes).matches();
    }
  
}
