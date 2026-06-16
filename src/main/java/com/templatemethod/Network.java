package com.templatemethod;

/**
 * Classe base para rede social.
 * 
 * A classe abstrata define um método padrão que contém um
 * esqueleto de algum algoritmo composto de chamadas, geralmente
 * para operações abstratas primitivas. Subclasses concretas
 * implementam essas operações, mas deixam o método padrão em si
 * intacto.
 */
public abstract class Network {

    String userName;
    String password;

    Network() {
    }

    /**
     * Publique os dados em qualquer rede.
     */
    public boolean post(String message) {
        // Autentique antes de postar. Cada rede usa um
        // Método de autenticação.
        if (logIn(this.userName, this.password)) {
            // Send the post data.
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);

    abstract boolean sendData(byte[] data);

    abstract void logOut();
}
