import java.util.Objects;

public class Books {
    private String name;
    private Aftors aftor;
    private int yearPublication;

    public Books (String name, Aftors aftor, int yearPublication){
        this.name = name;
        this.aftor = aftor;
        this.yearPublication = yearPublication;
    }

    public String getName(){
        return  this.name;
    }

    public String setName(String name){
        this.name = name;
        return this.name;
    }

    public Aftors getAftor(){
        return this.aftor;
    }

    public Aftors setAftor(Aftors aftor){
        this.aftor = aftor;
        return this.aftor;
    }

    public int getYearPublication(){
        return this.yearPublication;
    }

    public int setYearPublication(int yearPublication){
        this.yearPublication = yearPublication;
        return this.yearPublication;
    }

    @Override
    public String toString(){
        return "Название: " + this.getName() + " " + aftor.toString()
                + " Год публикации: " + this.getYearPublication();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return yearPublication == books.yearPublication && name.equals(books.name) && aftor.equals(books.aftor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, aftor, yearPublication);
    }
}

