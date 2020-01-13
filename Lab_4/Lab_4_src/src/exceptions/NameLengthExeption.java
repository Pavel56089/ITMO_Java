package exceptions;

public class NameLengthExeption extends RuntimeException {

    String name;

    public NameLengthExeption(){

    }

    public NameLengthExeption(String name){
        super ("Длинна имени больше 10 символов");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
