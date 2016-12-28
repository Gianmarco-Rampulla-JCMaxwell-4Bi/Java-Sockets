
# Java-Sockets
Sviluppo di due software in grado di comunicare tra di loro attraverso i **Sockets**
```
Obiettivo del progetto: Realizzare due software in grado di comunicare 
```
**Per saperne di più sui Sockets** --> https://docs.google.com/presentation/d/19vhath-GbtUO7ofpukJE4Opi16aTfrnurJ2lUizB0iE/edit?usp=sharing

## Istruzioni
Per replicare il progetto sul vostro computer personale. Gli allievi potranno quindi apportare modifiche ed eventualmente fonderle con il progetto principale, o in alcuni casi creare un progetto propio.

### Prerequisiti
Java SDK (Software Development Kit) - programma per la compilazione (javac) da codice in Java a ByteCode. L'installazione comprende anche Java JRE (Java Runtime Envirorment) che fornisce la Virtual Machine (VM) su cui far eseguire il ByteCode.
```
E' suggerito anche l'utilizzo di NetBeans IDE (Integrated Development Envirorment)
```

### Installazione
Scarica i files del progetto cliccando "Clone/Download"
in NetBeans crea due nuovi progetti "Java-Sockets-Client" e "Java-Sockets-Server"


## Uso
Da NetBeans dopo aver creato il progetto:

### Client 
- Cliccare sul pulsante verde (Esegui),
- Quando viene richiesto il nome dell'host (indirizzo ip/nome alfanumerico), inserire il nome dell'host e premere invio,
- Quando viene richiesta la porta, inserire la porta e premere invio,
- Se non stampa nessun errore la connessione è effettuata
```
java ServerTestoMultiThreaded <server port>
```
Da un terminale Client:
```
java clientTesto <host> <server port>
dove:
* host puo' essere espresso sia in forma numerica (es. 127.0.0.1) che in forma alfanumerica (es. www.nomeSito.com)
```
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
## Diventa un collaboratore
Questa e' la lista di nuove funzioni da aggiungere al progetto:
```
1. Di seguito alla nuova connessione di un Client con il Server,
   richiedere il "NickName" e utilizzarlo per la visualizzazione del messaggio 
   (invece della porta del Client come da progetto iniziale)
```
```
2. Aggiungere la possibilita' di mandare un comando (es. ListaUtenti) al Server 
   che di conseguenza restituisca la lista di tutti i Clients connessi.
```
```
3. Group Chat 
3.1. Possibilita' di iniziare una o piu' "group chat" fornendo per ogni chat il "Soggetto della discussione"
3.2. Possibilita' di invitare uno o piu' utenti conessi a entrare nella "goup chat"
3.3. Possibilita' di uscire dalla "group chat"
```
Mentre le modifiche descritte dai primi due punti risulteranno in una fusione (merge), le modifiche descritti dai punti 3 dovranno far parte di un nuovo progetto che parte da quello originario (fork).

## Licenza
Completamente Open Source.

## Autori
-Alessandro Ampala

-Gianmarco Rampulla

-Gerardo Scaricaciottoli

## Ringraziamenti
Al Prof per la proposta del progetto
