/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Coco
 */
public class Order {
    private int Id;
    private int CreatedDate;
    private boolean Status;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(int CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    
    
}
