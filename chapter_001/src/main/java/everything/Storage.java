package everything;

public class Storage {
    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        Storage obj = new Storage();
        String name = "Анатолий";
        int size = obj.storage(name);
        System.out.println(size);
    }
}
