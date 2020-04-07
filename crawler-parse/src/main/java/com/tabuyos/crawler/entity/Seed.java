package com.tabuyos.crawler.entity;

/**
 * @Author Tabuyos
 * @Time 2020/3/27 17:01
 * @Site www.tabuyos.com
 * @Email tabuyos@outlook.com
 * @Description
 */
public class Seed {

    private String url;
    private String name;
    private Selector selector;
    private boolean isJavaScript;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Selector getSelector() {
        return selector;
    }

    public void setSelector(Selector selector) {
        this.selector = selector;
    }

    public boolean isJavaScript() {
        return isJavaScript;
    }

    public void setJavaScript(boolean javaScript) {
        isJavaScript = javaScript;
    }

    @Override
    public String toString() {
        return "Seed{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", selector=" + selector +
                ", isJavaScript=" + isJavaScript +
                '}';
    }
}
