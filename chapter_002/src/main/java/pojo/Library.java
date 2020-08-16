package pojo;

public class Library {
    public static void main(String[] args) {
        Book ball = new Book("Колобок", 23);
        Book teremok = new Book("Теремок", 30);
        Book repka = new Book("Репка", 13);
        Book cleanCode = new Book("Clean Code", 56);
        Book[] book = new Book[4];
        book[0] = ball;
        book[1] = teremok;
        book[2] = repka;
        book[3] = cleanCode;
        for (int index = 0; index < book.length; index++) {
            Book pr = book[index];
            System.out.println(pr.getNameBook() + " - " + pr.getPages());
        }
        System.out.println();
        Book tmp = book[0];
        book[0] = book[3];
        book[3] = tmp;
        for (int index = 0; index < book.length; index++) {
            Book pr = book[index];
            if (pr.getNameBook().equals("Clean Code")) {
                System.out.println(pr.getNameBook() + " - " + pr.getPages());
            }
        }
    }
}
