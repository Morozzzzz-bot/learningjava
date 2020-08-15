package inheritance;

public class Engineer extends Profession {
    private int workmen;

    public Job assigned(Worker work) {
       this.workmen = this.workmen + 1;
       return new Job();
    }
}
