package br.univille.adapter;

public class NameProcessor implements TextProcessor{

    private String name = "zezinho silva"; //variavel que guarda o nome
    
    @Override
    public String processText() {
        String text = this.name;
        String[] parts = text.split(" ");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Nome deve conter apenas primeiro nome e sobrenome.");
        }
        if (text.matches("[0-9]+")) {  //não finciona essa verificação para o texto inteiro
            throw new IllegalArgumentException("Nome não deve conter números.");
        }
        String firstName = parts[0];
        String lastName = parts[1];
        return "Primeiro nome: " + firstName + ", Sobrenome: " + lastName;
    }
    
}