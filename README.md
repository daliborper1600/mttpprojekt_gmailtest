Projekt iz kolegija metode i tehnike testiranja programske podrške

ZADATAK:

Koristeći alate, upoznate pri izvođenju laboratorijskih vježbi, stvoriti okvir (eng. framework) za automatsko testiranje korisničkog sučelja Web programske podrške. 
Programsku podršku odabrati proizvoljno. 
Napisati barem 5 testnih slučajeva koristeći programski jezik po želji (npr. JAVA). 
Informacije o načinu korištenja, kao i alate korištene za stvaranje okvira navesti u README.md datoteku.
Projekt spremiti na neki od sustava za upravljanje izvornim kôdom (npr: GitHub). 
Rad poslati mailom (ferit.labosi@gmail.com) kao poveznicu na spremljeni projekt (eng. Repository).

NAPOMENA: Zadatak se ne može rješavati grupno. 

Korišteni alati: 

 - IntelliJ IDEA Community Edition 2019.1.3 x64
 - Google Chrome
 - chromedriver.exe
 
Upute:

- Klonirati projekt ili skinuti .zip file.
- pokrenuti projketu u IntelliJ
- pokrenuti test desnim klikom na gmailTest.java i Run
- za ovaj slučaj kreiran je tesni gmail: password i lozinka se nalaze unutar projekta ali je moguće koristiti bilo koji važeći mail
  UPOZORNJE: zbog sigurnosnih mjera taj mail će bit obrisan kroz 3 mjeseca

Tesni slučajevi koji se izvršavaju:


   1. gmailLogin() - otvara gmail login stranicu i upisuje username te klik na sljedeći ekran i upisuje password

   2. gmailLogout() - pokreće gmailLogin() pa ide na odjavu u gornjem desnom kutu
     
   3. pretraziMailove() - pokreće gmailLogin() i upisuje u tražilicu 'mttp' i pretražuje mailove s tom ključnom rječi
  
   4. prikaziTeme() - pokreće gmailLogin() i otvara izbornik sa temama
   
   5. kreirajMail() - pokreće gmailLogin() - i otvara formu za kreiranje maila
   
 Moguće pogreške:
 
 - ako nisu pročitani podaci o privatnosti od strane googla moguće je da ne otvori početnu login formu
 - ako je već logiran korisnik u gmail 

   
