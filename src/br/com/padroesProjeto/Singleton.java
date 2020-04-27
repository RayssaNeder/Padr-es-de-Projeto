package br.com.padroesProjeto;

public class Singleton {
	
	private static Singleton uniqueInstance;
	
	//outras vari�veis de inst�ncia
	
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		
		return uniqueInstance;
	}
	
	//outros m�todos aqui
}
