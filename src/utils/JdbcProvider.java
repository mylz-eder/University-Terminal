package utils;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcProvider {

    private static JdbcProvider instance;
    private static final BasicDataSource dataSource = new BasicDataSource();


    private JdbcProvider() {}

    public static JdbcProvider getInstance() {
        if (instance == null) {
            instance = new JdbcProvider();
        }
        return instance;
    }
    public Connection getConnection() throws SQLException {
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        dataSource.setUsername("internallogin");
        dataSource.setPassword("internallogin1234");
        dataSource.setMinIdle(5);
        dataSource.setMaxTotal(20);
        return dataSource.getConnection();
    }

    public int getNextId(String sequenceName) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(String.format("SELECT %s.NEXTVAL AS NEXT FROM DUAL", sequenceName));
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        int nextId = resultSet.getInt("NEXT");
        preparedStatement.close();
        connection.close();
        return nextId;
    }
}

