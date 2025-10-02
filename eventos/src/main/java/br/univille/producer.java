package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusSenderClient;

public class producer {
    public static void main(String[] args) {
        var servidor = "sb-das1-2025.servicebus.windows.net";
        var chave = System.getenv("CHAVE");
        var queue = "queue-joaooliveira";


         ServiceBusSenderClient SenderClient = new ServiceBusClientBuilder()
            .fullyQualifiedNamespace(servidor)
            .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
            // .credential(credential)
            .connectionString(chave)
            .sender()
            .topicName(queue)
            .buildClient();

        SenderClient.sendMessage(
            new ServiceBusMessage(
                "1: THE UNIVEEEEERSE!"));
        
        SenderClient.sendMessage(
            new ServiceBusMessage(
                "2: it's hiiiiiiiigh noooooon!"));

        SenderClient.sendMessage(
            new ServiceBusMessage(
                "3: AREA DENIED!"));
    }
}
