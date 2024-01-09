import javax.swing.*;

class EncontrarArrobaMail{
    public static void main(String[]args){
        String cadena  = JOptionPane.showInputDialog("Introduce tu correo electrónico");
        char arroba = '@';
        char punto = '.';
        int haypunto = 0;
        int hayarroba = 0;
        boolean cadenaverdadera = false;

        for(int i =0;i<cadena.length();i++){
            if(cadena.charAt(i)==arroba){
                hayarroba++;
            }
            if(cadena.charAt(i)==punto){
                haypunto++;
            }
            }

            if(cadena.charAt(cadena.length()-1)==punto){
                cadenaverdadera = true;
            }
            int dondearroba = cadena.indexOf("@");
            int dondepunto = cadena.indexOf(".");
            if(cadenaverdadera==false && hayarroba==1 && (haypunto==1 && dondepunto>dondearroba)){
                System.out.println("El correo tiene la forma correcta");
            }else{
                System.out.println("El correo no tiene la forma correcta");

            }
                  

        
        }
    }