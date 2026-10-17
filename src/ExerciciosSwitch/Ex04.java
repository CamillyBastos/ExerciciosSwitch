package ExerciciosSwitch;

public class Ex04 {
        public static void main(String[] args) {

            int tipoVeiculo = 2;
            int horas = 6;
            double valorHora = 0;
            double taxaAdicional = 0;
            double valorTotal;
            String veiculo = "";

            switch (tipoVeiculo) {
                case 1:
                    veiculo = "Moto";
                    valorHora = 5.00;
                    break;

                case 2:
                    veiculo = "Carro";
                    valorHora = 10.00;
                    break;

                case 3:
                    veiculo = "Caminhonete";
                    valorHora = 15.00;
                    break;

                default:
                    System.out.println("Tipo de veículo inválido");
                    return;
            }

            valorTotal = horas * valorHora;

            if (horas > 5) {
                taxaAdicional = 10.00;
                valorTotal = valorTotal + taxaAdicional;
            }

            System.out.println("Veículo: " + veiculo);
            System.out.println("Horas estacionado: " + horas);
            System.out.println("Taxa adicional: R$ " + taxaAdicional);
            System.out.println("Valor total: R$ " + valorTotal);
        }
    }

