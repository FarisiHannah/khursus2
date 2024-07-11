package net.sf.apptoapi.model;

import java.util.List;

public class Response {
    int status;
    List<Rider> data;

    public int getStatus() {
        return status;
    }

    public List<Rider> getData() {
        return data;
    }
}
