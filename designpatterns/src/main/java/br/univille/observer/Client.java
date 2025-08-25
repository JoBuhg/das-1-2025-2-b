package br.univille.observer;

public class Client {
    public static void main(String[] args) {
        var grupofamiliar = new publisher();
        var huguinho = new ConcreteSubscriber();
        var zezinho = new ConcreteSubscriber();
        var alaide = new ConcreteSubscriber();

        grupofamiliar.Subscribe(huguinho);
        grupofamiliar.Subscribe(zezinho);
        grupofamiliar.Subscribe(alaide);

        grupofamiliar.setMainState("Bom DIA CARALHO");

        grupofamiliar.NotifiSubscribers();

    }
}
