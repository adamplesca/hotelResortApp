/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelresortapp;
import javax.swing.JOptionPane;

/**
 *
 * @author adamp
 */
public class HotelResortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name, startDate, duration;
        int choice, hotelChoice, cottageChoice;
        
        hotelResort myHotel = new hotelResort();
        
        name = JOptionPane.showInputDialog(null, "What is your name?");
        myHotel.setName(name);
        
        startDate = JOptionPane.showInputDialog(null, "What date are you arriving at?");
        myHotel.setStartDate(startDate);
        
        duration = JOptionPane.showInputDialog(null, "How many nights will you stay?");
        myHotel.setDuration(duration);
        
        choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Are you staying in our Hotel or on of our Cotteges? \n Press 1 for Hotel \n Press 2 for Cottage" ));
        myHotel.setChoice(choice);
        
        if(choice == 1){
            hotelChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Which hotel room would you like? \n Press 1 for Room 1  \n Press 2 for Room 2  \n Press 3 for Room 3"));
            switch(hotelChoice){
                case 1: hotelRooms room1 = new hotelRooms("12","Yes");
                        JOptionPane.showMessageDialog(null,"Here is your Hotel room booking "+myHotel.getName()+":\n The date you arrive: "+myHotel.getStartDate()+",\n Your duration with us: "+myHotel.getDuration() +",\n Your room number is: "+room1.getRoomNum() + "\n Free breakfast is included with this room.");
                    break;
                case 2: hotelRooms room2 = new hotelRooms("21","No");
                        JOptionPane.showMessageDialog(null,"Here is your Hotel room booking "+myHotel.getName()+":\n The date you arrive: "+myHotel.getStartDate()+",\n Your duration with us: "+myHotel.getDuration() +",\n Your room number is: "+room2.getRoomNum() + "\n Free breakfast is not included with this room.");
                    break;
                case 3: hotelRooms room3 = new hotelRooms("5","Yes");
                        JOptionPane.showMessageDialog(null,"Here is your Hotel room booking "+myHotel.getName()+":\n The date you arrive: "+myHotel.getStartDate()+",\n Your duration with us: "+myHotel.getDuration() +",\n Your room number is: "+room3.getRoomNum() + "\n Free breakfast is included with this room.");
                    break;
            }
        }
        else if(choice == 2){
            cottageChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Which Cottage would you like? \n Press 1 for our Dublin Cottage   \n Press 2 for Wexford Cottage  \n Press 3 for Cork Cottage"));    
            switch(cottageChoice){
                case 1: Cotteges dublinCottage = new Cotteges();
                        JOptionPane.showMessageDialog(null,"Here is your Cottege booking in Dublin, "+myHotel.getName()+":\n Here is day your arrive: "+myHotel.getStartDate()+",\n Here is your duration with us: "+myHotel.getDuration());
                    
                    break;
                case 2: Cotteges wexfordCottage = new Cotteges();
                        JOptionPane.showMessageDialog(null,"Here is your Cottege booking in Wexford, "+myHotel.getName()+":\n Here is day your arrive: "+myHotel.getStartDate()+",\n Here is your duration with us: "+myHotel.getDuration());
                    
                    break;
                case 3: Cotteges corkCottage = new Cotteges();
                        JOptionPane.showMessageDialog(null,"Here is your Cottege booking in Cork, "+myHotel.getName()+":\n Here is day your arrive: "+myHotel.getStartDate()+",\n Here is your duration with us: "+myHotel.getDuration());
                    break;
            }
        }
        else if(choice != 1 || choice != 2){
            JOptionPane.showMessageDialog(null,"Please enter option 1 or 2.");
        }
    }
}
    

