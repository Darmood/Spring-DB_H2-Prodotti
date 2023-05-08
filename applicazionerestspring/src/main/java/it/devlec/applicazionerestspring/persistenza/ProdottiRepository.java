package it.devlec.applicazionerestspring.persistenza;

import it.devlec.applicazionerestspring.model.Prodotto;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProdottiRepository extends JpaRepository<Prodotto, Long> {

    List<Prodotto> findByNome(String nome);
    List<Prodotto> findByDescrizione(String descrizione);
    List<Prodotto> findByDataDiAcquistoBetween(Date datada, Date dataa);
    List<Prodotto> findByDataDiProduzioneBetween(Date datada, Date dataa);
    List<Prodotto> findByDataDiPrenotazioneBetween(Date datada, Date dataa);
    List<Prodotto> findByDataDiScadenzaBetween(Date datada, Date dataa);
    List<Prodotto> findByCostoBetween(float min, float max);
    List<Prodotto> findByValuta(String valuta);
    List<Prodotto> findByRiciclabile(Boolean riciclabile);
    List<Prodotto> findByNumeroModello(Long numeroModello);
    List<Prodotto> findByNumeroVersione(float numeroVersione);
    List<Prodotto> findByCodiceABarre(String codiceABarre);
    List<Prodotto> findByNumeroDiSerie(String numeroDiSerie);


}