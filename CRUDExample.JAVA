import java.sql.*;
import java.util.Scanner;

public class CRUDExample {

  private static final String url = "jdbc:postgresql://localhost:5432/mydatabase";
  private static final String user = "mydatabaseuser";
  private static final String password = "mypassword";

  private static Connection connect() throws SQLException {
    return DriverManager.getConnection(url, user, password);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try (Connection conn = connect()) {
      Statement stmt = conn.createStatement();
      String sql = "CREATE TABLE IF NOT EXISTS books (id serial PRIMARY KEY, title VARCHAR(255), author VARCHAR(255))";
      stmt.executeUpdate(sql);

      int choice = 0;
      while (choice != 5) {
        System.out.println("1. Insert a book");
        System.out.println("2. View all books");
        System.out.println("3. Update a book");
        System.out.println("4. Delete a book");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        choice = sc.nextInt();
        switch (choice) {
          case 1:
            System.out.print("Enter the book title: ");
            String title = sc.next();
            System.out.print("Enter the book author: ");
            String author = sc.next();

            sql = "INSERT INTO books (title, author) VALUES ('" + title + "', '" + author + "')";
            stmt.executeUpdate(sql);
            System.out.println("Book inserted successfully!");
            break;
          case 2:
            sql = "SELECT * FROM books";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("ID\tTitle\tAuthor");
            while (rs.next()) {
              int id = rs.getInt("id");
              title = rs.getString("title");
              author = rs.getString("author");
              System.out.println(id + "\t" + title + "\t" + author);
            }
            break;
          case 3:
            System.out.print("Enter the ID of the book you want to update: ");
            int id = sc.nextInt();
            System.out.print("Enter the new book title: ");
            title = sc.next();
            System.out.print("Enter the new book author: ");
            author = sc.next();
                sql = "UPDATE books SET title = '" + title + "', author = '" + author + "' WHERE id = " + id;
                stmt.executeUpdate(sql);
                System.out.println("Book updated successfully!");
                break;
              case 4:
                System.out.print("Enter the ID of the book you want to delete: ");
                id = sc.nextInt();

                sql = "DELETE FROM books WHERE id = " + id;
                stmt.executeUpdate(sql);
                System.out.println("Book deleted successfully!");
                break;
              case 5:
                System.out.println("Exiting the program...");
                break;
              default:
                System.out.println("Invalid choice. Please try again.");
            }
          }
        } catch (SQLException e) {
          System.out.println(e.getMessage());
        }

