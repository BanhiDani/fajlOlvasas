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

        feladatKiiras();

        

    }// main

    private static int feladat7() {
        int db = 0;
        for (int i = 0; i < fuvarok.size(); i++) {
            boolean voltMar = false;
            for (int j = 0; j < i; j++) {
                if (fuvarok.get(i).getFm().equals(fuvarok.get(j).getFm())) {
                    voltMar = true;
                }
            }
            if (!voltMar) {
                db++;
            }
        }
        return db;
    }

    private static int feladat6() {
        int db = 0;
        for (int i = 0; i < fuvarok.size(); i++) {
            boolean voltMar = false;
            for (int j = 0; j < i; j++) {
                if (fuvarok.get(i).getRsz().equals(fuvarok.get(j).getRsz())) {
                    voltMar = true;
                }
            }
            if (!voltMar) {
                db++;
            }
        }
        return db;
    }

    private static boolean feladat5() {
        int i = 0;
        while (i < fuvarok.size() && !(fuvarok.get(i).getFm().equals("-"))) {
            i++;
        }
        return i >= fuvarok.size();
    }

    private static int feladat3() {
        int kartyaDb = 0;
        for (Fuvar fuvar : fuvarok) {
            if (fuvar.getFm().equals("kártya")) {
                kartyaDb++;
            }
        }
        return kartyaDb;
    }

    private static double feladat2() {
        double legdragabb = 0;
        for (Fuvar fuvar : fuvarok) {
            if (fuvar.getOsszeg() > legdragabb) {
                legdragabb = fuvar.getOsszeg();
            }
        }
        return legdragabb;
    }

    private static double feladat1() {
        //System.out.println(fuvarok.get(0));
        double osszErtek = 0;
        for (Fuvar f : fuvarok) {
            osszErtek += f.getOsszeg();
        }
        return osszErtek;
    }

    private static void feladatKiiras() {
        System.out.println("1. feladat");
        System.out.println(feladat1());
        System.out.println("2. feladat");
        System.out.println(feladat2());
        System.out.println("3. feladat");
        System.out.println(feladat3());
        System.out.println("5. feladat");
        System.out.println(feladat5());
        System.out.println("6. feladat");
        System.out.println(feladat6());
        System.out.println("7. feladat");
        System.out.println(feladat7());
    }

}
