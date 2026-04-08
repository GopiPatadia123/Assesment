package dao;

import model.License;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.Date;
import java.util.List;

public class LicenseDAO {

    public void createLicense(License lic) {
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(lic);

        tx.commit();
        session.close();

        System.out.println("License Created & Certificate Generated ✅");
    }

    public void checkExpiry() {
        Session session = HibernateUtil.getFactory().openSession();

        List<License> list = session.createQuery("from License", License.class).list();

        for(License l : list){
            if(l.getExpiryDate().before(new Date())){
                System.out.println("⚠ License Expired: " + l.getId());
            }
        }

        session.close();
    }
}