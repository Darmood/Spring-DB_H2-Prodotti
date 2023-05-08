package it.devlec.applicazionerestspring.configurazione;

import it.devlec.applicazionerestspring.model.Prodotto;
import it.devlec.applicazionerestspring.persistenza.ProdottiRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class InizializzazioneDB {
    private static Logger logger = LoggerFactory.getLogger(InizializzazioneDB.class);
    @Bean
    CommandLineRunner inserisciProdotti(ProdottiRepository repository){
        return args -> {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

            Prodotto p1 = new Prodotto(
                    null,
                    "Swiffer",
                    "Scopa acchiappa polvere",
                    sdf.parse("01-01-2024")/* dataDiAcquisto */,
                    sdf.parse("01-01-2024")/* dataDiProduzione */,
                    sdf.parse("01-01-2024")/* dataDiPrenotazione */,
                    sdf.parse("01-01-9999")/* dataDiScadenza */,
                    35.97F,
                    "euro",
                    true,
                    7L,
                    3.0F,
                    "958947589347",
                    "A54JGU"
                    );

            Prodotto p2 = new Prodotto(
                    null,
                    "Lumios Readix",
                    "Lmpada verde per la lettura",
                    sdf.parse("01-01-2024")/* dataDiAcquisto */,
                    sdf.parse("01-01-2024")/* dataDiProduzione */,
                    sdf.parse("01-01-2024")/* dataDiPrenotazione */,
                    sdf.parse("01-01-9999")/* dataDiScadenza */,
                    56.70F,
                    "euro",
                    true,
                    7L,
                    3.0F,
                    "958947589347",
                    "A54JGU"
            );

            Prodotto p3 = new Prodotto(
                    null,
                    "SanCarlo Vivaci",
                    "Patatine alla paprica piccanti",
                    sdf.parse("01-12-2022")/* dataDiAcquisto */,
                    sdf.parse("01-01-2022")/* dataDiProduzione */,
                    sdf.parse("01-12-2022")/* dataDiPrenotazione */,
                    sdf.parse("20-12-2023")/* dataDiScadenza */,
                    2.50F,
                    "euro",
                    true,
                    1L,
                    1.0F,
                    "560548684865",
                    "G533D5"
            );

            List<Prodotto> utenti = new ArrayList<>(List.of(p1,p2,p3));
            repository.saveAll(utenti);
        };
    }
}
