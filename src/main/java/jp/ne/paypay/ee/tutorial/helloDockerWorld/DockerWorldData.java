package jp.ne.paypay.ee.tutorial.helloDockerWorld;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dockerworlddata")
public class DockerWorldData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date dttm;
    private String value;

    public DockerWorldData(){}

    public DockerWorldData(Date dttm, String value) {
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
                "DockerWorldData[id=%d, dttm='%s', value='%s']",
                id, dttm, value);
    }
}
