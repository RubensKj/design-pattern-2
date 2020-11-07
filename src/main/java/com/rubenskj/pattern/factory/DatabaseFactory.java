package com.rubenskj.pattern.factory;

public class DatabaseFactory {

    public String getUrl() {
        String driver = this.getDriver();

        return new StringBuilder()
                .append("jdbc:")
                .append(driver)
                .append("://localhost/")
                .append("database_name").toString();
    }

    private String getDriver() {
        return System.getenv("tipoBanco");
    }
}
