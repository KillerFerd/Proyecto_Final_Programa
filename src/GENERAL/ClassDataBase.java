package GENERAL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClassDataBase {
    
    public void processInput(String dataInput){
        //Instanciar variables
        String[] data  = dataInput.split(";");
        String nivel1 = data[0].substring(0, 8);
        String nivel2 = data[0].substring(data[0].length() - 3);
        
        switch (nivel1){
            case "LOGIN001":
                switch (nivel2){
                    case "001":
                        if (data.length >= 3) {
                            ClassMain.receiveRequest(validationLogin(data[1], data[2]));
                        }else{
                            ClassMain.receiveRequest("INFOR001001");
                        }
                        break;
                    default:
                        break;
                }
            default:
                break;
        }
    }
    
    public static String validationLogin(String userName, String password){
        String dataOutput = "";
        
        //Instanciar Buffer
        try (BufferedReader br = new BufferedReader(new FileReader("files/Usuarios/Users.txt"))) {
            
            //Instanciar Linea
            String linea;
            
            //Bucle hasta final de archivo
            while ((linea = br.readLine()) != null) {
                String[] data = linea.split(";");
                //Valida largo del arreglo
                if (data.length >= 2) {
                    //Valida usuario y password
                    if (data[0].equals(userName) && data[1].equals(password)) {
                        dataOutput = "PRINC001001" + ";" + data[0];
                        break;
                    }
                }
            }
                
            //Valida al no encontrar Usuario/Password
            if(dataOutput.isEmpty()) {
                dataOutput = "INFOR001001";
            }   
            
            //Cuando no existe el archivo
            }catch (IOException e) {
                dataOutput = "INFOR001002";
            }            
        return dataOutput;
    } 
}
