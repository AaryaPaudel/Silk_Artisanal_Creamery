/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.silk.model;

/**
 *
 * @author aaryapaudel LMU ID:23048670
 */
public class IceCreamModel {
    private int silkId;
    private String flavourName;
    private String availability; 
    private int stockQuantity;
    private float pricePerScoop;
    private int caloriePerScoop;
    private String allergens;
    private String specialNotes;
    
    public IceCreamModel(){
    }
    
    public IceCreamModel (int silkId, String flavourName, String availability, int stockQuantity, float pricePerScoop, int caloriePerScoop, String allergens, String specialNotes){
        this.silkId = silkId;
        this.flavourName = flavourName;
        this.availability = availability;
        this.stockQuantity = stockQuantity;
        this.pricePerScoop = pricePerScoop;
        this.caloriePerScoop = caloriePerScoop;
        this.allergens = allergens;
        this.specialNotes = specialNotes;
    }
    
    public int getsilkId() {
        return silkId;
    }

    public void setsilkId(int silkId) {
        this.silkId = silkId;
    }
    
    public String getflavourName() {
        return flavourName;
    }

    public void setflavourName(String flavourName) {
        this.flavourName = flavourName;
    }
    
    public String getavailability() {
        return availability;
    }

    public void setavailability(String availability) {
        this.availability = availability;
    }
    
    public int getstockQuantity() {
        return stockQuantity;
    }

    public void setstockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    
    public float getpricePerScoop() {
        return pricePerScoop;
    }

    public void setpricePerScoop(float pricePerScoop) {
        this.pricePerScoop = pricePerScoop;
    }
    
    public int getcaloriePerScoop() {
        return caloriePerScoop;
    }

    public void setcaloriePerScoop(int caloriePerScoop) {
        this.caloriePerScoop = caloriePerScoop;
    }
    
    public String getallergens() {
        return allergens;
    }

    public void setallergens(String allergens) {
        this.allergens = allergens;
    }
    
    public String getspecialNotes() {
        return specialNotes;
    }

    public void setspecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
    }
}
