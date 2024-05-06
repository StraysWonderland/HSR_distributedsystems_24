./mvnw clean package &&
docker build -t paulanuschek/todo-frontend:0.0.1 . &&
docker push paulanuschek/todo-frontend:0.0.1