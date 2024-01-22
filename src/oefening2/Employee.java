package oefening2;

import oefening2.IRole;
import oefening2.Person;

public abstract class Employee extends Person implements IRole{
    public Employee(String name) {
        super(name);
    }

    abstract boolean hasStudents();
}