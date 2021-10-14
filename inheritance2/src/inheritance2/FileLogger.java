package inheritance2;

public class FileLogger extends Logger {
	@Override // bunu yazmasanýzda kod inherit ettiði classýn ayný isimdeki fonksiyonunu override eder.
	public void log() {
		System.out.println("Dosyaya loglandý.");
	}
}
