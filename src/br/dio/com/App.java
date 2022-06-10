package br.dio.com;
import java.util.Scanner;

public class App {
    public static void main (String[]Args) {

        Scanner sc = new Scanner(System.in);
        int userDecision;
        do {

            System.out.println("------- Olá Usuário - Bem vindo ao software de loja de carro!! -------");
            System.out.println("\nDigite a opção que deseja:\n1. Adicionar um dado\n2. Deletar um dado\n3. Atualizar um dado\n4. Ler os dados\n5. Sair da aplicação\n6. Limpar a tela");
            userDecision = sc.nextInt();
            switch (userDecision) {
                case 1: {
                    Methods.addingCar();
                    break;
                }

                case 2: {
                    Methods.deleteCar();
                    break;
                }

                case 3: {
                    Methods.updateCar();
                    break;
                }

                case 4: {
                    Methods.readCars();
                    break;
                }

                case 6: {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        break;
                    }

                }
            } while  (userDecision != 5);
        }
    }

