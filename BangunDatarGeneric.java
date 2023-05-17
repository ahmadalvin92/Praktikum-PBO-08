/**
 * File: BangunDatarGeneric.java
 * Deskripsi: kelas konstruksi generic untuk BangunDatar
 * 
 */

public class BangunDatarGeneric<N extends BangunDatar> {
    private N bangunDatar;

    public void set(N tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public N get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}
