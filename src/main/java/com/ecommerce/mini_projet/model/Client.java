package com.ecommerce.mini_projet.model;

import jakarta.persistence.*;

@Entity
@Table(name = "client")
@SequenceGenerator(name="CLIENT_SEQ", sequenceName="client_id_seq", allocationSize = 1)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLIENT_SEQ")
    @Column(name = "clid")
    private Long clid;

    @Column(name = "mdp")
    private String mdp;

    @Column(name = "nomcl")
    private String nomcl;

    @Column(name = "prenomcl")
    private String prenomcl;

    @Column(name = "adressecl")
    private String adressecl;

    @Column(name = "telcl")
    private String telcl;

    public Client() {
    }

    public Client(long clid,String mdp, String nomcl, String prenomcl, String adressecl, String telcl) {
        super();
        this.clid=clid;
        this.mdp = mdp;
        this.nomcl = nomcl;
        this.prenomcl = prenomcl;
        this.adressecl = adressecl;
        this.telcl = telcl;
    }

    public Long getClid() {
        return clid;
    }

    public void setClid(Long clid) {
        this.clid = clid;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getNomcl() {
        return nomcl;
    }

    public void setNomcl(String nomcl) {
        this.nomcl = nomcl;
    }

    public String getPrenomcl() {
        return prenomcl;
    }

    public void setPrenomcl(String prenomcl) {
        this.prenomcl = prenomcl;
    }

    public String getAdressecl() {
        return adressecl;
    }

    public void setAdressecl(String adressecl) {
        this.adressecl = adressecl;
    }

    public String getTelcl() {
        return telcl;
    }

    public void setTelcl(String telcl) {
        this.telcl = telcl;
    }

    @Override
    public String toString() {
        return "Client{" +
                "CLId=" + clid +
                ", mdp=" + mdp +
                ", NomCL='" + nomcl + '\'' +
                ", PrenomCl='" + prenomcl + '\'' +
                ", AdresseCl='" + adressecl + '\'' +
                ", TelCl=" + telcl +
                '}';
    }
}
