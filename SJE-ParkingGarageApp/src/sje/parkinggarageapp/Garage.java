/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sje.parkinggarageapp;

/**
 ** Store concrete class instantiates a store
 *
 * @author sendres1
 * @version 1.20
 */
public class Garage {

    private String garageName;
    private String address1;
    private String cityState;
    private String zipcode;

    //default constructor
    public Garage() {
    }

    // constructor
    public Garage(String garageName, String address1, String cityState, String zipcode) {
        this.garageName = garageName;
        this.address1 = address1;
        this.cityState = cityState;
        this.zipcode = zipcode;
    }

    //getters
    public String getGarageName() {
        return garageName;
    }

    public String getAddress1() {
        return address1;
    }

    public String getCityState() {
        return cityState;
    }

    public String getZipcode() {
        return zipcode;
    }

    //setters
    public void setGarageName(String garageName) {
        this.garageName = garageName;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setCityState(String cityState) {
        this.cityState = cityState;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

}
