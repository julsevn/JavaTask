package Task4_Reader;

public class Reader {

        String fio;
        String number_reader_ticket;
        String faculty;
        String date_of_birth;
        String telephone_number;


        public Reader(String fio, String number_reader_ticket, String faculty, String date_of_birth, String telephone_number) {
            this.fio = fio;
            this.number_reader_ticket = number_reader_ticket;
            this.faculty = faculty;
            this.date_of_birth = date_of_birth;
            this.telephone_number = telephone_number;
        }



    public void takeBook() {
        System.out.println(fio + " взял книги");
        }

        public void returnBook() {
            System.out.println(fio + " вернул книги");
        }


        public void takeBook(int books){
            System.out.println(fio + " взял " + books + " книги");
        }

    public void returnBook(int books){
        System.out.println(fio + " вернул " + books + " книги");
    }

    public void takeBook(String types){
        System.out.println(fio + " взял книги: " + types);
    }

    public void returnBook(String types){
        System.out.println(fio + " вернул книги: " + types);
    }





    }


