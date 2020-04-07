package com.tabuyos.crawler.entity;

/**
 * @Author Tabuyos
 * @Time 2020/3/27 17:08
 * @Site www.tabuyos.com
 * @Email tabuyos@outlook.com
 * @Description
 */
public class Selector {

    private String name;
    private String position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Selector{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
