package inheritance;

public class Builder extends Engineer {
    public Job build(Job job) {
        return new Job();
    }
    public Job rebuild(Job job) {
        return new Job();
    }
}
