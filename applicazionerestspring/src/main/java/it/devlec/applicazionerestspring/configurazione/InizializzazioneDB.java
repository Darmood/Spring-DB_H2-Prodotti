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
                    sdf.parse("20-01-2022")/* dataDiProduzione */,
                    sdf.parse("01-01-9999")/* dataDiScadenza */,
                    sdf.parse("10-01-2023")/* dataDiPrenotazione */,
                    sdf.parse("20-01-2023")/* dataDiAcquisto */,
                    35.97F,
                    "euro",
                    false,
                    765L,
                    2.5F,
                    "438925723957",
                    "G38HG3"
                    );

            Prodotto p2 = new Prodotto(
                    null,
                    "Lumios Readix",
                    "Lmpada verde per la lettura",
                    sdf.parse("20-06-2022")/* dataDiProduzione */,
                    sdf.parse("01-01-9999")/* dataDiScadenza */,
                    sdf.parse("10-01-2023")/* dataDiPrenotazione */,
                    sdf.parse("20-01-2023")/* dataDiAcquisto */,
                    56.70F,
                    "USD",
                    true,
                    230L,
                    3.2F,
                    "958947589347",
                    "A54JGU"
            );

            Prodotto p3 = new Prodotto(
                    null,
                    "SanCarlo Vivaci",
                    "Patatine alla paprica piccanti",
                    sdf.parse("20-01-2023")/* dataDiProduzione */,
                    sdf.parse("20-01-2024")/* dataDiScadenza */,
                    sdf.parse("10-06-2023")/* dataDiPrenotazione */,
                    sdf.parse("20-06-2023")/* dataDiAcquisto */,
                    2.50F,
                    "euro",
                    true,
                    1035L,
                    1.0F,
                    "560548684865",
                    "G533D5"
            );

            List<Prodotto> prodotti = new ArrayList<>(List.of(p1,p2,p3));
            repository.saveAll(prodotti);
        };
    }
}
