  LakeSide Hotel Demo - Backend  

This is the backend service for LakeSide Hotel Demo, a full-stack hotel booking application. It provides RESTful APIs to manage rooms, bookings, users, and payments. Built with Spring Boot, Java 17, and MySQL.  

## 🛠️ Tech Stack  
- **Backend:** Java 17, Spring Boot, Spring Security, JPA  
- **Database:** MySQL  
- **Tools:** Maven, Postman  

### 1️⃣ Clone & Navigate  
git clone https://github.com/PillaiChandran/-MylakeSide-hotel-demo-server.git  
cd -MylakeSide-hotel-demo-server  

### 3️⃣ Build & Run  

mvn clean install  
mvn spring-boot:run  

## 🔗 API Overview  

| Method | Endpoint         | Description          |
|--------|-----------------|----------------------|
| `GET`  | `/api/rooms`    | Fetch all rooms     |
| `POST` | `/api/bookings` | Create a booking    |
| `POST` | `/api/auth/register` | Register user |
| `POST` | `/api/auth/login` | Authenticate user |

📌 **Base URL:** `http://localhost:8080/api`  
