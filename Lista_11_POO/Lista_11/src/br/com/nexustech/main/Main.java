package br.com.nexustech.main;

import br.com.nexustech.exception.BanidoException;
import br.com.nexustech.exception.NivelInsuficienteException;
import br.com.nexustech.model.Masmorra;
import br.com.nexustech.model.Matchmaker;
import br.com.nexustech.model.ModoCasual;
import br.com.nexustech.model.ModoJogo;
import br.com.nexustech.model.ModoRanqueado;

public class Main {
    public static void main(String[] args) {
        // Exercícios 1 e 2: divisão inteira por zero causa ArithmeticException.
        int kills = 15;
        int deaths = 0;
        try {
            System.out.println(kills / deaths);
        } catch (ArithmeticException e) {
            System.out.println("Taxa K/D: Jogador Invicto!");
        }

        // Exercício 3.
        String[] inventario = new String[3];
        try {
            inventario[5] = "Espada";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inventário cheio!");
        }

        // Exercício 4: prevenção do NullPointerException sem try-catch.
        String jogador = null;
        if (jogador != null) {
            System.out.println(jogador);
        } else {
            System.out.println("Jogador desconectado");
        }

        // Exercícios 5, 6 e 7: checked exception e finally.
        try {
            conectarServidor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fechando portas de rede do jogo...");
        }

        // Exercícios 8 e 9.
        Masmorra masmorra = new Masmorra();
        try {
            masmorra.entrar(20);
        } catch (NivelInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        // Exercícios 10 a 14: interface, polimorfismo e exceção checked.
        Matchmaker matchmaker = new Matchmaker();
        ModoJogo casual = new ModoCasual();
        ModoJogo ranqueado = new ModoRanqueado();
        try {
            matchmaker.encontrarSala(casual, false);
            matchmaker.encontrarSala(ranqueado, false);
            matchmaker.encontrarSala(ranqueado, true);
        } catch (BanidoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Jogo continua em execução.");
    }

    public static void conectarServidor() throws Exception {
        throw new Exception("Servidor caiu!");
    }
}
