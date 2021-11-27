package NesneYonelimliProgramlamaKitap;

public class Salcano implements Bisiklet{
    int hiz=0;
    /*öncelikle bisiklet interface'i içinde tanımlı tüm metotlar impelemnet edilir.*/

    public void hizlan(int art)
    {
        hiz += art;
    }

    public void yavasla(int azalt)
    {
        hiz -= azalt;
    }
    /*sonrasında istenirse yeni metotlar tanımlanabilir.*/

    void gosterge()
    {
        System.out.println("Hızı: " + hiz);
    }
    //ANA PROGRAM
    public static void main(String[] args) {
        Salcano b = new Salcano();
        b.hizlan(25);
        b.yavasla(5);
        b.gosterge();
    }
}
