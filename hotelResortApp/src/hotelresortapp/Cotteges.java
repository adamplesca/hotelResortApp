/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelresortapp;

/**
 *
 * @author adamp
 */
public class Cotteges extends hotelResort{
    
    private String address, key;
    private int cottageChoice;
    
    public Cotteges(){
        address = "";
        key = "";
        cottageChoice = 0;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public int getCottageChoice() {
        return cottageChoice;
    }
    public void setCottageChoice(int cottageChoice) {
        this.cottageChoice = cottageChoice;
    }
    
}
