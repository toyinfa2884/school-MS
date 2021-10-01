package models;

import java.util.ArrayList;
import java.util.List;

public class School {
    private long id;
    private String schoolName;
    private String schoolType;
    private String description;
    private List<Class> classes = new ArrayList<>();
    private List<Staff> staffs = new ArrayList<>();
    private Address address;
    private  List<Student> students = new ArrayList<>();

}
