
# Java-Sockets
Sviluppo di due software in grado di comunicare tra di loro attraverso i **Sockets**
```
Obiettivo del progetto: Realizzare due software in grado di comunicare 
```
**Per saperne di più sui Sockets** --> https://docs.google.com/presentation/d/19vhath-GbtUO7ofpukJE4Opi16aTfrnurJ2lUizB0iE/edit?usp=sharing

## Istruzioni
Per replicare il progetto sul vostro computer personale. Gli allievi potranno quindi apportare modifiche ed eventualmente fonderle con il progetto principale, o in alcuni casi creare un progetto propio.

### Prerequisiti
E' richiesto NetBeans IDE (Integrated Development Envirorment) per poter avviare le due classi Server e Client

### Installazione
Scarica i files del progetto cliccando "Clone/Download"
in NetBeans crea due nuovi progetti "Client" e "Server"


## Uso
Da NetBeans dopo aver creato il progetto:

### Client 
- Cliccare sul pulsante verde (Esegui),
- Quando viene richiesto il nome dell'host (indirizzo ip/nome alfanumerico), inserire il nome dell'host e premere invio,
- Quando viene richiesta la porta, inserire la porta e premere invio,
- Se non stampa nessun errore la connessione è effettuata

### Server 
- Cliccare sul pulsante verde (Esegui),
- Quando viene richiesto la porta del server, inserire il nome dell'host e premere invio,
- Se non stampa nessun errore la connessione è effettuata

NOTA: posso collegarmi al server con quanti Clients desidero, sia su stesso computer che da terminali su computer diversi.

### Esempio usando stesso computer sia per eseguire Server che multipli Clients
Da finestra di comando esguire il Server:
```
cd Documents\NetBeansProjects\Java-Sockets-Server\src
java ServerTestoMultiThreaded 1234
```
Da nuova finestra di comando esguire il ```primo``` Client
```
cd Documents\NetBeansProjects\Java-Sockets-Client\src
java client-Testo localhost 1234
```
Da nuova finestra di comando esguire il ```secondo``` Client
```
cd Documents\NetBeansProjects\Java-Sockets-Client\src
java client-Testo localhost 1234
```
## Licenza
Completamente Open Source.

## Autori
-Alessandro Ampala

-Gianmarco Rampulla

-Gerardo Scaricaciottoli

## Ringraziamenti
Al Prof per la proposta del progetto
