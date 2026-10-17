package ExerciciosSwitch;

public class Ex03 {
        public static void main(String[] args) {

            int plano = 2;
            int meses = 12;
            double valorMensal = 0;
            double valorTotal;
            double desconto = 0;
            String nomePlano = "";

            switch (plano) {
                case 1:
                    nomePlano = "Básico";
                    valorMensal = 29.90;
                    break;

                case 2:
                    nomePlano = "Profissional";
                    valorMensal = 59.90;
                    break;

                case 3:
                    nomePlano = "Premium";
                    valorMensal = 99.90;
                    break;

                default:
                    System.out.println("Plano inválido");
                    return;
            }

            valorTotal = valorMensal * meses;

            if (meses == 12) {
                desconto = valorTotal * 0.10;
                valorTotal = valorTotal - desconto;
            }

            System.out.println("Plano escolhido: " + nomePlano);
            System.out.println("Meses contratados: " + meses);

            if (meses == 12) {
                System.out.println("Desconto aplicado: 10%");
            } else {
                System.out.println("Desconto aplicado: 0%");
            }

            System.out.println("Valor final: R$ " + valorTotal);
        }
    }

