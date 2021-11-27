/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author hoa
 */
public class CoffeBar {

    String id;
    String name;
    String Address;
    String HotLine;
    String Description;
    String Mail;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public CoffeBar(String id, String name, String Address, String HotLine, String Description, String Mail) {
        this.id = id;
        this.name = name;
        this.Address = Address;
        this.HotLine = HotLine;
        this.Description = Description;
        this.Mail = Mail;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setHotLine(String HotLine) {
        this.HotLine = HotLine;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return Address;
    }

    public String getHotLine() {
        return HotLine;
    }

    public String getDescription() {
        return Description;
    }

    public String getMail() {
        return Mail;
    }

    public CoffeBar(String id, String Address, String HotLine, String Description, String Mail) {
        this.id = id;
        this.Address = Address;
        this.HotLine = HotLine;
        this.Description = Description;
        this.Mail = Mail;
    }
}
