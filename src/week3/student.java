/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Dipal
 */
public class student {
    private int Id;
    private String firstName;
    private int maxCourse;
    private boolean partTime;
    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the partTime
     */
    public boolean isPartTime() {
        return partTime;
    }

    /**
     * @param partTime the partTime to set
     */
    public void setPartTime(boolean partTime) {
        this.partTime = partTime;
    }
    
}
