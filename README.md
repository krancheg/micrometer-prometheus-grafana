### Тестовое Spring Boot приложение для изучения связки micrometer-prometheus-grafana

### 1. Запуск контейнеров prometheus-grafana

```
cd docker
docker-compose -p metric up
```

### 2. Запуск приложения
Запускаем Spring Boot приложение и переходим по адресу http://localhost:3000.
```
Login: admin
Password: admin
```
При входе вас попросят ввести новый пароль, можно ввести тот же самый.

### 3. Настройка grafana
Необходимо выбрать Dashboard. Это можно сделать в пункте меню <b>Manage</b> 

![img.png](img.png)

Выбираем JVM (Micrometer).

### 4. Работа
Можно подергать разные эндпоинты и посмотреть на результат на графиках.
Например, http://localhost:8081/loop