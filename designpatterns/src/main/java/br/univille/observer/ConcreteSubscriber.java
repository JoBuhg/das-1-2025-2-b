package br.univille.observer;

public class ConcreteSubscriber implements Subscriber{ //implementa a interface de assinante


    private String Context; //cria a variavel que guarda o contexto
    
    public ConcreteSubscriber(){    // metodo de instancia
    }

    @Override
    public void Update(String newContext) {  // metodo para dar update a um novo contexto
        this.Context = newContext;
        System.out.println(newContext);
    }

    @Override
    public String getContext() {  // retorna o contexto atual do assinante
        System.out.println(Context);
        return this.Context; 
    }

    
}