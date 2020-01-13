package exceptions;

public class SamePlaceException extends Exception {

    String plc;

    public SamePlaceException(){

    }

    public SamePlaceException (String msg, String place){
        super(msg);
        this.plc = place;
    }

    public String GetPlace() {
        return plc;
    }
}