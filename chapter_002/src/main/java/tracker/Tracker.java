package tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[size];
        int value = 0;
        for (int index = 0; index < items.length; index++) {
            Item tmp = items[index];
            if (tmp != null) {
                rsl[value] = tmp;
                value++;
            }
        }
        rsl = Arrays.copyOf(rsl, value);
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int value = 0;
        for (int index = 0; index < items.length; index++) {
            Item name = items[index];
            if (key.equals(name)) {
                rsl[value] = name;
                value++;
            }
        }
        rsl = Arrays.copyOf(rsl, value);
        return rsl;
    }
    public boolean replace(int id, Item item) {
        boolean result = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId() == id) {
                items[i] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean delete(int id) {
        boolean result = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId() == id) {
                System.arraycopy(items, i + 1, items, i, items.length - i - 1);
                result = true;
                this.size--;
                break;
            }
        }
        return result;
    }
}
