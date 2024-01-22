package oefening2;

public class Member extends Person {
    private String organisation;

    public Member(String name, String organisation) {
        super(name);
        this.organisation = organisation;
    }

    @Override
    public String getOrganisation() {
        return organisation;
    }
}