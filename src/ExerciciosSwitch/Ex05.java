package ExerciciosSwitch;

public class Ex05 {
        public static void main(String[] args) {

            int tipoProduto = 1;
            int quantidade = 3;
            double preco = 0;
            double valorTotal;
            double desconto = 0;
            String produto = "";

            switch (tipoProduto) {
                case 1:
                    produto = "Camiseta";
                    preco = 49.90;
                    break;

                case 2:
                    produto = "Calça";
                    preco = 119.90;
                    break;

                case 3:
                    produto = "Jaqueta";
                    preco = 199.90;
                    break;

                case 4:
                    produto = "Tênis";
                    preco = 249.90;
                    break;

                default:
                    System.out.println("Produto inválido");
                    return;
            }

            valorTotal = preco * quantidade;

            if (quantidade >= 3) {
                desconto = valorTotal * 0.15;
                valorTotal = valorTotal - desconto;
            }

            System.out.println("Produto escolhido: " + produto);
            System.out.println("Quantidade: " + quantidade);

            if (quantidade >= 3) {
                System.out.println("Desconto aplicado: 15%");
            } else {
                System.out.println("Desconto aplicado: 0%");
            }

            System.out.println("Valor final: R$ " + valorTotal);
        }
    }
