package Pacote;

public class Main {

     public static void main(String[] args) {
		  Termometro t = new Termometro();
		  System.out.println("Terperatura inicial: " + t.getTemperatura());
		  t.setTemperatura(25.0);
		  System.out.println("Temperatura atual: " + t.getTemperatura());
		  t.setTemperatura(60.0);
		  System.out.println("Temperatura apóstentativa inválida: " + t.getTemperatura());
		  t.setTemperatura(-20.0);
		  System.out.println("Temperatura após outra tentativa inválida: " + t.getTemperatura()); 
	}
}