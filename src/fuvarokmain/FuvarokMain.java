/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuvarokmain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class FuvarokMain {

    static List<Fuvar> fuvarok = new ArrayList<>();
  
    public static void main(String[] args) throws IOException {
        Path path = Path.of("fuvarok.csv");
       //String tartalom = Files.readString(path);
       //System.out.println(tartalom);
       List<String> sorok = Files.readAllLines(path);
       
        for (int i = 1; i < sorok.size(); i++) {
            String s[] = sorok.get(i).split(",");
            int ido = Integer.parseInt(s[1]);
            double osszeg = Integer.parseInt(s[2]);
            Fuvar f = new Fuvar(s[0], s[3], ido, osszeg);
            fuvarok.add(f);
        }
        
        feladat1();
        
        
        
    }// main

    private static int feladat1() {
        //System.out.println(fuvarok.get(0));
        int osszErtek = 0;
        for (Fuvar f : fuvarok) {
            osszErtek += f.getOsszeg();
        }
        return osszErtek;
    }
    
}
