package tr.edu.maltepe.oop;

public class Students extends Person implements do_sport{


    private Professor parentProf;

    public Students(String name, Professor parentProf) {
        super(name);
        this.parentProf = parentProf;
        this.setPersonType("Student");

    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Connected professor :"+getParentProf().getName());
    }



    public Professor getParentProf() {
        return parentProf;
    }

    public void setParentProf(Professor parentProf) {
        this.parentProf = parentProf;
    }
    public void student_arriving() {
        System.out.println("Student arrived at Sport Center which swimming pool and football field located at.");
    }

    public void swim() {
        System.out.println("Student is swimming.");
    }
    public void play_football() {
        System.out.println("Student is playing football.");
    }


}