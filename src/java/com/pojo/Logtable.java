package com.pojo;
// Generated Jan 21, 2018 3:55:14 PM by Hibernate Tools 4.3.1

import javax.faces.bean.ManagedBean;




/**
 * Logtable generated by hbm2java
 */

@ManagedBean
public class Logtable  implements java.io.Serializable {


     private int id;
     private String name;
     private String email;
     private String password;
     private Integer mobNo;

    public Logtable() {
    }

	
    public Logtable(int id) {
        this.id = id;
    }
    public Logtable(int id, String name, String email, String password, Integer mobNo) {
       this.id = id;
       this.name = name;
       this.email = email;
       this.password = password;
       this.mobNo = mobNo;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getMobNo() {
        return this.mobNo;
    }
    
    public void setMobNo(Integer mobNo) {
        this.mobNo = mobNo;
    }
public String doInsert(){
    String ret="fail";
    LogtableDAO lo=new LogtableDAO();
    if (lo.doAdd(this)) {
        ret="success";
    }else{
        
        ret="fail";
    }
    return ret;
}
public String doShow1(){
    String ret="fail";
    LogtableDAO lo=new LogtableDAO();
    if (lo.aUser(id,password)!=null) {
        ret="success";
    }else{
        
        ret="fail";
    }
    return ret;
}



}


