package com.heliofrota.ejb;

import com.heliofrota.entity.Band;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * EJB class BandEJB.
 * @author helio frota http://www.heliofrota.com
 */
@Stateless
public class BandEJB {

    @PersistenceContext()
    private EntityManager em;

    public void add(Band band) {
        em.persist(band);
    }

    public void update(Band band) {
        em.merge(band);
    }

    public void delete(Band band) {
        em.remove(em.find(Band.class, band.getId()));
    }
    
    public List<Band> findAll() {
        return em.createQuery("select b from Band b", Band.class).getResultList();
    }
    
    public Band findById(int id) {
        return em.find(Band.class, id);
    }

}

