/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuvarokmain;

/**
 *
 * @author BánhidiDániel(SZF_N_
 */
public class Fuvar {
    private String rsz, fm;
    private int ido, osszeg;

    public Fuvar(String rsz, String fm, int ido, int osszeg) {
        this.rsz = rsz;
        this.fm = fm;
        this.ido = ido;
        this.osszeg = osszeg;
    }

    public String getRsz() {
        return rsz;
    }

    public String getFm() {
        return fm;
    }

    public int getIdo() {
        return ido;
    }

    public int getOsszeg() {
        return osszeg;
    }

    @Override
    public String toString() {
        return "Fuvar{" + "rsz=" + rsz + ", fm=" + fm + ", ido=" + ido + ", osszeg=" + osszeg + '}';
    }
    
    
}
