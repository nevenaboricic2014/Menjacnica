package menjacnica_interfejs;

import java.util.GregorianCalendar;

import menjacnica_valute.Kurs;
import menjacnica_valute.Valuta;

public interface MenjacnicaInterfejs {
	
	public void ubaciKurs(Valuta v);
	public void izbrisiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum);
	public Kurs vratiKurs(String naziv, GregorianCalendar datum);
	

}
