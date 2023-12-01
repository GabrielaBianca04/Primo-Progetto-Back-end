package entities;

public class Immagine extends ElementoMultimediale implements Luminosità {
    private final String titolo;
    private int luminosità;

    public Immagine(String titolo) {
        this.titolo = titolo;
    }

    //GETTER
    private String getTitolo() {
        return titolo;
    }

    //SETTER
    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    private String asterisco () {
        return "*".repeat(Math.max(0, luminosità));
    }

    public void show(){
        System.out.println(titolo+" " +asterisco());
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

