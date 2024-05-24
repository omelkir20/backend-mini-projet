package com.ecommerce.mini_projet.model;

import jakarta.persistence.*;
@Entity
@Table(name = "contenir")
@SequenceGenerator(name="Contenir_SEQ", sequenceName="Contenir_id_seq", allocationSize = 1)
public class Contenir {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARTICLE_SEQ")
    @Column(name = "idCon")
    private Long idCon;
    @Column(name = "qteCon")
    private int qteCon;

    public Contenir() {
    }

    public Contenir(Long idCon, int qteCon) {
        super();
        this.idCon = idCon;
        this.qteCon = qteCon;
    }

    public Long getIdCon() {
        return idCon;
    }

    public void setIdCon(Long idCon) {
        this.idCon = idCon;
    }

    public int getQteCon() {
        return qteCon;
    }

    public void setQteCon(int qteCon) {
        this.qteCon = qteCon;
    }

    @Override
    public String toString() {
        return "Contenir{" +
                "idCon=" + idCon +
                ", qteCon=" + qteCon +
                '}';
    }
}
