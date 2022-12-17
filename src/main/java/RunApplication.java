import controller.ApplicationController;

import java.util.Scanner;

public class RunApplication {
    //TODO - Ajustar funcionamento futuramente, atualmente fazer um controle por terminal para o uso do CRUD.
    //Este controle é temporário.
    public static void main(String[] args) {
        ApplicationController applicationController = new ApplicationController();
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while(running){
            showStartMenu();
            int op = scanner.nextInt();

        }


    }

    static void showStartMenu(){
        System.out.println("Bem vindo ao sistema temporário do TCG WORLD CUP 2022");
        System.out.println("Para acessar faça login, ou crie sua conta:");
        System.out.println("Opção 1 - Logar");
        System.out.println("Opção 2 - Criar conta");
    }
}
