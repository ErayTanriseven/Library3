package tr.edu.maltepe.oop;

public class Students extends Person {


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
}