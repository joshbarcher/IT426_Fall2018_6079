package colorsprogram.db;

import colorsprogram.model.ColorPair;
import colorsprogram.model.IColorsData;
import javafx.scene.paint.Color;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBData implements IColorsData
{
    private Connection conn;

    private static DBData instance;

    private DBData()
    {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:colors.sqlite");
            Class.forName("org.sqlite.JDBC");

            //save the connection
            this.conn = conn;
            System.out.println("DBConnection to SQLite has been established.");
        }
        catch (Exception e)
        {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public static DBData getInstance()
    {
        if (instance == null)
        {
            instance = new DBData();
        }

        return instance;
    }

    @Override
    public void addColor(String name, Color color)
    {
        try
        {
            Statement stmt = conn.createStatement();
            stmt.execute("INSERT INTO colors VALUES (null, '" +
                    name + "', " +
                    color.getRed() + ", " +
                    color.getGreen() + ", " +
                    color.getBlue() + ", " +
                    color.getOpacity() + ")");
        }
        catch (SQLException e)
        {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override
    public void removeColor(String name)
    {
        try
        {
            conn.createStatement().
                    execute("DELETE FROM colors WHERE name='" + name + "'");
        }
        catch (SQLException e)
        {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override
    public void update(String name, Color color)
    {
        try
        {
            conn.createStatement().
                    execute("UPDATE colors SET red='" + color.getRed() +
                                "', green='" + color.getGreen() +
                                "', blue='" + color.getBlue() +
                                "', alpha='" + color.getOpacity() +
                                " WHERE name='" + name + "'");
        }
        catch (SQLException e)
        {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override
    public List<ColorPair> getColors()
    {
        try
        {
            ResultSet results = conn.createStatement().executeQuery(
                    "SELECT name, red, green, blue, alpha FROM colors");

            List<ColorPair> pairs = new ArrayList<>();
            while (results.next())
            {
                String name = results.getString("name");
                Color color = Color.color(
                        results.getDouble("red"),
                        results.getDouble("green"),
                        results.getDouble("blue"),
                        results.getDouble("alpha"));

                pairs.add(new ColorPair(name, color));
            }

            return pairs;
        }
        catch (SQLException e)
        {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
