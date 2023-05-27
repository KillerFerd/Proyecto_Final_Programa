package GENERAL;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ClassMain {
    private static FramePrincipal  FramePrincipal;
    private static ClassDataBase   DataBaseClass;
    
    private static FrameLoginNew   FrameLoginNew;

    //Metodo: Principal
    public static void main(String[] args) {

        //Instanciar Miembros
        FrameLoginNew = new FrameLoginNew();
        FramePrincipal = new FramePrincipal();
        
        //Ventana Login
        //FramePrincipal.setVisible(true);
        FrameLoginNew.setVisible(true);
    }
    
    //Metodo: Confirmar salida
    public static void confirmExit(JFrame noExitWindow) {
        int opcion = JOptionPane.showConfirmDialog
            (null, 
            "¿Desea salir del aplicativo?", 
            "Confirmar salida", 
            JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0); 
        } else {
            noExitWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }
    
    //Metodo: Confirmar Cerrar sesión
    public static void confirmCloseSesion(JPanel noExitWindow) {
        int opcion = JOptionPane.showConfirmDialog
            (null, 
            "¿Desea cerrar sesión?", 
            "Cerrar Sesión", 
            JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            receiveRequest("LOGIN001");
        } 
    }
    
    //Metodo: Enviar Solicitud
    public static void sendRequest(String dataOutput) {
        DataBaseClass = new ClassDataBase();
        DataBaseClass.processInput(dataOutput);
    }
    
    //Metodo: Recibir Solicitud
    public static void receiveRequest(String dataInput) {
        String[] data = dataInput.split(";");
        String nivel1 = data[0].substring(0, 8);
        String nivel2 = data[0].substring(data[0].length() - 3);
        
        switch (nivel1){
            case "LOGIN001":
                loginWindows(nivel2);
                break;
            case "PRINC001":
                principalWindows(nivel2, data[1]);
                break;
            case "INFOR001":
                informationWindows(nivel2);
            default:
                break;
        }
    }
    
    //Metodo: Pantallas de Inicio de Sesion
    public static void loginWindows(String nivel2){
        switch (nivel2){
            case "001":
                FrameLoginNew = new FrameLoginNew();
                FramePrincipal.dispose();
                FrameLoginNew.setVisible(true);   
                break;
            default:
                break;
        }
    }
    
    //Metodo: Pantallas Principales
    public static void principalWindows(String nivel2, String userName){
        switch (nivel2){
            case "001":
                FramePrincipal = new FramePrincipal();
                FrameLoginNew.dispose();
                FramePrincipal.setVisible(true);   
                break;
            default:
                break;
        }
    }
    
    //Metodo: Pantallas Informativas
    public static void informationWindows(String nivel2){
        switch (nivel2){
            case "001":
                JOptionPane.showMessageDialog(null, 
                                              "Credenciales incorrectas", 
                                              "Error", 
                                              JOptionPane.ERROR_MESSAGE); 
                break;
            case "002":
                JOptionPane.showMessageDialog(null, 
                                              "Sin conexion a base de datos", 
                                              "Error", 
                                              JOptionPane.ERROR_MESSAGE);
            default:
                break;
        }
    }    
}
