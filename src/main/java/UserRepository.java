import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {
    private static final jdbcConnection jdbcConnection;

    static {
        try {
            jdbcConnection = new jdbcConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public UserRepository() throws SQLException {
    }

    public int  registerUser(Users users) throws SQLException {
                Connection connection=jdbcConnection.getConnection();
                String addUser = "INSERT INTO users(first_name, last_name, username, password) VALUES (?, ?, ?, ?);";
                PreparedStatement preparedStatement = connection.prepareStatement(addUser);

        preparedStatement.setString(1,users.getFirstName());
        preparedStatement.setString(2,users.getLastName());
        preparedStatement.setString(3,users.getUserName());
        preparedStatement.setString(4,users.getPassword());
        int result=preparedStatement.executeUpdate();
        return result;
    }
    public static Users findByUsername(String username)throws SQLException{
        Connection connection=jdbcConnection.getConnection();
        String findUser= "SELECT * FROM users Where username=?;";
        PreparedStatement ps = connection.prepareStatement(findUser);
        ps.setString(1,username);
        ResultSet resultSet = ps.executeQuery();
        if( resultSet.next()){
            int id= resultSet.getInt("user_id");
            String firstaname=resultSet.getString("first_name");
            String lastName =resultSet.getString("last_name");
            String fatchusername=resultSet.getString("username");
            String password=resultSet.getString("password");
            Users user= new Users(id,firstaname,lastName,fatchusername,password);
            return user;
        }
        else
            return null;
    }
    }

