package com.ecommerce.mini_projet.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "article")
@SequenceGenerator(name="Article_SEQ", sequenceName="Article_id_seq", allocationSize = 1)
public class Article{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARTICLE_SEQ")
    @Column(name = "idArt")
    private Long idArt;

    @Column(name = "codeArt")
    private int codeArt;

    @Column(name = "desArt")
    private String desArt;
    @Column(name = "couleur")
    private String couleur;

    @Column(name = "puArt")
    private Float puArt;

    @Column(name = "qteArt")
    private int qteArt;

    public Long getIdArt() {
        return idArt;
    }

    public void setIdArt(Long idArt) {
        this.idArt = idArt;
    }

    public int getCodeArt() {
        return codeArt;
    }

    public void setCodeArt(int codeArt) {
        this.codeArt = codeArt;
    }

    public String getDesArt() {
        return desArt;
    }

    public void setDesArt(String desArt) {
        this.desArt = desArt;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Float getPuArt() {
        return puArt;
    }

    public void setPuArt(Float puArt) {
        this.puArt = puArt;
    }

    public int getQteArt() {
        return qteArt;
    }

    public void setQteArt(int qteArt) {
        this.qteArt = qteArt;
    }

    public Article() {
    }

    public Article(Long idArt, int codeArt, String desArt, String couleur, Float puArt, int qteArt) {
        super();
        this.idArt = idArt;
        this.codeArt = codeArt;
        this.desArt = desArt;
        this.couleur = couleur;
        this.puArt = puArt;
        this.qteArt = qteArt;
    }

    @Override
    public String toString() {
        return "Article{" +
                "idArt=" + idArt +
                ", codeArt=" + codeArt +
                ", desArt='" + desArt + '\'' +
                ", couleur='" + couleur + '\'' +
                ", puArt=" + puArt +
                ", qteArt=" + qteArt +
                '}';
    }

}
