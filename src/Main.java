package tr.edu.maltepe.oop;

public class Main {
    public static void main(String[] args) {
        Books book1, book2, book3;
        MaltepeLibrary MAULib = new MaltepeLibrary();

        Professor prof = new Professor("Ensar Gül ");
        Students student = new Students("Eray Tanrıseven",prof);



        book1 = new Books("Introduction to Java ");
        book2 = new Books("C Programming  ");
        book3 = new Books("Operating Systems ");

        MAULib.addBook(book1);
        MAULib.addBook(book2);
        MAULib.addBook(book3);

        System.out.println("Library contains the books ");
        MAULib.list_books();
        System.out.println(" ");

        MAULib.lendBook(prof,book1);
        MAULib.lendBook(student,book2);

        MAULib.lendBook(student,book1);

        MAULib.returnBook(prof,book1);
        MAULib.lendBook(prof,book3);

        MAULib.lendBook(student,book1);

        prof.ShowHaveBooks();
        student.ShowHaveBooks();

        student.student_arriving();

        student.swim();
        student.play_football();

        prof.professor_arriving();

        prof.swim();
        prof.play_football();

    }

}