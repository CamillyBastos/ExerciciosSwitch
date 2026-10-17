package ExerciciosSwitch;

public class Desafio02 {
        public static void main(String[] args) {

            int tipoProduto = 1;
            int quantidade = 2;

            double preco = 0;
            double valorTotal;
            double taxaEntrega = 0;
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

            if (valorTotal < 200) {
                taxaEntrega = 15.00;
                valorTotal = valorTotal + taxaEntrega;
            }

            System.out.println("Produto: " + produto);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Taxa de entrega: R$ " + taxaEntrega);
            System.out.println("Valor final: R$ " + valorTotal);
        }
    }

