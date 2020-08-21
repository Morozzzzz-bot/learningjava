package tracker;

public class Item {
    private String name;
    private int id;

    public Item() {
    }
    public Item(int id) {
        this.id = id;
    }
    public Item(String name) {
        this.name = name;
    }
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Item item = new Item();
        Item item1 = new Item(56);
        Item item2 = new Item(56, "Job");
    }
}
