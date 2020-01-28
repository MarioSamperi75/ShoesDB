package se.nackademin.model;

public class Grade {
    int id;
    String rate;
    int rateNr;

    //------------------------------------------

    public Grade() {}

    public Grade(int id, String rate, int rateNr) {
        this.id = id;
        this.rate = rate;
        this.rateNr = rateNr;
    }

    //------------------------------------------


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public int getRateNr() {
        return rateNr;
    }

    public void setRateNr(int rateNr) {
        this.rateNr = rateNr;
    }
}
