# 🎓 Student Registration System (Full Stack)

A complete **Full Stack Web Application** for registering students using:

* ⚛️ React (Vite) — Frontend
* ☕ Spring Boot — Backend
* 🍃 MongoDB Atlas — Database

---

## 🚀 Features

* Student Registration Form
* REST API integration
* Data stored in MongoDB Atlas
* Clean UI with React
* Full backend architecture (Controller → Service → Repository)
* Ready for AWS deployment

---

## 🏗️ Project Structure

```
StudentRegistrationSystem/
│
├── client/                # React Frontend (Vite)
│   ├── src/
│   ├── public/
│   └── package.json
│
├── server/                # Spring Boot Backend
│   ├── src/main/java/
│   ├── src/main/resources/
│   └── pom.xml
│
└── README.md
```

---

## 🛠️ Tech Stack

### Frontend

* React (Vite)
* JavaScript
* CSS

### Backend

* Spring Boot
* Java
* Spring Web
* Spring Data MongoDB

### Database

* MongoDB Atlas

---

## 📦 Installation & Setup

### 1️⃣ Clone Repository

```
git clone https://github.com/MukulParasar/student-registration-system.git
cd student-registration-system
```

---

## ⚛️ Frontend Setup (React)

```
cd client
npm install
npm run dev
```

👉 Runs on: `http://localhost:5173`

---

## ☕ Backend Setup (Spring Boot)

```
cd server
mvn spring-boot:run
```

👉 Runs on: `http://localhost:5000`

---

## 🔗 API Endpoint

```
POST /api/students
```

### Sample JSON:

```
{
  "rollNo": "101",
  "name": "Mukul",
  "fatherName": "ABC",
  "emailId": "mukul@gmail.com",
  "department": "CSE",
  "course": "B.Tech",
  "mobileNo": "9999999999"
}
```

---

## 🌐 MongoDB Configuration

Create `application.properties` inside:

```
server/src/main/resources/
```

Add:

```
spring.data.mongodb.uri=${MONGODB_URI}
```

---

## 🔐 Environment Variables

Create `.env` file (DO NOT push to GitHub):

```
MONGODB_URI=mongodb+srv://<username>:<password>@cluster0.mongodb.net/registrationAPI
```

---

## ⚠️ Important Notes

* Do NOT commit `application.properties` with credentials
* Do NOT push `.env` file
* Use `.gitignore` properly

---

## 📁 .gitignore (Important)

Make sure these are ignored:

```
node_modules/
target/
.env
application.properties
```

---

## 🧪 Testing

You can test backend using:

* Postman
* React Frontend

---

## ☁️ Deployment (AWS Ready)

Backend:

* Generate JAR:

  ```
  mvn clean package
  ```
* Deploy on AWS Elastic Beanstalk / EC2

Frontend:

* Deploy on Vercel / Netlify / AWS

---

## 👨‍💻 Author

**Mukul**<br>
B.Tech CSE Student | Java Backend Developer

---

## 📜 License

This project is licensed under the MIT License.

---

## ⭐ Acknowledgement

This project was built for learning full stack development using modern technologies.

---

## 🔥 Future Improvements

* Add Login/Authentication
* Add Student List (GET API)
* Form Validation
* UI Improvements
* Admin Dashboard

---
