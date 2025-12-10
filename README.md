# Student Grade System – Java (Grade 11 Project)

This project is a simple Java application that allows a user to input their **name**, **student ID**, and **grade** using **JOptionPane**, and then displays whether the student has **passed** or **failed** based on the grade entered.

---

## 📌 Project Description

The program consists of two classes:

### 1. `StudentGradeSystem` (Model Class)  
This class stores the student’s details and contains logic to determine if the student passed or failed.

- Stores:
  - Student name  
  - Student ID  
  - Student grade  
- Provides getter and setter methods  
- Contains `determinePass()` method that:
  - Returns **Pass** if grade is between 50 and 100  
  - Returns **Fail** if grade is between 0 and 49  
  - Returns an error message if the grade is invalid  

---

### 2. `StudentApp` (Main Application Class)  
This class interacts with the user using `JOptionPane`.

- Prompts the user to enter:
  - Name  
  - Student ID  
  - Grade  
- Creates a `StudentGradeSystem` object  
- Displays the result using `JOptionPane.showMessageDialog()`  

---

## 🧮 Pass/Fail Logic

| Grade Range | Result  |
|-------------|----------|
| 50 – 100    | Pass     |
| 0 – 49      | Fail     |
| < 0 or > 100| Invalid input |

---

## 🧰 Technologies Used
- Java  
- JOptionPane (Swing)  
- Object-Oriented Programming

---

## ▶️ How to Run the Program

1. Open in **Eclipse**, **NetBeans**, or any Java IDE.  
2. Make sure both files are inside the package:  
   `Grade_11_Semira_Package`  
3. Run the `StudentApp` class.  
4. Enter your details when prompted.  
5. The program will show your result.

---

## 📄 Example Output
Student Name: Semira
Student ID: 12345
Grade: 78.5
Results: Pass

---

## ✨ Author
- **Semira** – Grade 11 Student  
- Project demonstrates Java OOP + GUI basics
