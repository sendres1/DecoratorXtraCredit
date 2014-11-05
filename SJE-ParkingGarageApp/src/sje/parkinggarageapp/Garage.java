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
    private Car car;
    private ATM atm;
    private FeeStrategy feeStrategy;
    private ReceiptOutputStrategy receiptOutputStrategy;

    // constructor
    public Garage(String garageName, String address1, String cityState, 
            String zipcode, FeeStrategy feeStrat) {
        setGarageName(garageName);
        setAddress1(address1);
        setCityState(cityState);
        setZipcode(zipcode);
        setFeeStrategy(feeStrat);

    }

    //getters
    public final String getGarageName() {
        return garageName;
    }

    public final String getAddress1() {
        return address1;
    }

    public final String getCityState() {
        return cityState;
    }

    public final String getZipcode() {
        return zipcode;
    }

    public final FeeStrategy getFeeStrategy() {
        return feeStrategy;
    }

    public final ReceiptOutputStrategy getReceiptOutputStrategy() {
        return receiptOutputStrategy;
    }

    //setters
    public final void setGarageName(String garageName) {
        if (garageName == null || garageName.isEmpty()) {
            throw new IllegalArgumentException("Garage Name is invalid!");
        }
        this.garageName = garageName;
    }

    public final void setAddress1(String address1) {
        if (address1 == null || address1.isEmpty()) {
            throw new IllegalArgumentException("Address1 is invalid!");
        }
        this.address1 = address1;
    }

    public final void setCityState(String cityState) {
        if (cityState == null || cityState.isEmpty()) {
            throw new IllegalArgumentException("City, State is invalid!");
        }
        this.cityState = cityState;
    }

    public final void setZipcode(String zipcode) {
        if (zipcode == null || zipcode.isEmpty()) {
            throw new IllegalArgumentException("Zip Code is invalid!");
        }
        this.zipcode = zipcode;
    }

    public final void setReceiptOutputStrategy(ReceiptOutputStrategy receiptOutputStrategy) {
        if (receiptOutputStrategy == null) {
            throw new IllegalArgumentException("receiptOutputStrategy is null!");
        }

        this.receiptOutputStrategy = receiptOutputStrategy;
    }

    public final void setFeeStrategy(FeeStrategy feeStrategy) {
        if (feeStrategy == null) {
            throw new IllegalArgumentException("feStrategy is null!");
        }
        this.feeStrategy = feeStrategy;
    }

}
