# Walidacja Danych (Operacje na Stringach)

#### Parsing

* String -> Int,Float,etc.

```java
  int a = Integer.parseInt("5");

  float b = Float.parseFloat("6.7");
  float b = Float.parseFloat("6.7f");

  boolean c = Boolean.parseBoolean("true"); // c = true
  boolean c = Boolean.parseBoolean("TRUE"); // c = true
  boolean c = Boolean.parseBoolean("false"); // c = false
  boolean c = Boolean.parseBoolean("aaaaa"); // c = false
```

#### String length

Funkcja `.length()` zwraca dlugosc Stringa

```java
  String a = "abcdef";

  int dlugosc = a.length(); // dlugosc = 6
```

#### Split, Substring i charAt

* Split rozbija stringa w kazdym miejscu gdzie wystepuje wybrany znak/sekwencja znakow.

```java
  String a = "111.222.333.444";
  String[] rozbiteA = a.split(".");

  //rozbiteA = ["111", "222", "333", "444"]

  String b = "aaa--bbb--ccc";
  String[] rozbiteB = b.split("--");

  //rozbiteB = ["aaa", "bbb", "ccc"]
```

* Substring zwraca fragment oryginalnego tekstu od indeksu poczatkowego znaku do indeksy koncowego znaku

```java
  String a = "Kraj: Polska";
  String b = "Kraj: Australia";

  String aSubstring = a.substring(6, a.length()); // od 6 do a.length() (dlugosc A)
  String bSubstring = b.substring(6);             // od 6 do konca
```

* CharAt zwraca znak (`char`)

```java
  String a = "abcde";

  char znak = a.charAt(0); // znak = 'a';
  char znak = a.charAt(2); // znak = 'c';
  char znak = a.charAt(4); // znak = 'e';
```
