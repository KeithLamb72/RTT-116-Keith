package Homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * GLAB_303_13_1 - Reading a Delimited File
 * Demonstrates how to read a delimited file and process its contents using Scanner and ArrayList.
 */
public class GLAB_303_13_1 {

    // Part 1: Reading a delimited file (cars.csv) and displaying content
    public static void readCarFile() throws FileNotFoundException {
        try {
            String location = "C:/Users/Downloads/cars.csv";  // Adjust this to your file path
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<String[]> data = new ArrayList<>();

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] splitedLine = line.split(",");
                data.add(splitedLine);
            }

            // Display the car data
            for (String[] line : data) {
                System.out.println("Car Name: " + line[0]);
                System.out.println("MPG: " + line[1]);
                System.out.println("Cylinder: " + line[2]);
                System.out.println("Displacement: " + line[3]);
                System.out.println("Horsepower: " + line[4]);
                System.out.println("Weight: " + line[5]);
                System.out.println("Acceleration: " + line[6]);
                System.out.println("Model: " + line[7]);
                System.out.println("Origin: " + line[8]);
                System.out.println("===============================");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            e.printStackTrace();
        }
    }

    // Part 2: Reading CourseData.csv using Encapsulation (POJO) and displaying content
    public static void readCourseFile() throws FileNotFoundException {
        try {
            String location = "C:/Users/Downloads/CourseData.csv";  // Adjust this to your file path
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<Course> data = new ArrayList<>();

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] splitedLine = line.split(",");

                Course cObj = new Course();
                cObj.setCode(splitedLine[0]);
                cObj.setCourseName(splitedLine[1]);
                cObj.setInstructorName(splitedLine[2]);

                data.add(cObj);
            }

            // Display the course data
            for (Course c : data) {
                System.out.println(c.getCode() + " | " + c.getCourseName() + " | " + c.getInstructorName());
                System.out.println("===============================");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            e.printStackTrace();
        }
    }

    // Main method to test both examples
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Reading cars.csv data:");
        readCarFile();  // Reads the car file and displays its contents

        System.out.println("Reading CourseData.csv data:");
        readCourseFile();  // Reads the course file and displays its contents
    }
}

// Encapsulation for Course (Model class with getter and setter)
class Course {
    private String code, courseName, instructorName;

    public Course() {}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
