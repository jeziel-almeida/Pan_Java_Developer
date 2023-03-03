package com.teste;

/**
 * Classe que representa o user.
 */
public class User {
    
    private String username;
    private String password;
    private StatusUser status;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Retorna o username.
     */
    public String getUsername() { return username; }

    /**
     * Retorna a password.
     */
    public String getPassword() { return password; }

    /**
     * Retorna o status.
     */
    public StatusUser getStatus() { return status; }

    /**
     * Desabilita o user setando o status DISABLED.
     */
    public void disable() {
        this.status = StatusUser.DISABLED;
    }

    /**
     * Habilita o user setando o status ENABLED.
     */
    public void enable() {
        this.status = StatusUser.ENABLED;
    }

}
