package TicketPackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FivePersonTicket implements Ticket {
    private int price;
    private String ride;
    private LocalDate time;
    private String ID;
    private String type;
    private int people;
    private int scans;
    private Boolean used;
    private Boolean purchased;

    public FivePersonTicket(int price, String ride, LocalDate time, String ID){
        this.price = price;
        this.time = time;
        this.ride = ride;
        this.ID = ID;
        this.people = 5;
        this.scans = 0;
        this.type = "Five Person";
        this.used = false;
        this.purchased = false;
    }
    public void scan(){
        while(this.scans < this.people && !used){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Scan rider?: ");
            String scanned = myObj.nextLine();
            if(scanned.toLowerCase() == "y"){
                System.out.println("scanned");
                this.scans++;
                if(this.scans == 5){
                    this.used = true;
                }
            }else{
                break;
            }
        }
    }
   
    public String getID() {
        return this.ID;
    }
    public int getPeople(){
        return this.people;
    }
    public int getPrice() {
        return this.price;
    }
    public String getRide() {
        return this.ride;
    }
    public String getTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formattedString = this.time.format(formatter);
        return formattedString;
    }
    public Boolean getUsed() {
        return this.used;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setID(String iD) {
        this.ID = iD;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setRide(String ride) {
        this.ride = ride;
    }
    public void setTime(LocalDate time) {
        this.time = time;
    }
    public void setUsed(Boolean used) {
        this.used = used;
    }
    @Override
    public void setPurchased(boolean b) {
        this.purchased = b;
        
    }
}
