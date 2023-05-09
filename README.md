# API-RestSpring per la gestione dei Prodotti
Questa applicazione permette di effettuare le operazioni crud base, e un insieme di ricerche per ogni parametro dei prodotti che consentono di ottenere un sottoinsieme dei prodotti salvati.

L'pplicazione è basata su Spring boot con le seguenti funzioni:
- Database H2 in memoria
- Restfull API.

## Risultati test Request su Postman

### Richiesta GET ALL 
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
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json

```
</details>

### Richiesta PUT
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json

```
</details>

### Richiesta DELETE
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json

```
</details>

### Richiesta GET CON NOME
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json

```
</details>

### Richiesta GET CON DATA DI PRODUZIONE
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json

```
</details>

### Richiesta CON DATA DI SCADENZA
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json

```
</details>

### Richiesta CON DATA DI PRENOTAZIONE
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json

```
</details>

### Richiesta GET CON DATA DI ACQUISTO
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json

```
</details>

### Richiesta GET CON COSTO
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json

```
</details>

### Richiesta GET CON VALUTA
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json

```
</details>

### Richiesta GET CON RICICLABILE
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json

```
</details>

### Richiesta GET CON NUMERO MODELLO
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json

```
</details>

### Richiesta GET CON VERSIONE
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json

```
</details>

### Richiesta GET CON CODICE A BARRE
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json

```
</details>

### Richiesta GET CON NUMERO DI SERIE 
```
http://localhost:8080/prodotto/1
```

<details>
    <summary>Risposta del server</summary>

```json

```
</details>