package com.tabuyos.crawler.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Author Tabuyos
 * @Time 2020/3/27 11:14
 * @Site www.tabuyos.com
 * @Email tabuyos@outlook.com
 * @Description
 */
public class Test {

    public static void main(String[] args) throws Exception {
        System.out.println("====================Tabuyos-Starting====================");
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/", "tabuyos", "tabuyos")) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet rs = stmt.executeQuery("SELECT 'Hello World!'")) {
                    rs.first();
                    System.out.println(rs.getString(1));
                }
            }
        }
        System.out.println("====================Tabuyos-Stopping====================");
    }
}
