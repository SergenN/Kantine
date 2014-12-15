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
