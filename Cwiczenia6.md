# Cwiczenia 5

##

## Kolory - trudniejsze

#### Teoria

###### Kolory
Kazdy kolor w przyrodzie mozna okreslic kombinacja trzech kolorow podstawowych:
* Czerwonego
* Zielonego
* Niebieskiego

Kazdy z tych trzech komponentow zazwyczaj podaje sie w zakresie od `0.0` do `1.0`.

###### Mieszanie kolorow
Mieszanie dwoch kolorow odbywa sie za pomoca liczenia sredniej kazdego komponentow (czerwony, zielony, niebieski):

```
Kolor 1 - (0.7, 0.5, 0.3)
Kolor 2 - (0.1, 0.2, 0.4)

Kolor 1+2 - ( (0.7 + 0.1) / 2,  (0.5 + 0.2) / 2,  (0.3 + 0.4) / 2 )
```

###### Natezenie (jasnosc) koloru

Natezenie koloru to po prostu srednia wczystkich 3 komponentow (czerwony, zielony, niebieski):
```
Kolor 1 - (0.7, 0.5, 0.3)
Natezenie koloru 1 - (0.7 + 0.5 + 0.3) / 3
```

#### Zadanie

Napisz klase Kolor ktora reprezentuje dowolny kolor tak jak wedlug powyzej opisanego schematu.
Klasa Kolor powinna zawierac nastepujace publiczne metody:

* `void wypiszKolor()` - wypisuje 3 komponent kolory w formacie np.: `Czerwony: 0.2 Zielony: 0.5 Niebieski: 0.8`
* `void dodajKolor(Kolor kolor)` - dodaje do siebie kolor `kolor` uzywajac wyzej opisanych regul mieszania
* `float natezenie()` - zwraca natezenie koloru  
* `float czerwony()` - ktory zwraca czerwony komponent koloru
* `float zielony()` - ktory zwraca zielony komponent koloru
* `float niebieski()` - ktory zwraca niebieski komponent koloru

Napisz druga klase KolorMain (ktora zawiera metode main), ktora wykona nastepujace czynnosci:

* Stworzy jeden kolor z dowolnymi wartosciami
* Stworzy drugi kolor z dowolnymi wartosciami
* Wypisze informacje o pierwszym kolorze
* Wypisze informacje o drugim kolorze
* Wypisze natezenie pierwszego koloru
* Wypisze natezenie drugiego koloru
* Doda kolor drugi do koloru pierwszego
* Wypisze informacje o pierwszym kolorze
* Wypisze naterzenie pierwszego koloru
* Wypisze zielony komponent pierwszego koloru
* Wypisze niebieski komponent drugiego koloru

##
