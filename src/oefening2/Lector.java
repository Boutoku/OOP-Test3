package oefening2;

 public class Lector extends Employee{
    String organisation;

    public Lector(String name, String organisation){
        super(name);
        this.organisation = organisation;
    }
    @Override
    public boolean hasStudents(){
        return true;
    }
    @Override
    public String getRole(){
        return "lector";
    }
     @Override
     public String getOrganisation() {
         return organisation;
     }
}
