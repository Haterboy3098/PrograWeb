package com.example.aulaVirtual.model;

import com.example.aulaVirtual.model.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AulaVirtualRunner implements CommandLineRunner {

    @Autowired
    private CareerRepository careerRepo;

    @Autowired
    private CountryRepository countryRepo;

    @Autowired
    private CourseRepository courseRepo;

    @Autowired
    private GenderRepository genderRepo;

    @Autowired
    private PeriodRepository periodRepo;

    @Autowired
    private SectionRepository sectionRepo;

    @Autowired
    private SectionStudentRepository sectionStudentRepo;

    @Autowired
    private SectionTeacherRepository sectionTeacherRepo;

    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private TeacherRepository teacherRepo;

    @Autowired
    private TeacherTypeRepository teacherTypeRepo;


    @Override
    public void run(String... args) throws Exception {

    }
}
