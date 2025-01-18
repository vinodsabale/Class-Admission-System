# Class-Admission-System

Class Admission System project summary:-

Languages Use like JAVA,SQL.

Objective
Develop a system for managing class admissions.
Allow users to sign up, log in, and perform various operations like managing courses and fees.
1. Sign-Up Page
Features:
Input Fields:
First Name, Last Name, Username, Password, Confirm Password, Mobile Number.
Buttons:
Sign Up: Saves user data to the database.
Clear: Resets all input fields.
Login: Redirects to the login page.
Database:
Table Name: signup
Implementation:
Frontend: Java Swing for GUI design.
Backend: SQL to store and manage user data.
Password Validation: Ensures passwords match before submission.
Database Connectivity: Java JDBC is used to connect to the database.
2. Login Page
Features:
Input Fields:
Username, Password.
Buttons:
Login: Verifies user credentials in the database.
Sign Up: Redirects to the sign-up page.
Clear: Clears all input fields.
Login Process:
User enters credentials and clicks Login.
System checks the database for matching credentials.
If valid, grants access. Otherwise, shows an error.
3. Home Page
Features:
Buttons:
Admission: Navigate to a form to add student details.
View Course: Display course details (Name, Duration, Fees).
All Records: Show all student records (Name, Username, Course, Admission Date).
Logout: Logs the user out and redirects to the login page.
4. Course Management
Features:
Buttons:
Add Course: Add a new course to the database.
Update Course: Update details of an existing course.
Delete Course: Remove a course from the database.
Course List: Display a list of all available courses in a table.
Database:
Table Name: courses
Columns: Course ID, Name, Duration, Fees.
5. Fee Management & Receipt Generation
Features:
Inputs:
Mode of Payment (Cash, UPI, Cheque), UPI ID, Cheque No, Bank Name, Date.
GST Details (CGST, SGST, Total), Course Name, Student Name, Head Amount.
Total Fee in Words, Note (optional).
Buttons:
Save Fee Details.
Clear Input Fields.
Database:
Table Name: fees_details
Columns:
Receipt ID, Student Name, Course Name, Payment Details, GST Breakdown, Total Fee, etc.
Receipt:
Automatically generated with:
Receipt ID, Student Name, Course Name, Payment Details, Total Fee (in words), GST Breakdown.
Implementation:
Frontend: Java Swing for input forms and tables.
Backend: SQL for data storage and retrieval.
Frontend Workflow
Add Course: Open a form to add and save course details.
Update Course: Fetch and modify existing course details.
Delete Course: Remove a selected course from the database.
Course List: Display all courses in a table.
Fee Management: Accept and save fee details in a table.
Logout: Redirect to the login screen.
