public class Main {
    public static void main(String[] args) {
            Author stephen = new Author("Stephen", "King");
            Author Joanne = new Author("Joanne", "Rowling");

            Book shine = new Book("The Shine",stephen, 2024);
            Book harryPotter = new Book("Harry Potter",Joanne,  2020);

            print(shine);
            System.out.println();
            print(harryPotter);

            harryPotter.setYear(2013);
            print(harryPotter);

    }
    private static void print(Book book){
        System.out.println(book);
    }

}