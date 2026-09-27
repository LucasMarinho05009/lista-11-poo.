package br.com.nexustech.exception;

public class NivelInsuficienteException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public NivelInsuficienteException() { super("Seu nível é muito baixo para esta masmorra!"); }
}
