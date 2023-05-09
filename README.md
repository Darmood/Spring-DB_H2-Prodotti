# API-RestSpring per la gestione dei Prodotti
Questa applicazione permette di effettuare le operazioni crud base, e un insieme di ricerche per ogni parametro dei prodotti che consentono di ottenere un sottoinsieme dei prodotti salvati.

L'pplicazione è basata su Spring boot con le seguenti funzioni:
- Database H2 in memoria
- Restfull API.
## Risultati test Request su Postman
Dati memorizzati per ogni prodotto:
- nome
- descrizione
- data di produzione
- data di scadenza
- data di renotazione
- data di acquisto
- costo
- valuta
- riciclabile
- numero modello
- numero versione
- codice a barre
- numero di serie

## Risultati test Request su Postman

### Richiesta GET ALL 
Permette di ricevere un elenco completo di tutti i prodotti nel database.
```
http://localhost:8080/prodotti
```

<details>
    <summary>Risposta del server</summary>

```json
[
    {
        "id": 1,
        "nome": "Swiffer",
        "descrizione": "Scopa acchiappa polvere",
        "dataDiProduzione": "2022-01-19T23:00:00.000+00:00",
        "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
        "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
        "costo": 35.97,
        "valuta": "euro",
        "riciclabile": false,
        "numeroModello": 765,
        "numeroVersione": 2.5,
        "codiceABarre": "438925723957",
        "numeroDiSerie": "G38HG3"
    },
    {
        "id": 2,
        "nome": "Lumios Readix",
        "descrizione": "Lmpada verde per la lettura",
        "dataDiProduzione": "2022-06-19T22:00:00.000+00:00",
        "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
        "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
        "costo": 56.7,
        "valuta": "USD",
        "riciclabile": true,
        "numeroModello": 230,
        "numeroVersione": 3.2,
        "codiceABarre": "958947589347",
        "numeroDiSerie": "A54JGU"
    },
    {
        "id": 3,
        "nome": "SanCarlo Vivaci",
        "descrizione": "Patatine alla paprica piccanti",
        "dataDiProduzione": "2023-01-19T23:00:00.000+00:00",
        "dataDiScadenza": "2024-01-19T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-06-09T22:00:00.000+00:00",
        "dataDiAcquisto": "2023-06-19T22:00:00.000+00:00",
        "costo": 2.5,
        "valuta": "euro",
        "riciclabile": true,
        "numeroModello": 1035,
        "numeroVersione": 1.0,
        "codiceABarre": "560548684865",
        "numeroDiSerie": "G533D5"
    }
]
```
</details>

