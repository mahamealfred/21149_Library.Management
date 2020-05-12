/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Management.Model;

/**
 *
 * @author mahame
 */
public class Bookcategory {
    
    private String categoryid;
    private String categoryname;

    public Bookcategory() {
    }

    public Bookcategory(String categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
    
}
