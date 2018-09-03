package Grzecznie;

public class Debt implements Comparable<Debt> {

	// 1) Pola klasy:

	private String nazwaKraju;
	private double dlug;
	private long ludnosc;
	private double PerCapita;

	// 2) Konstruktor:

	public Debt(String nazwaKraju, double dlug, long ludnosc) throws Exception {
		this.nazwaKraju = nazwaKraju;
		this.dlug = dlug;
		this.ludnosc = ludnosc;
		this.PerCapita = dlug * 1000 / ludnosc;

		if (nazwaKraju == "" || dlug < 0 || ludnosc == 0 || nazwaKraju.equalsIgnoreCase("")) {
			throw new Exception("nazwaKraju ==null || dlug <0 || ludnosc ==0");
		}
	}
	// 3) Funkcje:

	public String getNazwaKraju() {
		return nazwaKraju;
	}

	public void setNazwaKraju(String nazwaKraju) {
		this.nazwaKraju = nazwaKraju;
	}

	public double getDlug() {
		return dlug;
	}

	public void setDlug(double dlug) {
		this.dlug = dlug;
	}

	public long getLudnosc() {
		return ludnosc;
	}

	public void setLudnosc(long ludnosc) {
		this.ludnosc = ludnosc;
	}

	public double getPerCapita() {
		return PerCapita;
	}

	// Do sortowania

	public String toString() {
		return getNazwaKraju() + ";	" + getDlug() + " ;	" + getLudnosc() + "	;	" + getPerCapita();
	}

	public int compareTo(Debt u) {

		if (this.getLudnosc() > (u.getLudnosc())) {
			return 1;
		} else if (this.getLudnosc() == (u.getLudnosc())) {
			return 0;
		} else {
			return -1;
		}
	}

}
