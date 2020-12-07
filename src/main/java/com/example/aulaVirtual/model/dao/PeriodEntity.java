package com.example.aulaVirtual.model.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Period")
public class PeriodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 7)
    private String name;

    @Column(name ="year")
    private Long year;

    @OneToMany(mappedBy = "period")
    private List<SectionEntity> sections;

    public PeriodEntity(Long id, String name, Long year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public List<SectionEntity> getSections() {
        return sections;
    }

    public void setSections(List<SectionEntity> sections) {
        this.sections = sections;
    }
}
