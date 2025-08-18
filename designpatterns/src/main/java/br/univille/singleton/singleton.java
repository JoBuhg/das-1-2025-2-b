public class singleton {
    private static singleton instance; // variavel estatica que guarda a instância única

    private singleton() {
        // constructor privado para evitar instanciamento externo
        //só ele pode criar uma instância
    }

    public static singleton getInstance() { 
        if (instance == null) { //caso não tenha sido instanciado
            instance = new singleton(); //cria uma nova instância
        }
        return instance; //devolve a instância
    }

    public void displayMessage() { // Metodo de exemplo para mostrar o uso do singleton
        System.out.println("Singleton instance accessed!");
    }
    
}
