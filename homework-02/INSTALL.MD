Пошаговый запуск

0. Установка репозитория bitnami (пропустить, если уже добавлен)  
helm repo add bitnami https://charts.bitnami.com/bitnami  
helm repo update

1. Добавить secrets
kubectl apply -f ./k8s/00-secret.yaml

2. Настроить PersistentVolume & PersistentVolumeClaim
kubectl apply -f ./k8s/01-mysql-pv.yaml

3. Установить базу данных
helm install hw02db bitnami/mysql -f ./helm/02-helm-values.yaml

4. Запустить миграцию данных
kubectl apply -f ./k8s/03-initdb-job.yaml

5. Создать ConfigMap для приложения
kubectl apply -f ./k8s/04-config-map.yaml

6. Развернуть приложение
kubectl apply -f ./k8s/05-deployment.yaml

7. Добавить сервис
kubectl apply -f ./k8s/06-service.yaml

8. Добавить Ingress
kubectl apply -f ./k8s/07-ingress.yaml

Коллекция с методами для Postman в папке ./postman/msa-homework #2.postman_collection.json