/**
 * File         : TestSenjata.java		12/05/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 */

package latihanTutorial;

public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        System.out.println("AK47 Menembak 3x :");
        ak47.menembak(3);
        System.out.println("M16 Menembak 1x: ");
        m16.menembak(1);

        System.out.println("AK47 menusuk: ");ak47.menusuk();
        ak47.pasangBayonet();
        System.out.println("AK47 menusuk: "); ak47.menusuk();
    }

}
