package com.ecommerce.mini_projet.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "commmande")
@SequenceGenerator(name="COMMANDE_SEQ", sequenceName="COMMANDE_id_seq", allocationSize = 1)
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMMANDE_SEQ")
    @Column(name = "idCom")
    private int ComId;

    @Column(name = "numCom")
        private int NumCom;

    @Column(name = "dateCom")
    private Date DateCom;

    public Commande() {
    }

    public Commande(int NumCom, Date DateCom) {
        this.NumCom = NumCom;
        this.DateCom = DateCom;
        }

    public int getComId() {
        return ComId;
    }

    public int getNumCom() {
        return NumCom;
    }

    public Date getDateCom() {
        return DateCom;
    }

    public void setComId(int comId) {
        ComId = comId;
    }

    public void setNumCom(int numCom) {
        NumCom = numCom;
    }

    public void setDateCom(Date dateCom) {
        DateCom = dateCom;
    }
    @Override
    public String toString() {
        return "Commande{" +
                "ComId=" + ComId +
                ", NumCom=" + NumCom +
                ", DateCom=" + DateCom +
                '}';
    }

}
