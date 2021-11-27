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
public class Customer {
    String id;
    String address;
    String mobile;
    String note;
    String fullName;

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getNote() {
        return note;
    }

    public String getFullName() {
        return fullName;
    }

    public Customer(String id, String address, String mobile, String note, String fullName) {
        this.id = id;
        this.address = address;
        this.mobile = mobile;
        this.note = note;
        this.fullName = fullName;
    }
}
