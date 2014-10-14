package sje.parkinggarageapp;

/**
 ** Garage concrete class instantiates a garage
 *
 * @author sendres1
 * @version 1.20
 */
public class Garage {
    private String garageName;
    private String address1;
    private String cityState;
    private String zipcode;

    // constructor
    public Garage(String garageName, String address1, String cityState, String zipcode) {
      //  this.garageName = garageName;
        setGarageName(garageName);
        setAddress1(address1);
        setCityState(cityState);
        setZipcode(zipcode);
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
        if (garageName == null || garageName.isEmpty()) {
            throw new IllegalArgumentException("Garage Name is invalid!");
        }
        this.garageName = garageName;
    }

    public void setAddress1(String address1) {
        if (address1 == null || address1.isEmpty()) {
             throw new IllegalArgumentException("Address1 is invalid!");
        }
        this.address1 = address1;
    }

    public void setCityState(String cityState) {
        if (cityState == null || cityState.isEmpty()) {
             throw new IllegalArgumentException("City, State is invalid!");
        }
        this.cityState = cityState;
    }

    public void setZipcode(String zipcode) {
        if (zipcode == null || zipcode.isEmpty()) {
             throw new IllegalArgumentException("Zip Code is invalid!");
        }
        this.zipcode = zipcode;
    }

}
