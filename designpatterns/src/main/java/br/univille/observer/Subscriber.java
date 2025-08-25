package br.univille.observer;

public interface Subscriber {  //Uma anotação do que as classes Subscriber devem ter.

    public void Update (String newContext);

    public String getContext();
    
}