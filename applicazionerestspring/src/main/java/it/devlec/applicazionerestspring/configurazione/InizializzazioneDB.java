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
            Prodotto p1 = new Prodotto(
                    null,
                    "Scopa",
                    "Una bellissima scopa blu",
                    null,
                    null,
                    null,
                    null,
                    35.97F,
                    "euro",
                    true,
                    7L,
                    3.0F,
                    "958947589347",
                    "A54JGU"
                    );


            List<Prodotto> utenti = new ArrayList<>();
            utenti.add(p1);

            repository.saveAll(utenti);
        };
    }
}
