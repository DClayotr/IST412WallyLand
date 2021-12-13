/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RidePackage;

/**
 *
 * @author cjm6757
 */
public class Ride {
    
    private boolean isShowType;
    private String rideName;
    private int waitTime;
    private boolean isWait;
    private String rideDescript;
    private boolean isRunning;
    
    public Ride(boolean showType, String name, int currentWait, boolean hasWait, String description, boolean operating){
        this.isShowType = showType;
        this.isWait = hasWait;
        this.rideDescript = description;
        this.rideName = name;
        this.waitTime = currentWait;
        this.isRunning = operating;
    }

    public void updateWaitTime(int wait, boolean hasWait){
        if(hasWait){
            this.waitTime = wait;
            this.isWait = hasWait;
        } else {
            this.waitTime = 0;
            this.isWait = hasWait;            
        }
    }
    
    
    public void updateRideRunning(boolean running){
        this.isRunning = running;
    }
    
    public boolean getIsShowType() {
        return isShowType;
    }

    public void setIsShowType(boolean isShowType) {
        this.isShowType = isShowType;
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public boolean getIsWait() {
        return isWait;
    }

    public void setIsWait(boolean isWait) {
        this.isWait = isWait;
    }

    public String getRideDescript() {
        return rideDescript;
    }

    public void setRideDescript(String rideDescript) {
        this.rideDescript = rideDescript;
    }

    public boolean getIsRunning() {
        return isRunning;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }
    
    
}