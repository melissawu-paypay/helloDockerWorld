package com.melissaw.example.helloDockerWorld;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mydata")
public class MyData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date dttm;
    private String value;

    public MyData(){}

    public MyData(Date dttm, String value) {
        this.dttm = dttm;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDttm() {
        return dttm;
    }

    public String getValue() {
        return value;
    }
    @Override
    public String toString() {
        return String.format(
                "MyData[id=%d, dttm='%s', value='%s']",
                id, dttm, value);
    }
}
