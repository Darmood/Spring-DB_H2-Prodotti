package it.devlec.applicazionerestspring.controller;

import it.devlec.applicazionerestspring.avviso.ProdottoNonTrovato;
import it.devlec.applicazionerestspring.model.Prodotto;
import it.devlec.applicazionerestspring.model.Utente;

import it.devlec.applicazionerestspring.persistenza.ProdottiRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@RestController
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
    void eliminaProdotto(@PathVariable Long id) {
        repository.deleteById(id);
    }
    @GetMapping("/prodotti/conNome")
    public List<Prodotto> trovaProdottoConNome(
            @RequestParam(name = "nome") String nome
    ){
        return repository.findByNome(nome);
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
    @GetMapping("/prodotti/conDataDiProduzioneTra")
    public List<Prodotto> ricercaProdottiCondataDiProduzione(
            @RequestParam(name="datada") @DateTimeFormat(pattern = "dd-MM-yyyy")
            Date datada,
            @RequestParam(name = "dataa") @DateTimeFormat(pattern = "dd-MM-yyyy")
            Date dataa
    ){
        return repository.findByDataDiProduzioneBetween(datada, dataa);
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
    @GetMapping("/prodotti/conDataDiScadenzaTra")
    public List<Prodotto> ricercaProdottiConDataDiScadenza(
            @RequestParam(name="datada") @DateTimeFormat(pattern = "dd-MM-yyyy")
            Date datada,
            @RequestParam(name = "dataa") @DateTimeFormat(pattern = "dd-MM-yyyy")
            Date dataa
    ){
        return repository.findByDataDiScadenzaBetween(datada, dataa);
    }

}