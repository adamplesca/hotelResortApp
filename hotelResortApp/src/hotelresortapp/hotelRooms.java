/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelresortapp;

/**
 *
 * @author adamp
 */
public class hotelRooms extends hotelResort {
   
    private String roomNum, breakfast;

    public hotelRooms(String roomNum, String breakfast) {
        this.roomNum = roomNum;
        this.breakfast = breakfast;
    }
    
    public String getRoomNum() {
        return roomNum;
    }
    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }
    public String isBreakfast() {
        return breakfast;
    }
    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }
}
