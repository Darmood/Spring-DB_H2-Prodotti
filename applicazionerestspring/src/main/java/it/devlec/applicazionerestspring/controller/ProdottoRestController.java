package it.devlec.applicazionerestspring.controller;

import it.devlec.applicazionerestspring.avviso.ProdottoNonTrovato;
import it.devlec.applicazionerestspring.model.Prodotto;

import it.devlec.applicazionerestspring.persistenza.ProdottiRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

@RestController
@SuppressWarnings("unused")
public class ProdottoRestController {
    private static Logger logger =
            LoggerFactory.getLogger(ProdottoRestController.class);
    private ProdottiRepository repository;

    ProdottoRestController(ProdottiRepository repository){
        this.repository = repository;
    }

    @GetMapping("/prodotti")
    public List<Prodotto> leggiTuttiIProdotti(){
        logger.info("Prendo tutti gli utenti");
        return repository.findAll();
    }

    @GetMapping("/prodotto/{id}")
    public Prodotto trovaProdottoConID(@PathVariable Long id){
        return repository.findById(id).orElseThrow(
                () -> new ProdottoNonTrovato(id));
    }

    @PostMapping("/prodotto")
    public Prodotto inserisciUnNuovoProdotto(@RequestBody Prodotto p) {
        return repository.save(p);
    }

    @PutMapping("/prodotto")
    public Prodotto aggiornaDatiProdotto(@RequestBody Prodotto p) {
        return repository.save(p);
    }

    @DeleteMapping("/prodotto/{id}")
    public void eliminaProdotto(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping("/prodotti/conNome")
    public List<Prodotto> trovaProdottoConNome(
            @RequestParam(name = "nome") String nome
    ){
        return repository.findByNome(nome);
    }

    @GetMapping("/prodotti/conDataDiProduzioneTra")
    public List<Prodotto> ricercaProdottiCondataDiProduzione(
            @RequestParam(name="datada") @DateTimeFormat(pattern = "dd-MM-yyyy")
            Date datada,
            @RequestParam(name = "dataa") @DateTimeFormat(pattern = "dd-MM-yyyy")
            Date dataa
    ){
        return repository.findByDataDiProduzioneBetween(datada, dataa);
    }

    @GetMapping("/prodotti/conDataDiScadenzaTra")
    public List<Prodotto> ricercaProdottiConDataDiScadenza(
            @RequestParam(name="datada") @DateTimeFormat(pattern = "dd-MM-yyyy")
            Date datada,
            @RequestParam(name = "dataa") @DateTimeFormat(pattern = "dd-MM-yyyy")
            Date dataa
    ){
        return repository.findByDataDiScadenzaBetween(datada, dataa);
    }

    @GetMapping("/prodotti/conDataDiPrenotazioneTra")
    public List<Prodotto> ricercaProdottiConDataDiPrenotazione(
            @RequestParam(name="datada") @DateTimeFormat(pattern = "dd-MM-yyyy")
            Date datada,
            @RequestParam(name = "dataa") @DateTimeFormat(pattern = "dd-MM-yyyy")
            Date dataa
    ){
        return repository.findByDataDiPrenotazioneBetween(datada, dataa);
    }

    @GetMapping("/prodotti/conDataDiAcquistoTra")
    public List<Prodotto> ricercaProdottiConDataDiAcquisto(
            @RequestParam(name="datada") @DateTimeFormat(pattern = "dd-MM-yyyy")
                    Date datada,
            @RequestParam(name = "dataa") @DateTimeFormat(pattern = "dd-MM-yyyy")
                    Date dataa
    ){
        return repository.findByDataDiAcquistoBetween(datada, dataa);
    }

    @GetMapping("/prodotti/conCostoTra")
    public List<Prodotto> ricercaProdottiConCosto(
            @RequestParam(name = "min") float min ,
            @RequestParam(name = "max") float max
    ) {
        return repository.findByCostoBetween(min, max);
    }

    @GetMapping("/prodotti/conValuta")
    public List<Prodotto> trovaProdottiConValuta(
            @RequestParam(name = "valuta") String valuta
    ){
        return repository.findByValuta(valuta);
    }

    @GetMapping("/prodotti/conRiciclabile")
    public List<Prodotto> trovaProdottiConRiciclabile(
            @RequestParam(name = "riciclabile") Boolean riciclabile
    ){
        return repository.findByRiciclabile(riciclabile);
    }

    @GetMapping("/prodotti/conNumeroModello")
    public List<Prodotto> trovaProdottiConNumeroModello(
            @RequestParam(name = "numeroModello") Long numeroModello
    ){
        return repository.findByNumeroModello(numeroModello);
    }

    @GetMapping("/prodotti/conVersioneTra")
    public List<Prodotto> ricercaProdottiConVersioneTra(
            @RequestParam(name = "min") float min ,
            @RequestParam(name = "max") float max
    ) {
        return repository.findByNumeroVersioneBetween(min, max);
    }

    @GetMapping("/prodotti/conCodiceABarre")
    public List<Prodotto> trovaProdottiConCodiceABarre(
            @RequestParam(name = "codiceABarre") String conCodiceABarre
    ){
        return repository.findByCodiceABarre(conCodiceABarre);
    }
    @GetMapping("/prodotti/conNumeroDiSerie")
    public List<Prodotto> trovaProdottiConNumeroDiSerie(
            @RequestParam(name = "numeroDiSerie") String numeroDiSerie
    ){
        return repository.findByNumeroDiSerie(numeroDiSerie);
    }

}