package dao;

import model.Artwork;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class ArtworkDAO {

    public void saveArtwork(Artwork art) {
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(art);

        tx.commit();
        session.close();
    }

    public List<Artwork> getAllArtworks() {
        Session session = HibernateUtil.getFactory().openSession();
        List<Artwork> list = session.createQuery("from Artwork", Artwork.class).list();
        session.close();
        return list;
    }
}