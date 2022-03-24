package one.controles.aula3;

public class ControlesIf {

    public static void main(String[] args) {

        String jan = "Janeiro",
        fev = "Fevereiro",
        mar = "Março",
        abr = "Abril",
        mai = "Maio",
        jun = "Junho",
        jul = "Julho",
        ago = "Agosto",
        set = "Setembro",
        out = "Outubro",
        nov = "Novembro",
        dez = "Dezembro";

        int i = 4;

        if (i==1){
            System.out.println(jan);
            }else if (i==2){
                System.out.println(fev);
            }else if (i==3){
                System.out.println(mar);
            }else if (i==4){
                System.out.println(abr);
            }else if (i==5){
                System.out.println(mai);
            }else if (i==6){
                System.out.println(jun);
            }else if (i==7){
                System.out.println(jul);
            }else if (i==8){
                System.out.println(ago);
            }else if (i==9){
                System.out.println(set);
            }else if (i==10){
                System.out.println(out);
            }else if (i==11){
                System.out.println(nov);
            }else if (i==12){
                System.out.println(dez);
            }else {
                System.out.println("Mês inválido.");
        }

//        if (i == 1 || i == 7 || i == 12){
//            System.out.println("Férias");
//        }

        switch (i){
            case 1:
            case 7:
            case 12:
                System.out.println("Férias");
                break;
            default:
                System.out.println("Não definido");
        }

    }

}
