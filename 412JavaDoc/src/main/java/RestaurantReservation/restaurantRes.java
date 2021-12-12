/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantReservation;

/**
 *
 * @author noellefajt
 */
public class restaurantRes {
    private String fName;
    private String lName;
    private String phone;
    private String resName;
    private String numPeople;
    private String date;
    private String resTime;
    private String resDate;

   
    public restaurantRes(String fName, String lName, String phone, String numPeople, String resName, String resTime) {
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.numPeople = numPeople;
        this.resName = resName;
        this.resTime = resTime;
    }

    /**
     * this gets users first name
     * @return fName = first name
     */
    public String getfName() {
        return fName;
    }

    /**
     * this sets the users first name 
     * @param fName = first name
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * this gets user's last name
     * @return lName = last name 
     */
    public String getlName() {
        return lName;
    }

    /**
     * sets the user's last name
     * @param lName = last name
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * gets user's phone number
     * @return phone = phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * sets user phone number
     * @param phone = phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * gets restaurant name
     * @return resName = restaurant name
     */
    public String getResName() {
        return resName;
    }

    /**
     * sets restaurant name
     * @param resName = restaurant name
     */
    public void setResName(String resName) {
        this.resName = resName;
    }

    /**
     * gets the number of people in the reservation party
     * @return numPeople = number of people in the party
     */
    public String getNumPeople() {
        return numPeople;
    }

    /**
     * sets the number of people in the reservation party
     * @param numPeople = number of people in the party
     */
    public void setNumPeople(String numPeople) {
        this.numPeople = numPeople;
    }

    /**
     * gets reservation time
     * @return resTime = reservation time
     */
    public String getResTime() {
        return resTime;
    }

    /**
     * sets reservation time
     * @param resTime = reservation time
     */
    public void setResTime(String resTime) {
        this.resTime = resTime;
    }
    
    /**
     * method that cast types and concatenates all the reservation info into a string
     * @return resStuff = all the reservation information converted to a string
     */
    public String toString(){
        String resStuff =  "First Name: " + getfName() + " Last Name: " + getlName() + " Phone Number: " + getPhone() 
                + " Restaurant: " + getResName() + " Time: " + getResTime() + " Number of People: " + getNumPeople();
        return resStuff;
    }
    /**
     * method that gets all the reservation information
     * @return info = all the reservation information
     */
    public String getInfo(){
        String info = "First Name: " + getfName() + " Last Name: " + getlName() + " Phone Number: " + getPhone() 
               + " Number of People: " + getNumPeople()  + " Restaurant: " + getResName() + " Time: " + getResTime();
        return info;
    }
    
}