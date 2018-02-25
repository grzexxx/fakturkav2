package rabaty;
import konfiguracja.*;

public class ObliczCenaPoRabatProcentowy implements IObliczCenePoRabacie{

	double procentRabatu = Konfiguracja.getInstance().getKwotaRabatu();
	
	@Override
	public double obliczCenePoRabacie(double cena){
		int procentRabatu = 20; //rabat 10zl
		cena = cena -cena*procentRabatu;
		return cena;
		
	}
}
