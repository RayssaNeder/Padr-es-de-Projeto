package br.com.padroesProjeto;

public class Singleton {
	
	private static Singleton uniqueInstance;
	
	//outras variáveis de instância
	
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		
		return uniqueInstance;
	}
	
	//outros métodos aqui
}
