package ap.efficient_farming;

import java.io.Serializable;

public class Equipment implements Serializable {
    String contact, description, img_url, rate, time, title, type;

    public Equipment(String contact, String description, String img_url, String rate, String time, String title, String type) {
        this.contact = contact;
        this.description = description;
        this.img_url = img_url;
        this.rate = rate;
        this.time = time;
        this.title = title;
        this.type = type;
    }

    public Equipment() {
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
