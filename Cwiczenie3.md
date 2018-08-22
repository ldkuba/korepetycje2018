# Cwiczenie 3

#### Napisz program ktory symuluje automat z jedzeniem

Automat ma spis produktow, ilosci i ceny oraz obecne srodki (pieniadze wrzucone przez uzytkownika).

```
Wybor:
Mars - 2 - 2,50
Snickers - 4 - 2,50
Twix - 3 - 3,00
Woda - 6 - 1,50
```

Napisz funkcje `void dodajProdukt(String nazwa, int ilosc)` i `void usunProdukt(String nazwa, int ilosc)`. Nie mozna dodac nowych produktow

Napisz funkcje `void ustawCene(String nazwa, float cena)` ktora zmienia cene produktu

Napisz funkcje `float wybierzProdukt(String nazwa)` ktora sprawdza czy jest jeszcze dany produkt oraz czy ma sie wystarczajaco pieniedzy oraz zwraca reszte
