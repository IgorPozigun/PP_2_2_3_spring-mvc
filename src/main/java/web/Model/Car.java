package web.Model;

import javax.annotation.processing.Generated;

public class Car {
    private Long id;
    private String brand;
    private String series;
    private int year;

    public Car(Long id, String brand, String series, int year) {
        this.id = id;
        this.brand = brand;
        this.series = series;
        this.year = year;
    }



    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
