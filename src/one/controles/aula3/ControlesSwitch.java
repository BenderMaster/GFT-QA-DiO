package one.controles.aula3;

public class ControlesSwitch {

    public static void main(String[] args) {

        String dia = "seg";

        switch (dia){
            case "dom":
                System.out.println("Domingo: 1");
                break;
            case "seg":
                System.out.println("Segunda: 2");
                break;
            case "ter":
                System.out.println("Terça: 3");
                break;
            case "qua":
                System.out.println("Quarta: 4");
                break;
            case "qui":
                System.out.println("Quinta: 5");
                break;
            case "sex":
                System.out.println("Sexta: 6");
                break;
            case "sab":
                System.out.println("Sábado: 7");
                break;
        }

        int i = 6;

        switch (i){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Numéro inválido!");
                break;

        }

    }

}
