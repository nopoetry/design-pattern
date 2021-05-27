package com.libuyan.designpattern.__l__agency.dynamic;

/**
 * @author libuyan
 * @date 2021/5/15 20:51
 */
public interface PersonBean {
    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);

    @Override
    String toString();
}
