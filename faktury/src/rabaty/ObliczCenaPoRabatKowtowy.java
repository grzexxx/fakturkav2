package rabaty;

public class ObliczCenaPoRabatKowtowy implements IObliczCenePoRabacie{

	@Override
	public double obliczCenePoRabacie(double cena){
		int kwotaRabatu = 10; //rabat 10zl
		cena = cena - kwotaRabatu;
		return cena;
		
	}
}
