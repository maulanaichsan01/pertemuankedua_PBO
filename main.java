package pertemuankedua;

public class main {
    public static void main(String[] args) {
        Hewan h = new Hewan();
        h.setTelinga("Panjang");
        System.out.println(h.getTelinga());

        Manusia m = new Manusia();
        m.setRambut("Hitam");
        System.out.println(m.getRambut());

        Pesawat_Telepon pt = new Pesawat_Telepon();
        pt.setGagang_telepon(true);
        System.out.println(pt.getGagang_telepon());
    }
}