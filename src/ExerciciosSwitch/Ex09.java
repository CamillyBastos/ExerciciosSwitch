package ExerciciosSwitch;

public class Ex09 {
        public static void main(String[] args) {

            int tipoServico = 3;
            int porteAnimal = 2;
            double valorTotal = 0;
            String servico = "";
            String porte = "";

            switch (tipoServico) {
                case 1:
                    servico = "Banho";

                    switch (porteAnimal) {
                        case 1:
                            porte = "Pequeno";
                            valorTotal = 40.00;
                            break;

                        case 2:
                            porte = "Médio";
                            valorTotal = 55.00;
                            break;

                        case 3:
                            porte = "Grande";
                            valorTotal = 70.00;
                            break;

                        default:
                            System.out.println("Porte do animal inválido");
                            return;
                    }
                    break;

                case 2:
                    servico = "Tosa";

                    switch (porteAnimal) {
                        case 1:
                            porte = "Pequeno";
                            valorTotal = 50.00;
                            break;

                        case 2:
                            porte = "Médio";
                            valorTotal = 65.00;
                            break;

                        case 3:
                            porte = "Grande";
                            valorTotal = 80.00;
                            break;

                        default:
                            System.out.println("Porte do animal inválido");
                            return;
                    }
                    break;

                case 3:
                    servico = "Banho e tosa";

                    switch (porteAnimal) {
                        case 1:
                            porte = "Pequeno";
                            valorTotal = 85.00;
                            break;

                        case 2:
                            porte = "Médio";
                            valorTotal = 110.00;
                            break;

                        case 3:
                            porte = "Grande";
                            valorTotal = 140.00;
                            break;

                        default:
                            System.out.println("Porte do animal inválido");
                            return;
                    }
                    break;

                default:
                    System.out.println("Tipo de serviço inválido");
                    return;
            }

            System.out.println("Serviço escolhido: " + servico);
            System.out.println("Porte do animal: " + porte);
            System.out.println("Valor total: R$ " + valorTotal);
        }
    }
