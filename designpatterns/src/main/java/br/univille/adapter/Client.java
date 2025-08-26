package br.univille.adapter;

public class Client {

    public static void main(String[] args) {
        TextProcessor processor = new NameProcessor(); // cria o processador de texto
        String processedText = processor.processText(); // processa o texto
        System.out.println(processedText); // imprime o texto processado
    }
    
}
