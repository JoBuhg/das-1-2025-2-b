package br.univille.singleton;

public class singleton {
    private static singleton instance; // variavel estatica que guarda a instância única

    private singleton() {
        // constructor privado para evitar instanciamento externo
        //só ele pode criar uma instância
        System.out.println("Singleton instanciado!");
    }

    public static singleton getInstance() { 
        if (instance == null) { //caso não tenha sido instanciado
            instance = new singleton(); //cria uma nova instância
            System.out.println("Singleton criado pela primeira vez!");
        }
        return instance; //devolve a instância
    }

    public void displayMessage() { // Metodo de exemplo para mostrar o uso do singleton
        System.out.println("Singleton acessado!");
    }
    
}
