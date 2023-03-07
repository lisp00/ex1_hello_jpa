package hellojpa;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "Member")
public class Member {

    @Id
    @Column(nullable = false)
    private Long id;
    private String name;
}
