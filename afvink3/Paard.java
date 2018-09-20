package afvink3;

/**
 * Paard class
 *
 * @author Martijn van der Bruggen
 * @version alpha release
 * (c) Hogeschool van Arnhem en Nijmegen
 *
 * Dit bestand niet aanpassen. Aanroepen vanuit Race
 *
 *
 */

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.Buffer;
import java.util.Random;
import java.awt.*;

public class Paard {

    private int afstand, paardNummer;
    private static int aantal = 0;
    private String naam;
    private Color kleur;
    private String iconName;
    private BufferedImage image;

    Random random = new Random();

    /* Constructor voor Paard */
    Paard(String name, Color kl, String iconName) {
        this.naam = name;
        this.kleur = kl;
        this.afstand = 0;
        paardNummer = ++aantal;
        setIconName(iconName);
    }



    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
    public String getIconName(){
        return this.iconName;

    }
    public String getNaam() {
        return this.naam;
    }

    public int getAfstand() {
        return this.afstand;
    }

    public int getPaardNummer() {
        return paardNummer;
    }

    public Color getKleur() {
        return kleur;
    }

    public void run() {
        afstand = afstand + random.nextInt(11);
        System.out.println(naam + " is op positie " + afstand);
    }

    public BufferedImage createImage(){
        try {
            this.image = ImageIO.read(new File(this.iconName));
            return image;
        }catch (Exception e){
            e.printStackTrace();
            return image;
        }
    }
}
