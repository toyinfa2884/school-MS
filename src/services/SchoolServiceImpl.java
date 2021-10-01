package services;

import db.SchoolDb;
import exceptions.SchoolNotFoundException;
import models.School;

import java.util.List;

public class SchoolServiceImpl implements SchoolService{
    private SchoolDb schoolDb;
    @Override
    public void add(School school) {
        schoolDb.add(school);

    }

    @Override
    public void delete(School school) {
        schoolDb.delete(school);

    }

    @Override
    public School update(long id, School school ) throws SchoolNotFoundException {
        School foundSchool = schoolDb.findById(id);
        if(foundSchool==null){
            throw  new SchoolNotFoundException("School with this id not found");
        }
        return school;
    }

    @Override
    public School findById(long id) throws SchoolNotFoundException {
        School foundSchool = schoolDb.findById(id);
        if (foundSchool == null) {
            throw new SchoolNotFoundException("School with this id not found");


        }
        return foundSchool;

    }

    @Override
    public List<School> getAll() {
        return (List<School>) schoolDb.getAll();
    }
}
