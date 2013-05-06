package com.heliofrota.entity;

/**
 * Entity class Band.
 * @author helio frota http://www.heliofrota.com
 */
public class Band {
    
    private int id;
    
    private String name;
    
    private String site;
    
    public Band() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    
}