### Richiesta GET CON ID
Permette di ricevere un singolo prodotto corrispondente al id univoco inserito alla fine del link
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json
{
  "id": 1,
  "nome": "Swiffer",
  "descrizione": "Scopa acchiappa polvere",
  "dataDiProduzione": "2022-01-19T23:00:00.000+00:00",
  "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
  "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
  "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
  "costo": 35.97,
  "valuta": "euro",
  "riciclabile": false,
  "numeroModello": 765,
  "numeroVersione": 2.5,
  "codiceABarre": "438925723957",
  "numeroDiSerie": "G38HG3"
}
```
</details>

### Richiesta POST
Permette di inserire un nuovo prodotto nel database fornendo i dati nel corpo della richiesta in formato JSON
```
http://localhost:8080/prodotto
```

<details>
    <summary>Request body</summary>

```json
{
  "nome": "Nuovo Prodotto",
  "descrizione": "Descrizione nuovo prodotto",
  "dataDiProduzione": "2018-01-19T23:00:00.000+00:00",
  "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
  "dataDiPrenotazione": "2019-01-09T23:00:00.000+00:00",
  "dataDiAcquisto": "2019-01-19T23:00:00.000+00:00",
  "costo": 1.22,
  "valuta": "euro",
  "riciclabile": false,
  "numeroModello": 564,
  "numeroVersione": 7.0,
  "codiceABarre": "438925723333",
  "numeroDiSerie": "G3FDG3"
}
```
</details>

<details>
    <summary>Risposta del server</summary>

```json
{
    "id": 4,
    "nome": "Nuovo Prodotto",
    "descrizione": "Descrizione nuovo prodotto",
    "dataDiProduzione": "2018-01-19T23:00:00.000+00:00",
    "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
    "dataDiPrenotazione": "2019-01-09T23:00:00.000+00:00",
    "dataDiAcquisto": "2019-01-19T23:00:00.000+00:00",
    "costo": 1.22,
    "valuta": "euro",
    "riciclabile": false,
    "numeroModello": 564,
    "numeroVersione": 7.0,
    "codiceABarre": "438925723333",
    "numeroDiSerie": "G3FDG3"
}
```
</details>

### Richiesta PUT
Permette di effettuare l'update di un prodotto già presente nel database fornendo i dati nel corpo della richiesta in formato JSON
```
http://localhost:8080/prodotto
```
<details>
    <summary>Request body</summary>

```json
{
    "id": 1,
    "nome": "Swiffer Ultra",
    "descrizione": "Descrizione modificata tramite put",
    "dataDiProduzione": "2022-01-19T23:00:00.000+00:00",
    "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
    "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
    "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
    "costo": 35.97,
    "valuta": "euro",
    "riciclabile": false,
    "numeroModello": 765,
    "numeroVersione": 2.5,
    "codiceABarre": "438925723957",
    "numeroDiSerie": "G38HG3"
}
```
</details>
<details>
    <summary>Risposta del server</summary>

```json
{
    "id": 1,
    "nome": "Swiffer Ultra",
    "descrizione": "Descrizione modificata tramite put",
    "dataDiProduzione": "2022-01-19T23:00:00.000+00:00",
    "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
    "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
    "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
    "costo": 35.97,
    "valuta": "euro",
    "riciclabile": false,
    "numeroModello": 765,
    "numeroVersione": 2.5,
    "codiceABarre": "438925723957",
    "numeroDiSerie": "G38HG3"
}
```
</details>

### Richiesta DELETE
Permette di eliminare un Prodotto dal database inserendo nell'url l'id del prodotto che si desidera eliminare
```
http://localhost:8080/prodotto/4
```

### Richiesta GET CON NOME
Permette di ottenere la lista di prodotti con il nome corrispondente a quello passato per parametro nel link della richiesta
```
http://localhost:8080/prodotti/conNome?nome=Swiffer
```

<details>
    <summary>Risposta del server</summary>

```json
[
    {
        "id": 1,
        "nome": "Swiffer",
        "descrizione": "Scopa acchiappa polvere",
        "dataDiProduzione": "2022-01-19T23:00:00.000+00:00",
        "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
        "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
        "costo": 35.97,
        "valuta": "euro",
        "riciclabile": false,
        "numeroModello": 765,
        "numeroVersione": 2.5,
        "codiceABarre": "438925723957",
        "numeroDiSerie": "G38HG3"
    }
]
```
</details>

### Richiesta GET CON DATA DI PRODUZIONE
Permette di ottenere una lista di tutti i prodotti con dataDiProduzione compresa tra la data inserita nel paramentro datada, e la data inserita nel parametro dataa

```
http://localhost:8080/prodotti/conDataDiProduzioneTra?datada=01-01-2022&dataa=01-01-2023
```

<details>
    <summary>Risposta del server</summary>

```json
[
    {
        "id": 1,
        "nome": "Swiffer",
        "descrizione": "Scopa acchiappa polvere",
        "dataDiProduzione": "2022-01-19T23:00:00.000+00:00",
        "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
        "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
        "costo": 35.97,
        "valuta": "euro",
        "riciclabile": false,
        "numeroModello": 765,
        "numeroVersione": 2.5,
        "codiceABarre": "438925723957",
        "numeroDiSerie": "G38HG3"
    },
    {
        "id": 2,
        "nome": "Lumios Readix",
        "descrizione": "Lmpada verde per la lettura",
        "dataDiProduzione": "2022-06-19T22:00:00.000+00:00",
        "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
        "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
        "costo": 56.7,
        "valuta": "USD",
        "riciclabile": true,
        "numeroModello": 230,
        "numeroVersione": 3.2,
        "codiceABarre": "958947589347",
        "numeroDiSerie": "A54JGU"
    }
]
```
</details>

### Richiesta CON DATA DI SCADENZA
Permette di ottenere una lista di tutti i prodotti con dataDiScadenza compresa tra la data inserita nel paramentro datada, e la data inserita nel parametro dataa
```
http://localhost:8080/prodotti/conDataDiScadenzaTra?datada=01-01-2024&dataa=12-12-2024
```

<details>
    <summary>Risposta del server</summary>

```json
[
    {
        "id": 3,
        "nome": "SanCarlo Vivaci",
        "descrizione": "Patatine alla paprica piccanti",
        "dataDiProduzione": "2023-01-19T23:00:00.000+00:00",
        "dataDiScadenza": "2024-01-19T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-06-09T22:00:00.000+00:00",
        "dataDiAcquisto": "2023-06-19T22:00:00.000+00:00",
        "costo": 2.5,
        "valuta": "euro",
        "riciclabile": true,
        "numeroModello": 1035,
        "numeroVersione": 1.0,
        "codiceABarre": "560548684865",
        "numeroDiSerie": "G533D5"
    }
]
```
</details>

### Richiesta CON DATA DI PRENOTAZIONE
Permette di ottenere una lista di tutti i prodotti con dataDiPrenotazione compresa tra la data inserita nel paramentro datada, e la data inserita nel parametro dataa
```
http://localhost:8080/prodotti/conDataDiPrenotazioneTra?datada=01-06-2023&dataa=11-06-2023
```

<details>
    <summary>Risposta del server</summary>

```json
[
    {
        "id": 3,
        "nome": "SanCarlo Vivaci",
        "descrizione": "Patatine alla paprica piccanti",
        "dataDiProduzione": "2023-01-19T23:00:00.000+00:00",
        "dataDiScadenza": "2024-01-19T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-06-09T22:00:00.000+00:00",
        "dataDiAcquisto": "2023-06-19T22:00:00.000+00:00",
        "costo": 2.5,
        "valuta": "euro",
        "riciclabile": true,
        "numeroModello": 1035,
        "numeroVersione": 1.0,
        "codiceABarre": "560548684865",
        "numeroDiSerie": "G533D5"
    }
]
```
</details>

### Richiesta GET CON DATA DI ACQUISTO
Permette di ottenere una lista di tutti i prodotti con dataDiAcquisto compresa tra la data inserita nel paramentro datada, e la data inserita nel parametro dataa
```
http://localhost:8080/prodotti/conDataDiAcquistoTra?datada=10-01-2023&dataa=21-01-2023
```

<details>
    <summary>Risposta del server</summary>

```json
[
    {
        "id": 1,
        "nome": "Swiffer",
        "descrizione": "Scopa acchiappa polvere",
        "dataDiProduzione": "2022-01-19T23:00:00.000+00:00",
        "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
        "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
        "costo": 35.97,
        "valuta": "euro",
        "riciclabile": false,
        "numeroModello": 765,
        "numeroVersione": 2.5,
        "codiceABarre": "438925723957",
        "numeroDiSerie": "G38HG3"
    },
    {
        "id": 2,
        "nome": "Lumios Readix",
        "descrizione": "Lmpada verde per la lettura",
        "dataDiProduzione": "2022-06-19T22:00:00.000+00:00",
        "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
        "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
        "costo": 56.7,
        "valuta": "USD",
        "riciclabile": true,
        "numeroModello": 230,
        "numeroVersione": 3.2,
        "codiceABarre": "958947589347",
        "numeroDiSerie": "A54JGU"
    }
]
```
</details>

### Richiesta GET CON COSTO
Permette di ottenere una lista di tutti i prodotti con costo compreso tra il valore assegnato al paramentro min, e il il valore assegnato al paramentro max
```
http://localhost:8080/prodotti/conCostoTra?min=30.00&max=60.00
```

<details>
    <summary>Risposta del server</summary>

```json
[
    {
        "id": 1,
        "nome": "Swiffer",
        "descrizione": "Scopa acchiappa polvere",
        "dataDiProduzione": "2022-01-19T23:00:00.000+00:00",
        "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
        "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
        "costo": 35.97,
        "valuta": "euro",
        "riciclabile": false,
        "numeroModello": 765,
        "numeroVersione": 2.5,
        "codiceABarre": "438925723957",
        "numeroDiSerie": "G38HG3"
    },
    {
        "id": 2,
        "nome": "Lumios Readix",
        "descrizione": "Lmpada verde per la lettura",
        "dataDiProduzione": "2022-06-19T22:00:00.000+00:00",
        "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
        "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
        "costo": 56.7,
        "valuta": "USD",
        "riciclabile": true,
        "numeroModello": 230,
        "numeroVersione": 3.2,
        "codiceABarre": "958947589347",
        "numeroDiSerie": "A54JGU"
    }
]
```
</details>

### Richiesta GET CON VALUTA
Permette di ottenere la lista di prodotti con la valuta corrispondente a quella passata per parametro nel link della richiesta
```
http://localhost:8080/prodotti/conValuta?valuta=USD
```

<details>
    <summary>Risposta del server</summary>

```json
[
    {
        "id": 2,
        "nome": "Lumios Readix",
        "descrizione": "Lmpada verde per la lettura",
        "dataDiProduzione": "2022-06-19T22:00:00.000+00:00",
        "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
        "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
        "costo": 56.7,
        "valuta": "USD",
        "riciclabile": true,
        "numeroModello": 230,
        "numeroVersione": 3.2,
        "codiceABarre": "958947589347",
        "numeroDiSerie": "A54JGU"
    }
]
```
</details>

### Richiesta GET CON RICICLABILE
Permette di ottenere la lista di prodotti con il valore di reciclabile corrispondente a quello passato per parametro nel link della richiesta
```
http://localhost:8080/prodotti/conRiciclabile?riciclabile=true
```

<details>
    <summary>Risposta del server</summary>

```json
[
    {
        "id": 2,
        "nome": "Lumios Readix",
        "descrizione": "Lmpada verde per la lettura",
        "dataDiProduzione": "2022-06-19T22:00:00.000+00:00",
        "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
        "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
        "costo": 56.7,
        "valuta": "USD",
        "riciclabile": true,
        "numeroModello": 230,
        "numeroVersione": 3.2,
        "codiceABarre": "958947589347",
        "numeroDiSerie": "A54JGU"
    },
    {
        "id": 3,
        "nome": "SanCarlo Vivaci",
        "descrizione": "Patatine alla paprica piccanti",
        "dataDiProduzione": "2023-01-19T23:00:00.000+00:00",
        "dataDiScadenza": "2024-01-19T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-06-09T22:00:00.000+00:00",
        "dataDiAcquisto": "2023-06-19T22:00:00.000+00:00",
        "costo": 2.5,
        "valuta": "euro",
        "riciclabile": true,
        "numeroModello": 1035,
        "numeroVersione": 1.0,
        "codiceABarre": "560548684865",
        "numeroDiSerie": "G533D5"
    }
]
```
</details>

### Richiesta GET CON NUMERO MODELLO
Permette di ottenere la lista di prodotti con numeroDiModello corrispondente a quello passato per parametro nel link della richiesta
```
http://localhost:8080/prodotti/conNumeroModello?numeroModello=1035
```

<details>
    <summary>Risposta del server</summary>

```json
[
    {
        "id": 3,
        "nome": "SanCarlo Vivaci",
        "descrizione": "Patatine alla paprica piccanti",
        "dataDiProduzione": "2023-01-19T23:00:00.000+00:00",
        "dataDiScadenza": "2024-01-19T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-06-09T22:00:00.000+00:00",
        "dataDiAcquisto": "2023-06-19T22:00:00.000+00:00",
        "costo": 2.5,
        "valuta": "euro",
        "riciclabile": true,
        "numeroModello": 1035,
        "numeroVersione": 1.0,
        "codiceABarre": "560548684865",
        "numeroDiSerie": "G533D5"
    }
]
```
</details>

### Richiesta GET CON VERSIONE
Permette di ottenere la lista di prodotti con numeroVersione corrispondente a quello passato per parametro nel link della richiesta
```
http://localhost:8080/prodotti/conVersioneTra?min=2.0&max=3.0
```

<details>
    <summary>Risposta del server</summary>

```json
[
    {
        "id": 1,
        "nome": "Swiffer",
        "descrizione": "Scopa acchiappa polvere",
        "dataDiProduzione": "2022-01-19T23:00:00.000+00:00",
        "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
        "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
        "costo": 35.97,
        "valuta": "euro",
        "riciclabile": false,
        "numeroModello": 765,
        "numeroVersione": 2.5,
        "codiceABarre": "438925723957",
        "numeroDiSerie": "G38HG3"
    }
]
```
</details>

### Richiesta GET CON CODICE A BARRE
Permette di ottenere la lista di prodotti con codiceABarre corrispondente a quello passato per parametro nel link della richiesta
```
http://localhost:8080/prodotti/conCodiceABarre?codiceABarre=958947589347
```

<details>
    <summary>Risposta del server</summary>

```json
[
    {
        "id": 2,
        "nome": "Lumios Readix",
        "descrizione": "Lmpada verde per la lettura",
        "dataDiProduzione": "2022-06-19T22:00:00.000+00:00",
        "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
        "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
        "costo": 56.7,
        "valuta": "USD",
        "riciclabile": true,
        "numeroModello": 230,
        "numeroVersione": 3.2,
        "codiceABarre": "958947589347",
        "numeroDiSerie": "A54JGU"
    }
]
```
</details>

### Richiesta GET CON NUMERO DI SERIE
Permette di ottenere la lista di prodotti con numeroDiSerie corrispondente a quello passato per parametro nel link della richiesta
```
http://localhost:8080/prodotti/conNumeroDiSerie?numeroDiSerie=G38HG3
```

<details>
    <summary>Risposta del server</summary>

```json
[
    {
        "id": 1,
        "nome": "Swiffer",
        "descrizione": "Scopa acchiappa polvere",
        "dataDiProduzione": "2022-01-19T23:00:00.000+00:00",
        "dataDiScadenza": "9998-12-31T23:00:00.000+00:00",
        "dataDiPrenotazione": "2023-01-09T23:00:00.000+00:00",
        "dataDiAcquisto": "2023-01-19T23:00:00.000+00:00",
        "costo": 35.97,
        "valuta": "euro",
        "riciclabile": false,
        "numeroModello": 765,
        "numeroVersione": 2.5,
        "codiceABarre": "438925723957",
        "numeroDiSerie": "G38HG3"
    }
]
```
</details>