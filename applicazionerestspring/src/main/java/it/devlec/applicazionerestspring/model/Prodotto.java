package it.devlec.applicazionerestspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Prodotto {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String descrizione;
    private Date dataDiAcquisto;
    private Date dataDiProduzione;
    private Date dataDiPrenotazione;
    private Date dataDiScadenza;
    private float costo;
    private String valuta;
    private Boolean riciclabile;
    private Long numeroModello;
    private float numeroVersione;
    private String codiceABarre;
    private String numeroDiSerie;

    public Prodotto() {
    }

    public Prodotto(
            Long id, String nome, String descrizione, Date dataDiAcquisto,
            Date dataDiProduzione, Date dataDiPrenotazione, Date dataDiScadenza,
            float costo, String valuta, Boolean riciclabile, Long numeroModello,
            float numeroVersione, String codiceABarre, String numeroDiSerie) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.dataDiAcquisto = dataDiAcquisto;
        this.dataDiProduzione = dataDiProduzione;
        this.dataDiPrenotazione = dataDiPrenotazione;
        this.dataDiScadenza = dataDiScadenza;
        this.costo = costo;
        this.valuta = valuta;
        this.riciclabile = riciclabile;
        this.numeroModello = numeroModello;
        this.numeroVersione = numeroVersione;
        this.codiceABarre = codiceABarre;
        this.numeroDiSerie = numeroDiSerie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Date getDataDiAcquisto() {
        return dataDiAcquisto;
    }

    public void setDataDiAcquisto(Date dataDiAcquisto) {
        this.dataDiAcquisto = dataDiAcquisto;
    }

    public Date getDataDiProduzione() {
        return dataDiProduzione;
    }

    public void setDataDiProduzione(Date dataDiProduzione) {
        this.dataDiProduzione = dataDiProduzione;
    }

    public Date getDataDiPrenotazione() {
        return dataDiPrenotazione;
    }

    public void setDataDiPrenotazione(Date dataDiPrenotazione) {
        this.dataDiPrenotazione = dataDiPrenotazione;
    }

    public Date getDataDiScadenza() {
        return dataDiScadenza;
    }

    public void setDataDiScadenza(Date dataDiScadenza) {
        this.dataDiScadenza = dataDiScadenza;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public Boolean getRiciclabile() {
        return riciclabile;
    }

    public void setRiciclabile(Boolean riciclabile) {
        this.riciclabile = riciclabile;
    }

    public Long getNumeroModello() {
        return numeroModello;
    }

    public void setNumeroModello(Long numeroModello) {
        this.numeroModello = numeroModello;
    }

    public float getNumeroVersione() {
        return numeroVersione;
    }

    public void setNumeroVersione(float numeroVersione) {
        this.numeroVersione = numeroVersione;
    }

    public String getCodiceABarre() {
        return codiceABarre;
    }

    public void setCodiceABarre(String codiceABarre) {
        this.codiceABarre = codiceABarre;
    }

    public String getNumeroDiSerie() {
        return numeroDiSerie;
    }

    public void setNumeroDiSerie(String numeroDiSerie) {
        this.numeroDiSerie = numeroDiSerie;
    }



}
