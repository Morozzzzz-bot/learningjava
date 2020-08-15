package inheritance;

public class Surgeon extends Doctor {
    private int experience;
    private int operation;

    public int diagnosis(Pacient pacient) {
        this.operation = this.operation + 1;
        return this.experience;
    }
}
