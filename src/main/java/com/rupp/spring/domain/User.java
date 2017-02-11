/***/
package com.rupp.spring.domain;

import java.util.Date;

/**
 * map to table user (id, message)
 * @author Nguonchhay <a href='mailto:tnguonchhay@gmail.com'> Touch Nguonchhay </a>
 * @version $id$ - $Revision$
 * @date 2017
 */
public class User {
    private Long id;
    private String name;
    private Date createdDate;
    
    public User() {
        
    }
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the createdDate
     */
    public Date getCreatedDate() {
        return createdDate;
    }
    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    
}
