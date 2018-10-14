/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currentdatetimeexample1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Anwar Hosain
 */
public class CurrentDateTimeExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         DateTimeFormatter localtime = DateTimeFormatter.ofPattern("HH:mm:ss");  
        LocalDateTime nowtime = LocalDateTime.now();
        String value = localtime.format(nowtime);
        System.out.println(value); 
        JOptionPane.showMessageDialog(null, value );  
        DateTimeFormatter localdate = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
        LocalDateTime nowdate = LocalDateTime.now();  
        String value1 = localdate.format(nowdate);
        System.out.println(value1);
        //JOptionPane.showMessageDialog(null, nowdate );  
    }
    
}
