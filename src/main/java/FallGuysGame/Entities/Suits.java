package FallGuysGame.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "suits")
public class Suits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "suit")
    private String suit;

    public Suits() {
    }

    public Suits(String suit){
        this.suit = suit;
    }
}
