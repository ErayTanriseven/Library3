package tr.edu.maltepe.oop;
import java.util.*;

public class MaltepeLibrary {
    private Vector books;
    public MaltepeLibrary(){
        books =new Vector();
    }
    public void addBook (Books abook){
        books.add(abook);
    }

    public void removeBook(Books rbook){
        books.remove(rbook);
    }

    public void list_books (){
        for (int i=0; i< books.size();i++ ){
            Books temp = (Books) books.get(i);
            System.out.println(temp.getBookname());
        }
    }

    public void lendBook(Person person, Books book){
        if (books.contains(book))
        {
            person.returnBook(book);
            removeBook(book);
            System.out.println(person.getName()+" borrowed the book named "+book.getBookname());
            System.out.println(" ");

        }
        else{
            System.out.println(book.getBookname()+" has already been borrowed.");
            System.out.println(" ");
        }
    }
    public void returnBook(Person person, Books book){
        person.lendBook(book);
        addBook(book);
        System.out.println(person.getName()+" returned the book named "+book.getBookname()+"to the library.");
        System.out.println(" ");
    }
}