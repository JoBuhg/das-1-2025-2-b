package br.univille.observer;

public interface Subscriber {

    public void Update (String newContext);

    public String getContext();
    
}