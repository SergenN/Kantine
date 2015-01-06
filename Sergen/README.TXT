1a.
in kantine class:
	hoeveelheidGeldInKassa()
	aantalArtikelen()
	resetKassa()

in Kassa class
	kassarij;

in Persoon class
pakArtikel() in persoon

2b.
een hashmap gebruik je wanneer je variabelen associatief wil opslaan,
 een hashset gebruik je als je gewoon als een array wil opslaan.
 
3a.
in de constructor wordt een kantine en een kantineAanbod aangemaakt.

3b.
getRandomNumber verkrijgt een random nummer tussen min en max
maar omdat bij een random nummer 0 ook wordt mee gerekend wordt er +1 gebruikt.




Week 4

1c.
Wanneer er geen constructor is wordt de default constructor aangeroepen , dit is een constructor zonder parameters.
deze wordt automatisch gegenereerd tijdens het compilen als er geen constructor gedefinieerd is.

1d.
Je kunt deze functies static maken omdat het niet nodig is om een object aan te maken om deze functies te gebruiken. 

1e.
Omdat de constructor nu prive is kun je alleen een de constructor  aanroepen van binnen uit de klasse.

1h.
final zet de variabele vast zodat het niet veranderd kan worden. 

1i. 
Je kunt geen niet-statisch veld aanroepen via een statische methode.

1j.
Het is geen constante meer. 

2b.
Je moet eerst de constructor van de super klasse aanroepen want dit voorkomt nullpointer exceptions. 



Week 5
1c er komt valse uit want de objecten zijn niet iedentiek.
1d equals want een string is een object en equals checkt of alle data in het object overeenkomt terwijl == checkt of de twee objecten identiek zijn

2c omdat zo de klasses die betaalwijze implementeren zo wel gebruik kunnen maken van variabele saldo

5a nee je kunt geen instantie maken van een interface via new omdat abstracte klasses een "template" zijn. Je kunt dus de methoden niet aanroepen (ook de constructor niet). 
5b nee je kunt ook geen instantie maken van een abstracte klasse via new
5c/d een klasse kan meerdere klassen implementeren maar 1 klasse extenden 
5e ja dat kan
5f nee want je kunt ook een public static methode in deze klasse hebben.
5g Ja dat kan moet omdat andere klasses deze methode moeten kunnen implementeren.
5h ?

6a Ja want dan geef je alleen aan dat er geen instantie kan worden gemaakt van deze klasse
6b Ja dat moet omdat --UITLEG--
6c je kunt de subklasse abstract maken om deze probleem te voorkomen. dit is logisch omdat --UITLEG--
6d ?
6e een final methode kan niet worden overreden; je kunt dus geen final abstract methode hebben omdat abstracte methodes altijd worden overreden.