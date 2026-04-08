package dao;

import model.Artist;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class ArtistDAO {

    public void saveArtist(Artist artist) {
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(artist);

        tx.commit();
        session.close();
    }

    public List<Artist> getAllArtists() {
        Session session = HibernateUtil.getFactory().openSession();
        List<Artist> list = session.createQuery("from Artist", Artist.class).list();
        session.close();
        return list;
    }
}