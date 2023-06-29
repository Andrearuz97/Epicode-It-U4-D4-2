package es_2;

import es_1.Dipendente;

public class GestioneDipendenti {
	public static void promuoviDipendenti(Dipendente operaio1, Dipendente impiegato) {
		operaio1.promuovi();
		impiegato.promuovi();
	}

	public static void stampaStatoDipendenti(Dipendente[] dipendenti) {
		for (Dipendente dipendente : dipendenti) {
			dipendente.stampaDatiDipendente();
		}
	}

	public static double calcolaStipendioTotale(Dipendente[] dipendenti, int oreStraordinario) {
		double stipendioTotale = 0;
		for (Dipendente dipendente : dipendenti) {
			stipendioTotale += Dipendente.calcolaPaga(dipendente, oreStraordinario);
		}
		return stipendioTotale;
	}
}
