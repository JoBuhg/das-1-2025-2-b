package br.univille.observer;

public class ConcreteSubscriber implements Subscriber{

    private String Context;

    @Override
    public void Update(String newContext) {  
        this.Context = newContext;
    }

    @Override
    public String getContext() {
        return Context; 
    }

    
}