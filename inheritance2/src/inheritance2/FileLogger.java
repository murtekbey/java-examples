package inheritance2;

public class FileLogger extends Logger {
	@Override // bunu yazmasan�zda kod inherit etti�i class�n ayn� isimdeki fonksiyonunu override eder.
	public void log() {
		System.out.println("Dosyaya logland�.");
	}
}
