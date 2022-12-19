import controller.ApplicationController;
import model.User;
import repository.impl.UserRepositoryImpl;
import service.impl.CardServiceImpl;
import service.impl.DeckServiceImpl;
import service.impl.GameServiceImpl;
import service.impl.UserServiceImpl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RunApplication {
    //TODO - Ajustar funcionamento futuramente, atualmente fazer um controle por terminal para o uso do CRUD.
    //Este controle é temporário.
    //Essa classe de funcionamento é so para testar o CRUD no momento.
    public static void main(String[] args) {
        ApplicationController applicationController = new ApplicationController(
                new UserServiceImpl(new UserRepositoryImpl()),
                new GameServiceImpl(),
                new DeckServiceImpl(),
                new CardServiceImpl()
        );

        System.out.println("Testa criação usuário");
        System.out.println("Testa busca usuários");
        System.out.println("Testa ediçao usuários");
        System.out.println("Testa remoção usuários");

        System.out.println("Testa criação cards");
        System.out.println("Testa busca cards");
        System.out.println("Testa ediçao cards");
        System.out.println("Testa remoção cards");

        System.out.println("Testa criação decks");
        System.out.println("Testa busca decks");
        System.out.println("Testa ediçao decks");
        System.out.println("Testa remoção decks");

        System.out.println("Testa criação game");
        System.out.println("Testa busca game");
        System.out.println("Testa ediçao game");
        System.out.println("Testa remoção game");
    }

}
