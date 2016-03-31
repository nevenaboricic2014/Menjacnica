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
		
		if(valute.contains(v)){
			return;
		}
		valute.add(v);
		
		
	}

	@Override
	public void izbrisiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		
		for (int i = 0; i < valute.size(); i++) {
			Valuta v=valute.get(i);
			if(v.getNaziv().equals(naziv) && v.getSkraceniNaziv().equals(skraceniNaziv)){
				
				for(int j=0; j<v.kursevi.size(); j++){
					if(v.kursevi.get(j).getDatum().equals(datum)){
						v.kursevi.remove(j);
					}
				}
				
			}
		}
		
	}

	@Override
	public Kurs vratiKurs(String naziv, GregorianCalendar datum) {
		if(naziv==null || datum==null){
			return null;
		}
		for (int i = 0; i < valute.size(); i++) {
			Valuta v=valute.get(i);
			if(v.getNaziv().equals(naziv)){
				
				
					
						return v.kursevi.get(i);
					
				
				
			}
		}
		
	
	return null;
	}

}
