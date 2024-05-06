# Aufgabe 4

- Logging in die bestehende Anwendung einbauen 
    ```
    private static final Logger log = LoggerFactory.getLogger(TodoController.class);
    ```
- Erstellen einer zweiten Anwendung "todo-frontend", die mit dem FeignClient Requests an das backend schickt
- Erstellen einer docker-compose.yaml, die Service-Definitionen für Backend, Frontend und Datenbank enthält.