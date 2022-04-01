package com.loonycorn;

public class Employee extends Person {
    private String role;

    public Employee(String name, long id, String role) {
        super(name, id);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
