package rabaty;
import konfiguracja.*;

public class ObliczCenaPoRabatKowtowy implements IObliczCenePoRabacie{

	double kwotaRabatu = Konfiguracja.getInstance().getKwotaRabatu();
	
	@Override
	public double obliczCenePoRabacie(double cena){
		int kwotaRabatu = 20; //rabat 10zl
		cena = cena - kwotaRabatu;
		return cena;
		
	}
}
