/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Getset;

/**
 *
 * @author Tri Tue
 */
public class Product {
    private String id;
private String name;
private String price;
private String date;
private String mota;




public Product( String pid, String pname,  String pprice,String pdate,String pmota){
this.id=pid;
this.name=pname;
this.price=pprice;
this.date=pdate;
this.mota=pmota;

}

    public Product() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the id
     */
    public  String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId( String id) {
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
     * @return the price
     */
    public  String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice( String price) {
        this.price = price;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the 
     */
    public String getMota() {
        return mota;
    }

    /**
     * @param mota the  to set
     */
    public void setMota(String mota) {
        this.mota = mota;
    }

    /**
     * @return the picture
     */
  

}
