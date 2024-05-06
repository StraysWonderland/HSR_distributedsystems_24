./mvnw clean package &&
docker build -t paulanuschek/todo-backend:0.0.1 . &&
docker push paulanuschek/todo-backend:0.0.1