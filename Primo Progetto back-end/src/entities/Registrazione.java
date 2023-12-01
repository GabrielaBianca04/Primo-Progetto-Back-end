package entities;

public class Registrazione extends ElementoMultimediale implements Volume,Luminosità{

//ATTRIBUTI

    private int volume;
    private String titolo;
    private int durata;
    private int luminosità;
    public boolean inRiproduzione;

    //COSTRUTTORE
    public Registrazione(String titolo, int durata, int volume) {
      this.titolo=titolo;
        this.volume = volume;
        this.durata = durata;
    }

    //GETTER
    public String getTitolo(){
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



    //METODI

    private void play() {
    }


    private String repeatTitle () {
        for (int i = 0; i<this.durata; i++) {
            String title = this.titolo;
            System.out.println(title);
        }
        return repeatTitle();
    }

    private String puntoEsclamativo () {
        return "!".repeat(Math.max(0, this.volume));
    }

    public void mostraElemento(){
        System.out.println(repeatTitle()+" "+puntoEsclamativo());
    }





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
        this.luminosità++;
    }

    @Override
    public void diminuisciLuminosità(int abbassa) {
this.luminosità--;
    }
}
