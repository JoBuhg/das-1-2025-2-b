package br.univille;

import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class publisher {
    public static void main(String[] args){
        var topicname:"topic-das1-b";
        var servidor ="https://sbdas12025a.servicebus.windows.net/topic-das1-b";
        
        DefaultAzureCredential credential =
            new DefaultAzureCredentialBuilder().build();
    }
}