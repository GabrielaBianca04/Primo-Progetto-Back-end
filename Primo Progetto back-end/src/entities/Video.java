package entities;

public class Video extends ElementoMultimediale implements Volume,Luminosità {
    public int durata;
    public int volume;
    private final String titolo;
    private int luminosità;
    private boolean inRiproduzione;

    public Video(String titolo, int durata, int volume) {
       this.titolo=titolo;
        this.volume = volume;
        this.durata = durata;
        this.luminosità=luminosità;
    }

    //GETTER
    private String getTitolo() {
        return titolo;
    }

    public int getVolume(){
        return volume;
    }
    public int getLuminosità(){
        return luminosità;
    }

    public int getDurata() {
        return durata;
    }
//SETTER
public void setVolume(int volume) {
    this.volume= volume;
}
    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    //METODI
    private void play() {
    }

    private String repeatTitle () {
        for (int i = 1; i >= durata; i++) {
            System.out.println(titolo);
        }
        return repeatTitle();
    }

    private String puntoEsclamativo () {
        return "!".repeat(Math.max(0, volume));
    }

    private String asterisco () {
        return "*".repeat(Math.max(0, luminosità));
    }

    public void mostraElemento(){
        if (inRiproduzione){System.out.println(repeatTitle()+" "+puntoEsclamativo()+" "+asterisco());}
    }

    //Override
    @Override
    public void alzaVolume(int alza) {
        this.volume++;
    }

    @Override
    public void abbassaVolume(int abbassa) {
        this.volume--;

    }

    @Override
    public void aumentaLuminosità(int aumenta) {
        luminosità++;
    }

    @Override
    public void diminuisciLuminosità(int abbassa) {
        luminosità--;
    }
}
