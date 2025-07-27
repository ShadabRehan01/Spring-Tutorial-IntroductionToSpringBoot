# 🌱 Spring Boot Tutorials Project

### 👋 Welcome to the official project repository for **"Tightly vs Loosely Coupled Systems with Bean Lifecycle Management"** using Spring Boot!

This project belongs to the **Spring Boot Tutorials** series and is designed to help beginners and intermediate developers understand:

- Dependency Injection
- Loose vs Tight Coupling
- Conditional Beans
- Bean Lifecycle Annotations (`@PostConstruct`, `@PreDestroy`)
- Manual Bean creation using `@Bean` and `@Configuration`

---

## 👤 Author: **Shadab Rehan**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Shadab%20Rehan-blue?logo=linkedin)](https://www.linkedin.com/in/shadab-rehan)

---

## 🧩 Project Overview

This project demonstrates:
1. The difference between **Tightly Coupled** and **Loosely Coupled** systems using Spring Boot's **Dependency Injection**.
2. Use of **`@ConditionalOnProperty`** to dynamically inject beans based on application environment (`development` or `production`).
3. Use of **Bean Lifecycle Annotations** (`@PostConstruct` and `@PreDestroy`) with `@Bean` configuration.
4. Demonstration of `@Scope` (singleton/prototype) for bean instances.

---

## 📦 Packages and Classes

### `com.Loosly.TightlyCoupled`
- **`DB`**: Interface for `getData()` method (common contract).
- **`DevDb` & `ProdDb`**: Implements `DB` interface. Loaded conditionally using `@ConditionalOnProperty` based on the value of `deploy.env`.
- **`DBService`**: Business service class that depends on the `DB` interface (loose coupling).
- **`IntroTightly_LooselyCoupled`**: Main application runner that prints data source info.

### `com.shadab.week1Introduction.IntroductionToSpringBoot`
- **`Apple`**: A simple bean with `@PostConstruct` and `@PreDestroy` lifecycle methods.
- **`ConfigApple`**: Spring Configuration class that provides the `Apple` bean using `@Bean`.
- **`IntroductionToSpringBootApplication`**: Main class that demonstrates dependency injection and bean scope by printing hash codes.

---

## ⚙️ Features

| Feature | Description |
|--------|-------------|
| `@Autowired` | Field Injection for services and beans |
| `@Component`, `@Service` | Registers classes as Spring Beans |
| `@ConditionalOnProperty` | Load beans based on environment (Dev or Prod) |
| `@PostConstruct` | Method executed after bean creation |
| `@PreDestroy` | Method executed before bean destruction |
| `@Bean` + `@Configuration` | Manual bean creation and injection |
| `@Scope("singleton")` or `@Scope("prototype")` | Bean instance control |

---

## 🧪 How It Works

- The environment is configured in `application.properties`:
  ```properties
  deploy.env=production
````

* When the app starts, Spring will inject:

  * **`ProdDb`** if `deploy.env=production`
  * **`DevDb`** if `deploy.env=development`

* `DBService` is injected with the correct implementation at runtime.

* The `Apple` class:

  * Logs a message when created and destroyed.
  * You can test bean scope by uncommenting both `apple1` and `apple2` and checking their hash codes.

---

## 🔧 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-repo-name.git
   cd your-repo-name
   ```

2. Set the environment in `src/main/resources/application.properties`:

   ```properties
   deploy.env=production
   ```

3. Run the application:

   ```bash
   ./mvnw spring-boot:run
   ```

4. Observe the console output for:

   * Injected DB (Dev or Prod)
   * Apple bean lifecycle logs
   * Bean hash code (for testing scope)

---

## 📁 Sample Output

```
Prod Data
I am eating the apple
Creating the Apple before Use
12345678   <- (hashCode of apple1)
Destroying the Apple bean
```

---

## 📜 Tech Stack

* Java 17+
* Spring Boot
* Maven
* Spring Annotations: `@Component`, `@Autowired`, `@Service`, `@Bean`, `@PostConstruct`, `@PreDestroy`, `@ConditionalOnProperty`

---

## 📚 Learning Objectives

✅ Understand the concept of **Loose Coupling** via interfaces and conditional beans
✅ Explore **Spring Bean Lifecycle**
✅ Learn how to configure beans manually and control their **scope and initialization**

---

## 🔗 Connect with Me

**Author**: *Shadab Rehan*
**LinkedIn**: https://www.linkedin.com/in/shadabrehan
