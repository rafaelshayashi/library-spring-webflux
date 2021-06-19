# Library Spring web Flux

A simple project using spring web flux

## Migrations

```bash
flyway -locations=filesystem:./src/main/resources/db/migration \
-user=root -password=root@123 \
-url=jdbc:postgresql://localhost:5432/library migrate
```
