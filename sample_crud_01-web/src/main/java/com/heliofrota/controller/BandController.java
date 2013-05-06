package com.heliofrota.controller;

import com.heliofrota.ejb.BandEJB;
import com.heliofrota.entity.Band;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

/**
 * ManagedBean class BandController.
 * @author helio frota http://www.heliofrota.com
 */
@ManagedBean
@RequestScoped
public class BandController {
    
    @EJB
    private BandEJB bandEJB;
    
    private Band newBand = new Band();
    private Band selectedBand = new Band();
    private List<Band> bands;
    
    public BandController() {
    }

    @PostConstruct
    public void loadAll() {
        bands = bandEJB.findAll();
    }

    public List<Band> getBands() {
        return bands;
    }

    public Band getSelectedBand() {
        return selectedBand;
    }

    public void setSelectedBand(Band selectedBand) {
        this.selectedBand = selectedBand;
    }

    public Band getNewBand() {
        return newBand;
    }

    public void setNewBand(Band newBand) {
        this.newBand = newBand;
    }

    public void doDeleteBand() {
        bandEJB.delete(selectedBand);
        loadAll();
    }

    public void doUpdateBand() {
        bandEJB.update(selectedBand);
        loadAll();
    }

    public void doCreateBand() {
        bandEJB.add(newBand);
        loadAll();
    }

    public void onRowSelectBand(SelectEvent event) {
        selectedBand = (Band) event.getObject();
        RequestContext requestContext = RequestContext.getCurrentInstance();
        requestContext.addCallbackParam("isSelected", selectedBand.getId() != 0);
    }
    
}
