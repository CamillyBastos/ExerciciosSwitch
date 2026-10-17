package ExerciciosSwitch;

public class Desafio03 {
        public static void main(String[] args) {

            int operacao = 1;
            double numero01 = 20;
            double numero02 = 10;
            double resultado = 0;
            String nomeOperacao = "";

            if (numero01 < 0 || numero02 < 0) {
                System.out.println("Não são permitidos números negativos");
                return;
            }

            switch (operacao) {
                case 1:
                    nomeOperacao = "Soma";
                    resultado = numero01 + numero02;
                    break;

                case 2:
                    nomeOperacao = "Subtração";
                    resultado = numero01 - numero02;
                    break;

                case 3:
                    nomeOperacao = "Multiplicação";
                    resultado = numero01 * numero02;
                    break;

                case 4:
                    nomeOperacao = "Divisão";

                    if (numero02 == 0) {
                        System.out.println("Não é possível dividir por zero");
                        return;
                    }

                    resultado = numero01 / numero02;
                    break;

                default:
                    System.out.println("Operação inválida");
                    return;
            }

            System.out.println("Operação escolhida: " + nomeOperacao);
            System.out.println("Resultado: " + resultado);
        }
    }

