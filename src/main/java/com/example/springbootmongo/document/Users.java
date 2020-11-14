package com.example.springbootmongo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Users {
    @Id
    private Integer id;
    private String name;
    private String teamName;
    private Long salary;

    public Users(Integer id, String name, String teamName, Long salary) {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
