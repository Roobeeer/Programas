import javax.swing.*;
class EncontrarArrobaMail{
    public static void main(String[]args){
        String correo = JOptionPane.showInputDialog("Introduce tu correo electrónico");
        char arroba = '@';
        int arroba2 = 0;
        boolean punto = false;

        for(int i =0;i<correo.length();i++){
            if(correo.charAt(i)==arroba){
                arroba2++;
            }
            if(correo.charAt(i)=='.'){
                punto=true;
            }
        }
        if(arroba2==1 && punto==true){
            System.out.println("El correo es correcto");
        }else{
            System.out.println("El correo no es correcto");
        }

    }

}