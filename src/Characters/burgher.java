package Characters;

public class burgher {
    Inheritance inheritance = new Inheritance();
    public String job = randomSetters.getRandomJob();
    public String legacyName = randomSetters.getRandomLegacyName();
    public int money = 50 + inheritance.getMoney();
}
