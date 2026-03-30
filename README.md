# 📊 Spring Boot Monitoring (TP8)

## 🚀 Description

Application Spring Boot avec **monitoring complet** utilisant :

* Spring Actuator
* Prometheus
* Grafana
* Docker Compose

---

## ⚙️ Lancer le projet

### 1. Construire l’application

```bash
mvn clean package -DskipTests
```

---

### 2. Démarrer les services

```bash
docker-compose up -d
```

---

## 🌐 Accès

* Application → http://localhost:8080/process
* Actuator → http://localhost:8080/actuator
* Prometheus → http://localhost:9090
* Grafana → http://localhost:3000

---

## 🔐 Grafana

* Login : `admin / admin`
* Data Source : `http://prometheus:9090`
* Dashboard : Import ID **4701**

---

## 📊 Fonctionnalités

* Monitoring des requêtes HTTP
* Métriques JVM (CPU, mémoire)
* Logs applicatifs
* Métriques personnalisées
* Alertes possibles via Prometheus/Grafana

---

## 🛑 Arrêter
<img width="678" height="256" alt="Screenshot 2026-03-30 174440" src="https://github.com/user-attachments/assets/ea400403-4309-4e46-b386-5fa5e12a7d95" />

```bash
docker-compose down
```

---

<img width="678" height="256" alt="Screenshot 2026-03-30 174440" src="https://github.com/user-attachments/assets/ea400403-4309-4e46-b386-5fa5e12a7d95" />

<img width="1047" height="157" alt="Screenshot 2026-03-30 175255" src="https://github.com/user-attachments/assets/dbcec816-d920-4f66-8c3c-df162a9ac90e" />

<img width="1039" height="139" alt="Screenshot 2026-03-30 175305" src="https://github.com/user-attachments/assets/69d25c47-1cfd-494a-92b8-d2be6f9a98a7" />

<img width="1023" height="463" alt="Screenshot 2026-03-30 175315" src="https://github.com/user-attachments/assets/e211e50f-de29-442e-9237-8272010e5d1b" />

<img width="1037" height="306" alt="Screenshot 2026-03-30 175327" src="https://github.com/user-attachments/assets/7bda51a1-5174-4bab-a989-f7dde7938808" />

<img width="1045" height="364" alt="Screenshot 2026-03-30 175338" src="https://github.com/user-attachments/assets/05df10ff-709d-43e7-887c-e60ffa32eb9f" />

<img width="1005" height="550" alt="Screenshot 2026-03-30 175353" src="https://github.com/user-attachments/assets/3956631b-d197-4de2-88c1-f3c277a2636a" />

<img width="980" height="553" alt="Screenshot 2026-03-30 175408" src="https://github.com/user-attachments/assets/5d741c48-87af-4fa0-8561-35576f705256" />

<img width="1024" height="512" alt="Screenshot 2026-03-30 175418" src="https://github.com/user-attachments/assets/bc7e71f8-a500-4b77-a5c8-59147229da96" />

<img width="962" height="514" alt="Screenshot 2026-03-30 175431" src="https://github.com/user-attachments/assets/db8d3b91-0891-4694-9946-d8f8679dac34" />










