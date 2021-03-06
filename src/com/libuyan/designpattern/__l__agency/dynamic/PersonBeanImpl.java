package com.libuyan.designpattern.__l__agency.dynamic;

/**
 * @author libuyan
 * @date 2021/5/15 20:52
 */
public class PersonBeanImpl implements PersonBean {
    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingCount;

    public PersonBeanImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getGender() {
        return gender;
    }
    @Override
    public String getInterests() {
        return interests;
    }
    @Override
    public int getHotOrNotRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }
    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }

    @Override
    public String toString() {
        return "PersonBeanImpl{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", interests='" + interests + '\'' +
                ", rating=" + rating +
                ", ratingCount=" + ratingCount +
                '}';
    }
}
