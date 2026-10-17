package ExerciciosSwitch;

public class Ex01 {
        public static void main(String[] args) {

            int tipoCombustivel = 1;
            double litros = 10;
            double valorTotal = 0;
            String combustivel = "";

            switch (tipoCombustivel) {
                case 1:
                    combustivel = "Gasolina";
                    valorTotal = litros * 5.89;
                    break;

                case 2:
                    combustivel = "Etanol";
                    valorTotal = litros * 3.99;
                    break;

                case 3:
                    combustivel = "Diesel";
                    valorTotal = litros * 6.19;
                    break;

                default:
                    System.out.println("Tipo de combustível inválido");
                    return;
            }

            System.out.println("Combustível escolhido: " + combustivel);
            System.out.println("Litros abastecidos: " + litros);
            System.out.println("Valor total: R$ " + valorTotal);
        }
    }

