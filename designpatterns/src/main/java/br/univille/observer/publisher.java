package br.univille.observer;


import java.util.ArrayList;


public class publisher {
    private ArrayList<Subscriber> subscribers =
        new ArrayList<>() ; //cria uma lista autoincrementavel com todos os assinantes <1 - *>

    private String mainState; //adciona o contexto da classe assinante.
    
    public String getMainState() { //retorna o contexto que foi programado
        return mainState;
    }
    public void setMainState(String mainState) { // de fato setta o contexto
        this.mainState = mainState;
    }


    public void Subscribe(Subscriber NewSubscriber){  //cria e adiciona o novo inscrito na lista de assinantes
        new ConcreteSubscriber();
        subscribers.add(NewSubscriber);
        System.out.println("Usuário "+NewSubscriber+" inscrito");
    }

    public void  NotifiSubscribers(){  //faz o update do novo contexto a todos os assinantes da lista
        for (Subscriber Assinante: subscribers){
          Assinante.Update(mainState);
        }
    }




}
