package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job{

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String employer;

    private String skills;

    @ManyToMany
    private List<Skill> skill = new ArrayList<>();

    public Job() {
    }

    public Job(String anEmployer, String someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public List<Skill> getSkill() {
        return skill;
    }

    public void addSkill (Skill skill) {
        this.skill.add(skill);
    }
}
