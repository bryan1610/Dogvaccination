public class authwithsql; 

String databaseUsername = "username";
    String databasePassword = "password";

    // Check Username and Password
    System.out.print("Enter Username: ");
    String name = sc.next();
    System.out.print("Enter Password: ");
    String password = sc.next();

            // Create SQL Query
    Statement stmt = connection.createStatement();
    String SQL = "SELECT * FROM users WHERE users_name='" + name + "' && users_password='" + password+ "'";

    ResultSet rs = stmt.executeQuery(SQL);

            // Check Username and Password
    while (rs.next()) {
        databaseUsername = rs.getString("users_name");
        databasePassword = rs.getString("users_password");
    }

    if (name.equals(databaseUsername) && password.equals(databasePassword)) {
        System.out.println("Successful Login!\n----");
    } else {
        System.out.println("Incorrect Password\n----");
    }
