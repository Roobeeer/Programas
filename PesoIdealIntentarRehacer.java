import javax.swing.*;

class PesoIdealIntentarRehacer{
    public static void main(String[]args){
        String genero = "";

        do{
        genero = JOptionPane.showInputDialog("Introduce tu genero(H/M)");

        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);


        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura"));

        int pesoideal=0;

        if(genero.equalsIgnoreCase("F")){
            pesoideal = altura-110;
        }else if(genero.equalsIgnoreCase("M")){
            pesoideal = altura-120;
        }
            System.out.println("Tu peso ideal es  : "+ pesoideal +" kg");

        

    }
}