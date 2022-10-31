import java.util.Objects;
public class Aftors {
    private String name;
    private String surname;

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

    @Override
    public String toString(){
        return "Автор: " + this.getName() + " " + this.getSurname();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Aftors aftors = (Aftors) o;
        return name.equals(aftors.name) && surname.equals(aftors.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

}
