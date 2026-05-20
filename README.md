# API de Pedidios

### Sobre o projeto 
API REST desenvolvida na linguagem Java + Spring Boot para gerenciamento de pedidos.
Usei como base um exercício de enumerações do curso do Nelio Alves.

O projeto utiliza:

- Java 
- Spring Boot  
- Maven
### Hierarquia de Pastas
```
order-api/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── projeto/
│   │   │           └── order_api/
│   │   │               │
│   │   │               ├── controller/
│   │   │               │   └── OrderController.java
│   │   │               │
│   │   │               ├── entities/
│   │   │               │   ├── Client.java
│   │   │               │   ├── Order.java
│   │   │               │   ├── OrderItem.java
│   │   │               │   ├── OrderStatus.java
│   │   │               │   └── Product.java
│   │   │               │
│   │   │               ├── service/
│   │   │               │   └── OrderService.java
│   │   │               │
│   │   │               └── OrderApiApplication.java
│   │   │
│   │   |
└─────────── mvnw
├──────────── mvnw.cmd
└────────────── pom.xml
├──────────────── LICENSE
└────────────────── README.md
```
### Diagrama UML

### Como Executar o Projeto
#### 1. Pré-requisitos
Antes de iniciar, você precisa ter instalado:

*Java JDK* 

Verifique se o Java está instalado:

```
  java -version
```
*Maven* 

Verifique se o Maven está instalado:

```
  mvn -version
```

#### 2. Clonar o Projeto
```
  git clone
```
Entrar na Pasta:
```
cd nome-do-projeto

```
#### 3. Executar a Aplicação
No Windows: 
```
  mvn spring-boot:run
```

### Crie seu primeiro Endpoint
```
curl -X POST http://localhost:8080/orders -H "Content-Type: application/json" -d "{\"id\":1,\"status\":\"PROCESSING\"}"
```

```
http://localhost:8080/orders/1
```
