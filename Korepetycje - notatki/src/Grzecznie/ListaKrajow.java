package Grzecznie;

import java.util.ArrayList;
import java.util.Collections;

public class ListaKrajow {

	ArrayList<Debt> lista_krajow;

	public ListaKrajow() {

		lista_krajow = new ArrayList<>();
	}

	public void dodajKraj(Debt u) {
		if (u == null) {
			System.err.println(": Nie mo¿na dodaæ nieistniej¹cego kraju");
			return;
		}
		lista_krajow.add(u);
	}

	public void wyswietlKraje() {
		if (lista_krajow.isEmpty()) {
			System.out.println(": Brak kraju na liscie");
			return;
		}
		System.out.println("lista krajów:");
		int i = 1;
		for (Debt u : lista_krajow) {
			System.out.println(i++ + "." + u.toString());
		}
	}

	public Debt kraj(int nr_kraju) {
		if (nr_kraju <= 0 || nr_kraju > lista_krajow.size()) {
			System.err.println(": Nie ma takiego kraju na liscie");
			return null;
		}
		return lista_krajow.get(nr_kraju - 1);
	}

	public Debt usunKraj(int nr_kraju) {
		if (nr_kraju <= 0 || nr_kraju > lista_krajow.size()) {
			System.err.println(": Nie ma takiego kraju na liscie");
			return null;
		}
		return lista_krajow.remove(nr_kraju - 1);
	}

	public void posortujKraje() {
		Collections.sort(lista_krajow);
	}

}
