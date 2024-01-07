import javax.swing.*;
class EncontrarArrobaMail{
    public static void main(String[]args){
        String correo = JOptionPane.showInputDialog("Introduce tu correo electrónico");
        char arroba = '@';
        boolean arroba2 = false;

        for(int i =0;i<correo.length();i++){
            if(correo.charAt(i)==arroba){
                arroba2 = true;
            }
        }
        if(arroba2){
            System.out.println("El correo es correcto");
        }else{
            System.out.println("El correo no es correcto");
        }

    }

}