

# 📘 Difference Between JPA, Hibernate, and Spring Data JPA

| Feature              | JPA                             | Hibernate                          | Spring Data JPA                                   |
|----------------------|----------------------------------|-------------------------------------|---------------------------------------------------|
| **Type**             | Specification (API)             | Implementation of JPA               | Abstraction over JPA and Hibernate                |
| **Provided By**      | Java EE                         | Red Hat                             | Spring Framework                                  |
| **Code Amount**      | Medium                          | Medium                              | Minimal (only interfaces needed)                  |
| **Boilerplate**      | Yes                             | Yes                                 | No (Auto query generation)                        |
| **Query Language**   | JPQL                            | JPQL, HQL                           | JPQL + Method Names + @Query                      |
| **Ease of Use**      | Requires setup                  | Easier than JPA                     | Very easy (uses Spring conventions)               |
| **Main Advantage**   | Standard API                    | Full-featured ORM                   | Less code, easy data access, Spring integration   |
