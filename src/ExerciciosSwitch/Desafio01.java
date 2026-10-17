package ExerciciosSwitch;

public class Desafio01 {
        public static void main(String[] args) {

            int tipoCombustivel = 1;
            double litros = 10;
            boolean clienteVIP = true;

            double preco = 0;
            double valorTotal;
            String combustivel = "";

            switch (tipoCombustivel) {
                case 1:
                    combustivel = "Gasolina";
                    preco = 5.89;
                    break;

                case 2:
                    combustivel = "Etanol";
                    preco = 3.99;
                    break;

                case 3:
                    combustivel = "Diesel";
                    preco = 6.19;
                    break;

                default:
                    System.out.println("Tipo de combustível inválido");
                    return;
            }

            valorTotal = litros * preco;

            if (clienteVIP) {
                valorTotal = valorTotal * 0.95;
            }

            System.out.println("Combustível: " + combustivel);
            System.out.println("Litros abastecidos: " + litros);
            System.out.println("Cliente VIP: " + clienteVIP);
            System.out.println("Valor total: R$ " + valorTotal);
        }
    }

