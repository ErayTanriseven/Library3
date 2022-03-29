package tr.edu.maltepe.oop;

import java.util.*;

public class Person {
    private Vector<Books> books = new Vector<Books>();
    private String name;
    private String personType ;

    public Person(String name){
        this.name= name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String getPersonType() {
        return personType;
    }
    protected void setPersonType(String personType) {
        this.personType = personType;
    }

    public void  ShowInfo()
    {   System.out.println(" ");
        System.out.println(personType+" Name : "+ name);
    }

    public void returnBook (Books bbook){
        books.add(bbook);
    }

    public void ShowHaveBooks(){
        System.out.println("");
        System.out.println(name+" has the book(s) named   ");
        for (int i = 0; i< books.size();i++)
        {
            System.out.println(books.get(i).getBookname());
        }
    }

    public void lendBook(Books lbook){
        books.remove(lbook);
    }
}