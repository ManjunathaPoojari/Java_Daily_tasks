package MiniProjects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.*;
class Student {
    private String studentId;
    private String name;
    private int age;
    private String course;
    private String email;
    private String contactNumber;

    public Student(String studentId, String name, int age, String course, String email, String contactNumber) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    // Getters
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public String getEmail() { return email; }
    public String getContactNumber() { return contactNumber; }
}


class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/student_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root"; // Change if needed

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("❌ DB Connection Error: " + e.getMessage());
            return null;
        }
    }
}


class StudentDAO {

    public void addStudent(Student s) {
        String sql = "INSERT INTO students VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, s.getStudentId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getAge());
            ps.setString(4, s.getCourse());
            ps.setString(5, s.getEmail());
            ps.setString(6, s.getContactNumber());
            ps.executeUpdate();
            System.out.println("✅ Student added.");
        } catch (SQLException e) {
            System.out.println("❌ Error adding student: " + e.getMessage());
        }
    }

    public void viewAllStudents() {
        String sql = "SELECT * FROM students";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n🧾 Student Records:");
            while (rs.next()) {
                System.out.printf("ID: %s | Name: %s | Age: %d | Course: %s | Email: %s | Contact: %s\n",
                        rs.getString("id"), rs.getString("name"), rs.getInt("age"),
                        rs.getString("course"), rs.getString("email"), rs.getString("contact_number"));
            }

        } catch (SQLException e) {
            System.out.println("❌ Error fetching students: " + e.getMessage());
        }
    }

    public void updateStudent(String id, String field, String newValue) {
        String sql = "UPDATE students SET " + field + " = ? WHERE student_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, newValue);
            ps.setString(2, id);
            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("✅ Record updated.");
            else
                System.out.println("❌ Student not found.");

        } catch (SQLException e) {
            System.out.println("❌ Error updating: " + e.getMessage());
        }
    }

    public void deleteStudent(String id) {
        String sql = "DELETE FROM students WHERE student_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("✅ Student deleted.");
            else
                System.out.println("❌ Student not found.");

        } catch (SQLException e) {
            System.out.println("❌ Error deleting: " + e.getMessage());
        }
    }

    public void searchStudent(String keyword) {
        String sql = "SELECT * FROM students WHERE student_id = ? OR name LIKE ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, keyword);
            ps.setString(2, "%" + keyword + "%");

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.printf("ID: %s | Name: %s | Age: %d | Course: %s | Email: %s | Contact: %s\n",
                            rs.getString("student_id"), rs.getString("name"), rs.getInt("age"),
                            rs.getString("course"), rs.getString("email"), rs.getString("contact_number"));
                }
            }

        } catch (SQLException e) {
            System.out.println("❌ Error searching: " + e.getMessage());
        }
    }
}

class SMSWithDb{
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            StudentDAO dao = new StudentDAO();
            int choice;

            do {
                System.out.println("\n====== Student Record System ======");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Search Student");
                System.out.println("0. Exit");
                System.out.print("Enter choice: ");

                while (!sc.hasNextInt()) {
                    System.out.print("Invalid input. Enter number: ");
                    sc.next();
                }

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Student ID: ");
                        String id = sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Course: ");
                        String course = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        System.out.print("Contact: ");
                        String contact = sc.nextLine();

                        Student s = new Student(id, name, age, course, email, contact);
                        dao.addStudent(s);
                        break;

                    case 2:
                        dao.viewAllStudents();
                        break;

                    case 3:
                        System.out.print("Enter Student ID to update: ");
                        id = sc.nextLine();
                        System.out.print("Field to update (name, age, course, email, contact_number): ");
                        String field = sc.nextLine();
                        System.out.print("New value: ");
                        String value = sc.nextLine();
                        dao.updateStudent(id, field, value);
                        break;

                    case 4:
                        System.out.print("Enter Student ID to delete: ");
                        id = sc.nextLine();
                        dao.deleteStudent(id);
                        break;

                    case 5:
                        System.out.print("Enter Student ID or Name to search: ");
                        String keyword = sc.nextLine();
                        dao.searchStudent(keyword);
                        break;

                    case 0:
                        System.out.println("👋 Exiting. Goodbye!");
                        break;

                    default:
                        System.out.println("❌ Invalid choice.");
                }
            } while (choice != 0);

            sc.close();
    }
}
