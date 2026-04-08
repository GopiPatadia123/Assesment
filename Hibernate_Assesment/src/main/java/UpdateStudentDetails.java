import dao.*;
import model.*;

import java.util.Date;

public class MainApp {

    public static void main(String[] args) {

        ArtistDAO adao = new ArtistDAO();
        ArtworkDAO ardao = new ArtworkDAO();
        LicenseDAO ldao = new LicenseDAO();

        // Create Artist
        Artist a = new Artist();
        a.setName("Gopi");
        a.setBio("Digital Artist");

        adao.saveArtist(a);

        // Create Artwork
        Artwork art = new Artwork();
        art.setTitle("Sunset");
        art.setTags("nature, sunset");
        art.setResolution("HD");
        art.setArtist(a);

        ardao.saveArtwork(art);

        // Create License
        License lic = new License();
        lic.setType("Commercial");
        lic.setStatus("Approved");
        lic.setExpiryDate(new Date());

        lic.setArtwork(art);

        ldao.createLicense(lic);

        // Check Expiry Alert
        ldao.checkExpiry();
    }
}