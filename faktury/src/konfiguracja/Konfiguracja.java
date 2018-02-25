package konfiguracja;

import rabaty.*;

public class Konfiguracja {
	private static Konfiguracja instance = new Konfiguracja();

	private Konfiguracja() {
	}

	public static Konfiguracja getInstance() {
		return instance;
	}
	///////////////////////////////////////

	public IObliczCenePoRabacie getLiczarkaRabatu() {
	//	return new ObliczCenaPoRabatKowtowy();
		return new AdapterRabatuKlasowy();

	}
	public double getKwotaRabatu(){
		return 1.0;
	}
	public double getProcentRabatu(){
		return 10.0;
	}
}
