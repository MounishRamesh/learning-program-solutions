

## Difference Between JPA, Hibernate, and Spring Data JPA

### JPA (Java Persistence API)
- Specification/standard interface.
- Defines how Java objects interact with databases.

### Hibernate
- JPA implementation.
- Provides additional features like caching, lazy loading, etc.

### Spring Data JPA
- Built on top of JPA and Hibernate.
- Reduces boilerplate code using repository interfaces.

| Feature          | JPA             | Hibernate         | Spring Data JPA           |
|------------------|------------------|-------------------|----------------------------|
| Type             | Specification    | Implementation    | Framework abstraction      |
| Code required    | Medium           | Medium            | Very Low                   |
| Query support    | JPQL             | HQL, JPQL         | Auto-generated + JPQL      |
