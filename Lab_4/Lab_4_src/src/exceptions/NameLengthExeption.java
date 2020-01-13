package exceptions;

public class NameLengthExeption extends RuntimeException {

    String name;

    public NameLengthExeption(){

    }

    public NameLengthExeption(String msg, String name){
        super (msg);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
