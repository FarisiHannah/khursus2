package net.sf.apptoapi.model;

public class Rider {

    private String id;
    private String name;
    private String number;
    private String sponsor;
    private String country;
    private String foto = null;
    private String created_at;
    private String updated_at;

    public Rider(String id, String name, String number, String sponsor, String country, String foto) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.sponsor = sponsor;
        this.country = country;
        this.foto = foto;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return country;
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

    public String getFoto() {
        return foto;
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

    public void setName(String nama ) {
        this.name = nama;
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

    public void setFoto( String foto ) {
        this.foto = foto;
    }

    public void setCreated_at( String created_at ) {
        this.created_at = created_at;
    }

    public void setUpdated_at( String updated_at ) {
        this.updated_at = updated_at;
    }
}
