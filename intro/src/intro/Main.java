package intro;

public class Main {

	public static void main(String[] args) {

		String internetSubeButonu = "�nternet �ubesi";
		System.out.println(internetSubeButonu);

		double dolarDun = 8.17;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;

		if (dolarDun < dolarBugun) {
			System.out.println("Dolar ��kt�");
		} else if (dolarDun > dolarBugun) {
			System.out.println("Dolar d��t�");
		} else {
			System.out.println("Dolar e�it");
		}

		// String kredi1 = "H�zl� kredi";
		// String kredi2 = "Mutlu emekli kredisi";
		// String kredi3 = "Konut kredisi";
		// String kredi4 = "�ift�i kredisi";
		// String kredi5 = "Msb kredisi";
		// String kredi6 = "Meb kredisi";

		// System.out.println(kredi1);
		// System.out.println(kredi2);
		// System.out.println(kredi3);
		// System.out.println(kredi4);
		// System.out.println(kredi5);
		// System.out.println(kredi6);

		String[] krediler = 
			{ 
				"H�zl� kredi",
				"Mutlu emekli kredisi",
				"Konut kredisi",
				"�ift�i kredisi",
				"Msb kredisi",
				"Meb kredisi" 
			};

		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
