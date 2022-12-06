package Task4_Reader;

public class Main {
    public static void main(String[] args) {
        Reader petrov = new Reader("Петров В.В", "BN1568", "Foreign literature", "25.05.1991", "89571253642");
        int books = 3;
        petrov.takeBook();
        petrov.returnBook();

        petrov.takeBook(3);
        petrov.returnBook(3);

        petrov.takeBook("Приключения, Словарь, Энциклопедия");
        petrov.returnBook("Приключения, Словарь, Энциклопедия");




    }
}
