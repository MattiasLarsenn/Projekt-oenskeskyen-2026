package org.example.oenskeskyen2026.Repositories;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class WishlistRepository
{
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    public List<String> getWishlist()
    {
        List<String> wishlist = new ArrayList<String>();
        String query = "select * from hejsatable";

        try (Connection conn = DriverManager.getConnection(url, username, password);)
        {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())
            {
                String hej = resultSet.getString("hej");
                wishlist.add("hej");
            }


        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return wishlist;
    }
}
