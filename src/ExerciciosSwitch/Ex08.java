package ExerciciosSwitch;

public class Ex08 {
        public static void main(String[] args) {

            int tipoIngresso = 3;
            int quantidade = 5;
            double preco = 0;
            double valorTotal;
            double desconto = 0;
            String ingresso = "";

            switch (tipoIngresso) {
                case 1:
                    ingresso = "Inteira";
                    preco = 32.00;
                    break;

                case 2:
                    ingresso = "Meia-entrada";
                    preco = 16.00;
                    break;

                case 3:
                    ingresso = "VIP";
                    preco = 60.00;
                    break;

                default:
                    System.out.println("Tipo de ingresso inválido");
                    return;
            }

            valorTotal = preco * quantidade;

            if (quantidade > 4) {
                desconto = valorTotal * 0.05;
                valorTotal = valorTotal - desconto;
            }

            System.out.println("Tipo de ingresso: " + ingresso);
            System.out.println("Quantidade: " + quantidade);

            if (quantidade > 4) {
                System.out.println("Desconto aplicado: 5%");
            } else {
                System.out.println("Desconto aplicado: 0%");
            }

            System.out.println("Valor final: R$ " + valorTotal);
        }
    }
