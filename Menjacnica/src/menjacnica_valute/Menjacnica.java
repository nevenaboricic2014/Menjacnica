package menjacnica_valute;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica_interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{
	
	LinkedList<Valuta> valute;
	
	public Menjacnica() {
		valute=new LinkedList<Valuta>();
	}

	@Override
	public void ubaciKurs(Valuta v) {

		if(v==null){
			return;
		} 
		else if(valute.contains(v)){
			return;
		}

	}

	@Override
	public void izbrisiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs vratiKurs(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}




}
