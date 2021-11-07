Пошаговый запуск

0. Установка репозитория bitnami (пропустить, если уже добавлен)  
helm repo add bitnami https://charts.bitnami.com/bitnami  
helm repo update

1. Добавить secrets
kubectl apply -f 

2. Настроить PersistentVolume & PersistentVolumeClaim
kubectl apply -f

3. Установить базу данных
helm install hw02db bitnami/mysql -f

