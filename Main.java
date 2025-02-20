import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во взятых книг: ");
        int numberOfTakenBooks = in.nextInt();
        in.nextLine();
        String[] takenBooks = new String[numberOfTakenBooks];
        for (int i = 0; i < numberOfTakenBooks; i++){
            System.out.print("Введите " + (i+1) + "-ую взятую книгу: ");
            takenBooks[i] = in.nextLine();
        }
        System.out.print("Введите кол-во отданных книг: ");
        int numberOfGivenBooks  = in.nextInt();
        in.nextLine();
        String[] givenBooks = new String[numberOfGivenBooks];
        for (int i = 0; i < numberOfGivenBooks; i++){
            System.out.print("Введите " + (i+1) + "-ую отданную книгу: ");
            givenBooks[i] = in.nextLine();
        }
        Reader[] readers = new Reader[5];

        readers[0] = new Reader("Петров В. В.", "100", "Факультет ИТ", "01.06.2000", "1568816");
        readers[1] = new Reader("Сидоров С. С.", "101", "Факультет Математики", "04.07.2009", "9876543");
        readers[2] = new Reader("Иванов И. И.", "102", "Факультет Физики", "15.03.2005", "4567891");
        readers[3] = new Reader("Кузнецов К. К.", "103", "Факультет Химии", "27.04.2010", "3216549");
        readers[4] = new Reader("Смирнов С. С.", "104", "Факультет Биологии", "05.11.2011", "6543789");
        for (int i = 0; i < readers.length; i++) {
            readers[i].takeBook(numberOfTakenBooks);
            readers[i].takeBook(takenBooks);
            readers[i].returnBook(numberOfGivenBooks);
            readers[i].returnBook(givenBooks);
        }
    }
}
        class Reader {
            public String name;
            public String ticketNumber;
            public String faculty;
            public String birthDate;
            public String phone;

            public Reader(String name, String ticketNumber, String faculty, String birthDate, String phone) {
                this.name = name;
                this.ticketNumber = ticketNumber;
                this.faculty = faculty;
                this.birthDate = birthDate;
                this.phone = phone;
            }
            public void takeBook(int numberOfBooks) {
                System.out.println(name + " взял " + numberOfBooks + " книги");
            }
            public void takeBook(String... bookTitles) {
                System.out.print(name + " взял книги: ");
                for (int i = 0; i < bookTitles.length; i++) {
                    System.out.print(bookTitles[i]);
                    if (i < bookTitles.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
            public void returnBook(int numberOfBooks) {
                System.out.println(name + " вернул " + numberOfBooks + " книги.");
            }
            public void returnBook(String... bookTitles) {
                System.out.print(name + " вернул книги: ");
                for (int i = 0; i < bookTitles.length; i++) {
                    System.out.print(bookTitles[i]);
                    if (i < bookTitles.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }

