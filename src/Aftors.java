public class Aftors {
    String name;
    String surname;

    public Aftors (String name, String surname){
        this.name =name;
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }

    public String setName(String name){
        this.name = name;
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String setSurname(String surname){
        this.surname = surname;
        return this.surname;
    }
}
