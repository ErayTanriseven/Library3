package tr.edu.maltepe.oop;

public class Professor extends Person {


    public Professor(String name) {
        super(name);

        this.setPersonType("Professor");
    }


    public void _return(long bookisbn){

    }
    public void professor_arriving(){
        System.out.println("Professor arrived at Sport Center which swimming pool and football field located at.");
    }


    public void swim() {
        System.out.println("Professor is swimming.");
    }
    public void play_football() {
        System.out.println("Professor is playing football.");
    }
}