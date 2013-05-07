package com.heliofrota.ejb;

import javax.ejb.Singleton;

/**
 *
 * @author Barbarian Koder
 */
@Singleton
public class GoodByeUtilClassesEJB {
    
    public String sayHello() {
        return "Hail from the other side !";
    }
    
}
