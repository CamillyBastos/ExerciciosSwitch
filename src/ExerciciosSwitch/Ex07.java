package ExerciciosSwitch;

public class Ex07 {
        public static void main(String[] args) {

            int regiao = 3;
            double valorProduto = 250;
            double frete = 0;
            double valorFinal;
            String nomeRegiao = "";

            switch (regiao) {
                case 1:
                    nomeRegiao = "Sudeste";
                    frete = 20.00;
                    break;

                case 2:
                    nomeRegiao = "Sul";
                    frete = 25.00;
                    break;

                case 3:
                    nomeRegiao = "Nordeste";
                    frete = 35.00;
                    break;

                case 4:
                    nomeRegiao = "Norte";
                    frete = 45.00;
                    break;

                case 5:
                    nomeRegiao = "Centro-Oeste";
                    frete = 30.00;
                    break;

                default:
                    System.out.println("Região inválida");
                    return;
            }

            if (valorProduto >= 300) {
                frete = 0;
            }

            valorFinal = valorProduto + frete;

            System.out.println("Região: " + nomeRegiao);
            System.out.println("Valor do produto: R$ " + valorProduto);
            System.out.println("Frete: R$ " + frete);
            System.out.println("Valor final: R$ " + valorFinal);
        }
    }
