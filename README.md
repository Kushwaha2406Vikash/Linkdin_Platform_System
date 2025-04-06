# LinkedIn Platform Simulation (Java Console App)

Welcome to the **LinkedIn Platform Simulation**, a Java console-based application that models key features of a professional networking platform like LinkedIn. This project demonstrates core object-oriented programming concepts in Java through a functional simulation of users, companies, job postings, and more.

---

## 📌 Overview

This simulation showcases the following functionalities:

- User login and profile setup  
- Skill management and endorsement  
- Messaging between users  
- Connection requests (send/accept)  
- Job posting and job applications  
- Peer recommendations  
- Notification system  

---

## 🚀 Features

✅ Create Users and Companies  
✅ User Login Simulation  
✅ Profile Setup with Skills and Recommendations  
✅ Skill Endorsement from Other Users  
✅ Sending & Accepting Connection Requests  
✅ Direct Messaging (Send/Delete)  
✅ Job Posting by Recruiters  
✅ Job Application with Resume Link  
✅ Notifications on Important Events  

---

## 📁 Project Structure

linkedin-platform-java/
├── README.md
├── src/
│   └── com/
│       └── linkdin_platform/
│           ├── Main.java
│           ├── User.java
│           ├── Profile.java
│           ├── Skill.java
│           ├── Company.java
│           ├── Job.java
│           ├── Message.java
│           ├── Notification.java
│           └── Recommendation.java
├── bin/ (optional, for compiled .class files)
├── .gitignore (optional)
└── build/ (optional, for build outputs)


---

## 🧪 How to Run

1. Clone or copy the source code into your Java IDE (e.g., IntelliJ, Eclipse) or a local directory.  
2. Ensure you have Java installed (Java 8 or above).  
3. Compile and run the `Main.java` file.

### 💻 Compile & Run (via terminal)

```bash
javac com/linkdin_platform/Main.java
java com.linkdin_platform.Main

------------------- WELCOME TO LINKDIN PLATFORM____________________________-

[INFO] Alice logged in.
[INFO] Bob logged in.

[SKILL] Bob endorsed React on Alice's profile.
[SKILL] Alice endorsed Java on Bob's profile.

[RECOMMENDATION] Added: Alice is a dedicated backend engineer.

[CONNECTION] Alice sent a request to Bob.
[CONNECTION] Bob accepted Alice's request.

[MESSAGE] Alice sent: Hi Bob, nice to connect!
[MESSAGE] Message deleted.

[JOB] Google posted: Java Developer

[APPLICATION] Bob applied to Java Developer with resume link: https://example.com/resume-bob.pdf

Notification: You have a new job interview!

✅ Simulation Complete.

📌 Author
This project was created as part of a Java Object-Oriented Programming (OOP) learning initiative. It demonstrates clean architecture, encapsulation, and real-world modeling of professional networking platforms.

📝 Notes
This is a console-based simulation; there is no GUI or database persistence.

Suitable for learning Java OOP, system design basics, and entity interaction modeling.

📦 Future Improvements
Add persistent storage (e.g., file I/O or database)

Develop a GUI using JavaFX or Swing

Add unit testing (e.g., JUnit)

Implement authentication and session handling

Extend relationships between entities for more realism

📃 License
This project is open for educational and personal use. No commercial rights granted.
