package net.media.training.designpattern.builder;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 11:31:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private final String name;
    private final int id;
    private final String city;
    private final String country;

    public Person(String name, int id, String city, String country) {
        this.name = name;
        this.id = id;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
