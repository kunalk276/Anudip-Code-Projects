package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentCRUDClassesOperation 
{


    public static void main(String[] args) throws SQLException, ClassNotFoundException 
    {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "ADI#27#nal");
        Statement stmt = connection.createStatement();
        Scanner sc = new Scanner(System.in);
        int operation;

        do {
            System.out.println("Available Operations Are: ");
            System.out.println("1. Create");
            System.out.println("2. Retrieve");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Please Enter a Operation number you want to Perform: ");
            operation = sc.nextInt();
            sc.nextLine(); 

            switch (operation) {
                case 1:
                    CreateOperation.create(connection, sc);
                    break;
                case 2:
                    RetrieveOperation.retrieve(connection);
                    break;
                case 3:
                    UpdateOperation.update(connection, sc);
                    break;
                case 4:
                    DeleteOperation.delete(connection, sc);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (operation != 5);

        sc.close();
        stmt.close();
        connection.close();
    }
}

class CreateOperation {
    public static void create(Connection connection, Scanner sc) throws SQLException {
        System.out.print("Enter student first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter student last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter student grade: ");
        String grade = sc.nextLine();

        String createSql = "INSERT INTO Students (first_name, last_name, age, grade) VALUES (?, ?, ?, ?)";

        try (PreparedStatement createStatement = connection.prepareStatement(createSql)) 
        {
            createStatement.setString(1, firstName);
            createStatement.setString(2, lastName);
            createStatement.setInt(3, age);
            createStatement.setString(4, grade);
            int rowsAffected = createStatement.executeUpdate();
            
            if (rowsAffected > 0) 
            {
                System.out.println("Student added successfully.");
            } 
            else 
            {
                System.out.println("Failed to add student.");
            }
        }
    }
}

class RetrieveOperation 
{
    public static void retrieve(Connection connection) throws SQLException 
    {
        String readSql = "SELECT * FROM Students";
        try (Statement readStatement = connection.createStatement()) 
        {
            ResultSet resultSet = readStatement.executeQuery(readSql);
            
            while (resultSet.next()) {
                int studentId = resultSet.getInt("id");
                String studentFirstName = resultSet.getString("first_name");
                String studentLastName = resultSet.getString("last_name");
                int studentAge = resultSet.getInt("age");
                String studentGrade = resultSet.getString("grade");
                System.out.println("ID: " + studentId + ", Name: " + studentFirstName + " " + studentLastName + ", Age: " + studentAge + ", Grade: " + studentGrade);
            }
        }
    }
}

class UpdateOperation 
{
    public static void update(Connection connection, Scanner sc) throws SQLException 
    {
        System.out.print("Enter student ID to update: ");
        int studentIdToUpdate = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Choose what to update:");
        System.out.println("1. Update name");
        System.out.println("2. Update age");
        System.out.println("3. Update grade");
        System.out.print("Enter your choice: ");
        int updateChoice = sc.nextInt();
        sc.nextLine(); 

        String updateSql;
        PreparedStatement updateStatement;

        switch (updateChoice) 
        {
            case 1:
                System.out.print("Enter new first name: ");
                String newFirstName = sc.nextLine();
                System.out.print("Enter new last name: ");
                String newLastName = sc.nextLine();
                updateSql = "UPDATE Students SET first_name = ?, last_name = ? WHERE id = ?";
                updateStatement = connection.prepareStatement(updateSql);
                updateStatement.setString(1, newFirstName);
                updateStatement.setString(2, newLastName);
                break;
                
            case 2:
                System.out.print("Enter new age: ");
                int newAge = sc.nextInt();
                updateSql = "UPDATE Students SET age = ? WHERE id = ?";
                updateStatement = connection.prepareStatement(updateSql);
                updateStatement.setInt(1, newAge);
                break;
                
            case 3:
                sc.nextLine(); 
                System.out.print("Enter new grade: ");
                String newGrade = sc.nextLine();
                updateSql = "UPDATE Students SET grade = ? WHERE id = ?";
                updateStatement = connection.prepareStatement(updateSql);
                updateStatement.setString(1, newGrade);
                break;
                
            default:
                System.out.println("Invalid choice for update. Please try again.");
                return;
        }

        updateStatement.setInt(2, studentIdToUpdate);
        int rowsAffected = updateStatement.executeUpdate();
        if (rowsAffected > 0) 
        {
            System.out.println("Student updated successfully.");
        } 
        else 
        {
            System.out.println("Student not found or update failed.");
        }
    }
}

class DeleteOperation 
{
    public static void delete(Connection connection, Scanner sc) throws SQLException 
    {
        System.out.print("Enter student ID to delete: ");
        int studentIdToDelete = sc.nextInt();
        String deleteSql = "DELETE FROM Students WHERE id = ?";
        
        try (PreparedStatement deleteStatement = connection.prepareStatement(deleteSql)) 
        {
            deleteStatement.setInt(1, studentIdToDelete);
            int rowsAffected1 = deleteStatement.executeUpdate();
            if (rowsAffected1 > 0) 
            {
                System.out.println("Student deleted successfully.");
            } 
            else 
            {
                System.out.println("Student not found or delete failed.");
            }
        }
    }
}
