package ExerciciosSwitch;

public class Ex02 {
        public static void main(String[] args) {

            int opcaoLanche = 1;
            int quantidade = 2;
            double valorTotal = 0;
            String lanche = "";

            switch (opcaoLanche) {
                case 1:
                    lanche = "Hambúrguer";
                    valorTotal = quantidade * 25.00;
                    break;

                case 2:
                    lanche = "Pizza";
                    valorTotal = quantidade * 40.00;
                    break;

                case 3:
                    lanche = "Batata frita";
                    valorTotal = quantidade * 18.00;
                    break;

                case 4:
                    lanche = "Refrigerante";
                    valorTotal = quantidade * 8.00;
                    break;

                case 5:
                    lanche = "Suco";
                    valorTotal = quantidade * 10.00;
                    break;

                default:
                    System.out.println("Opção inválida");
                    return;
            }

            System.out.println("Item escolhido: " + lanche);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Total do pedido: R$ " + valorTotal);
        }
    }

