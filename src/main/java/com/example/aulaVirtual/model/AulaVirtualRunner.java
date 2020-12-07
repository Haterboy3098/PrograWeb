package com.example.aulaVirtual.model;

import com.example.aulaVirtual.model.dao.*;
import com.example.aulaVirtual.model.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

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

    @Autowired
    private userStudentRepo userStudentRepo;

    @Autowired
    private userTeacherRep userTeacherRep;

    @Override
    public void run(String... args) throws Exception {

        /*
        GenderEntity gender1 = new GenderEntity(null, "Hombre");
        GenderEntity gender2 = new GenderEntity(null, "Mujer");


        genderRepo.save(gender1);
        genderRepo.save(gender2);

        CareerEntity career = new CareerEntity(null, "Ingenieria de Sistemas");

        careerRepo.save(career);

        PeriodEntity period1 = new PeriodEntity(null, "2020-1", (long) 2020);
        PeriodEntity period2 = new PeriodEntity(null, "2020-2", (long) 2020);

        periodRepo.save(period1);
        periodRepo.save(period2);

        CourseEntity course =new CourseEntity(null, (long) 52,"Programacion Web");
        course.setCareer(career);

        courseRepo.save(course);

        SectionEntity section = new SectionEntity(null, (long) 101);
        section.setPeriod(period1);
        section.setCourse(course);

        sectionRepo.save(section);

        CountryEntity country= new CountryEntity(null, "Peru");
        countryRepo.save(country);

        StudentEntity student=new StudentEntity(null, (long) 20153261,"Andre","Silva","20153261@aloe.ulima.edu.pe","andre_vila@gmail.com"
                ,"https://picsum.photos/200");
        student.setGender(gender1);
        student.setCareer(career);
        student.setCountry(country);
        studentRepo.save(student);


        SectionStudentEntity sectionStudent = new SectionStudentEntity(null);
        sectionStudent.setSection(section);
        sectionStudent.setStudent(student);

        sectionStudentRepo.save(sectionStudent);



        TeacherTypeEntity teacherType= new TeacherTypeEntity(null,"tiempo completo");
        teacherTypeRepo.save(teacherType);

        TeacherEntity teacher= new TeacherEntity(null, (long) 1000,"Pepe","Luna","pepeLu@ulima.edu.pe","pepe_luna@gmail.com","https://picsum.photos/200");
        teacher.setGender(gender1);
        teacher.setCountry(country);
        teacher.setTeacherType(teacherType);

        teacherRepo.save(teacher);

        SectionTeacherEntity sectionTeacher=new SectionTeacherEntity(null);
        sectionTeacher.setSection(section);
        sectionTeacher.setTeacher(teacher);

        sectionTeacherRepo.save(sectionTeacher);


        UserStudentEntity userStudent= new UserStudentEntity(null, "20153261","qwerty","12345","12345");
        userStudent.setStudent(student);
        userStudentRepo.save(userStudent);

        UserTeacherEntity userTeacher= new UserTeacherEntity(null,"pepeLu","qwerty","12345","12345");
        userTeacher.setTeacher(teacher);
        userTeacherRep.save(userTeacher);*/




    }
}
