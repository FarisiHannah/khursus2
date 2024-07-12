package net.sf.apptoapi.model;

public class Rider {

    private String id;
    private String name;
    private String number;
    private String sponsor;
    private String country;
    private String photo = null;
    private String created_at;
    private String updated_at;

    public Rider(String id, String name, String number, String sponsor, String country, String photo) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.sponsor = sponsor;
        this.country = country;
        this.photo = photo;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getSponsor() {
        return sponsor;
    }

    public String getCountry() {
        return country;
    }

    public String getPhoto() {
        return photo;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    // Setter Methods

    public void setId( String id ) {
        this.id = id;
    }

    public void setName(String name ) {
        this.name = name;
    }

    public void setNumber(String nomor ) {
        this.number = nomor;
    }

    public void setSponsor( String sponsor ) {
        this.sponsor = sponsor;
    }

    public void setNegara( String negara ) {
        this.country = negara;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
