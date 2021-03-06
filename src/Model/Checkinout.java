package Model;
// Generated May 13, 2020 10:29:22 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Checkinout generated by hbm2java
 */
public class Checkinout  implements java.io.Serializable {


     private Integer id;
     private Book book;
     private Client client;
     private String status;
     private Date doneAt;

    public Checkinout() {
    }

    public Checkinout(Book book, Client client, String status, Date doneAt) {
       this.book = book;
       this.client = client;
       this.status = status;
       this.doneAt = doneAt;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Book getBook() {
        return this.book;
    }
    
    public void setBook(Book book) {
        this.book = book;
    }
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getDoneAt() {
        return this.doneAt;
    }
    
    public void setDoneAt(Date doneAt) {
        this.doneAt = doneAt;
    }




}


