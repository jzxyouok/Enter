package org.fireply.enter.model;
// Generated 2016-5-23 16:15:06 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category implements java.io.Serializable {

    private String id;
    private String name;
    private Set<Production> productions = new HashSet<Production>(0);

    public Category() {
    }

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category(String id, String name, Set<Production> productions) {
        this.id = id;
        this.name = name;
        this.productions = productions;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Production> getProductions() {
        return this.productions;
    }

    public void setProductions(Set<Production> productions) {
        this.productions = productions;
    }

}
