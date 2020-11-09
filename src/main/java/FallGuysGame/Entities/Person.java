package FallGuysGame.Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@ToString
@Getter
@Setter
@Entity
@Table(name = "people")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "level")
    private int level;
    @Column(name = "suit")
    private String suit;

    public Person() {
    }

    public Person(String name, int level, String suit){
        this.name = name;
        this.level = level;
        this.suit = suit;
    }
}