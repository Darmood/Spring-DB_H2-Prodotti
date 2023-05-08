package it.devlec.applicazionerestspring.controller;

import it.devlec.applicazionerestspring.avviso.UtenteNonTrovato;
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
                () -> new UtenteNonTrovato(id));
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

}