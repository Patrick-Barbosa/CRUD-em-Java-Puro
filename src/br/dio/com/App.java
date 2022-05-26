package br.dio.com;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main (String[]Args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Car> list = new ArrayList<>();
        int decision;
        int carQuantity = 0;

        do {

            System.out.println("------- Olá Usuário - Bem vindo ao programa!! -------");
            System.out.println("\nDigite a opção que deseja:\n1. Adicionar um dado\n2. Deletar um dado\n3. Atualizar um dado\n4. Ler os dados\n5. Sair da aplicação\n6. Limpar a tela");
            decision = sc.nextInt();
            if (decision == 1) {
                System.out.println("Então você deseja adicionar um carro ao sistema!\nPor favor, digite o nome do carro:");
                String nameCar = sc.next();
                System.out.println("Agora, por favor digite o ano do carro:");
                int yearCar = sc.nextInt();
                System.out.println("Por favor, digite o preço do carro com centavos:");
                float valueCar = sc.nextFloat();
                carQuantity = list.size()+1;
                Car object = new Car(nameCar, carQuantity, yearCar, valueCar);
                list.add(object);

            }

            if (decision == 2) {
                System.out.println("Então você deseja deletar um dado!\nCaso tenha errado, digite a letra c\nPor favor, digite o número do carro: ");
                String input = sc.next();
                if (input == "c") {

                } else {
                    int inputInt = Integer.parseInt(input);
                    list.remove(inputInt-1);
                    for (Car object : list) {
                        list.get(list.indexOf(object)).setCarID(list.indexOf(object)+1);
                    }
                }

            }

            if (decision == 3) {
                System.out.println("Então você deseja alterar o dado de um carro!\nPor favor, digite o número do carro: ");
                int i = sc.nextInt();
                System.out.println("Selecione a opção que deseja alterar do carro: \n1. Nome do carro;\n2. Ano do carro;\n3. Preço do carro;\n4. Não alterar nada.");
                int i2 = sc.nextInt();
                switch (i2) {
                    case 1:
                        System.out.println("Ok, vamos mudar o nome do carro.\n Por favor, digite o novo nome do carro: ");
                        String carModel = sc.next();
                        list.get(i-1).setCarModel(carModel);
                        break;
                    case 2:
                        System.out.println("Ok, vamos mudar o ano do carro.\n Por favor, digite o novo ano do carro: ");
                        int carYear = sc.nextInt();
                        list.get(i-1).setCarYear(carYear);
                        break;
                    case 3:
                        System.out.println("Ok, vamos mudar o preço do carro.\n Por favor, digite o preço nome do carro: ");
                        float carPrice = sc.nextFloat();
                        list.get(i-1).setCarPrice(carPrice);
                        break;
                    case 4:
                        System.out.println("Não haverá alteração em nada, você retornará ao menu inicial!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        break;
                }


            }

            if (decision == 4) {
                for (Car object: list) {
                    System.out.println(object);
                }
            }
            if (decision == 6) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }
        } while  (decision != 5);


    }
}
