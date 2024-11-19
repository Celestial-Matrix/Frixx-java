package com.heavenly_matrix;
import java.util.*;
import javax.swing.*;
import com.heavenly_matrix.mode.formal;

public class chatbot{

    private static String getSeparatorLine() {
        return "______________________________________________________________________________"; // Adjust length as needed
    }

    public static void main(String[] args)
    {
        new ChatbotWindow();
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please Enter Password");

        System.out.println();

        System.out.println(getSeparatorLine());
        String in_pass = in.nextLine();
        System.out.println(getSeparatorLine());

        String z_minati = "CursedWorld";
        String airito = "The Bane of All Evil";
        String guest = "Chat4Fun";
        
        if(in_pass.equals(z_minati) || in_pass.equals(airito)){
            System.out.println("Access Granted!!! It iS CuRsEd tHo HoHoHOHohohhoh0 00u9 j?!"); 
            if(in_pass.equals(z_minati))
                System.out.println("Welcome! My creator, Master CarryMinati.\nADMIN MODE: ACTIVATED");
            else if(in_pass.equals(airito))
                System.out.println("Welcome! My creator, Mr.Airito.\nADMIN MODE: ACTIVATED");
            else if(in_pass.equals(guest))
                System.out.println("Welcome! Guest User, Nice 2 meat u!");
            System.out.println();
        }
        else {
            JOptionPane.showMessageDialog(null, "Wrong Password. Program will be terminated!", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.print("Wrong Password. Program will be terminated!");
            System.exit(0);
        }
        System.out.println(getSeparatorLine());

        String command = "hey";
        int count = -2;
        formal f = new formal();
        f.formal_c(command, count);
        in.close();
    }
}
