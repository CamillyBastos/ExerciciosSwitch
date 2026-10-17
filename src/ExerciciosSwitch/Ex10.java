package ExerciciosSwitch;

public class Ex10 {
        public static void main(String[] args) {

            int produto = 1;
            int quantidade = 2;
            boolean temAdicional = true;

            double preco = 0;
            double valorAdicional = 0;
            double valorTotal;
            String nomeProduto = "";

            switch (produto) {
                case 1:
                    nomeProduto = "Açaí";
                    preco = 18.00;
                    break;

                case 2:
                    nomeProduto = "Sorvete";
                    preco = 12.00;
                    break;

                case 3:
                    nomeProduto = "Milkshake";
                    preco = 20.00;
                    break;

                default:
                    System.out.println("Produto inválido");
                    return;
            }

            valorTotal = preco * quantidade;

            if (temAdicional) {
                valorAdicional = 5.00 * quantidade;
                valorTotal = valorTotal + valorAdicional;
            }

            System.out.println("Produto escolhido: " + nomeProduto);
            System.out.println("Quantidade: " + quantidade);

            if (temAdicional) {
                System.out.println("Adicional: Sim");
            } else {
                System.out.println("Adicional: Não");
            }

            System.out.println("Valor total: R$ " + valorTotal);
        }
    }
