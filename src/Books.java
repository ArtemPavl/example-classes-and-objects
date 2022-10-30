public class Books {
    String name;
    Aftors aftor;
    int yearPublication;

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
}
