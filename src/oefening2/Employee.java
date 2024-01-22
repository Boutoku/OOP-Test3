package oefening2;

import oefening2.IRole;
import oefening2.Person;

abstract public class Employee extends Person implements IRole{
    public Employee(String name) {
        super(name);
    }

    abstract boolean hasStudents();
}