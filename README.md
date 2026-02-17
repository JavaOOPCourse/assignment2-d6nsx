[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/w97-1oWy)
# 📘 Smart Service Management System

## 🇬🇧 English Version

Assignment: Smart Service Management System\
Objective\
Design and implement a Smart Service Management System that models
different types of services offered within a digital platform.\
Your system must support multiple service types, different user roles,
and flexible service operations while ensuring proper data protection,
extensibility, and maintainability.

Problem Description\
A company offers various digital services to its customers such as:\
• Streaming services\
• Cloud storage services\
• Online consultation services\
Each service has its own characteristics and behavior, but they all
share some common properti es. Additionally, some services provide extra
capabilities such as:\
• Subscription -based access\
• Usage -based billing\
• Premium feature upgrades\
The system must allow:\
• Creation of different service types\
• Managing users interacting with these services\
• Performing operations specific to each service\
• Applying special behaviors depending on service capabilities

            Requirements  

Your system must include:\
• A base structure representing a general service\
• Multiple specialized services derived from it\
• Different user roles interacting with services\
• Additional service capabilities that may or may not be supported by
every service\
• Mechanisms for controlling access to sensitive data\
• Different ways of performing similar operations depending on context\
• Shared behaviors where appropriate\
• Flexible extension for future service types without modifying existing
code

    Functional Expectations  

The system should allow:\
• Creating multiple services with different behaviors\
• Creating different types of users\
• Performing service -specific operations\
• Applying additional behaviors when supported\
• Managing service usage\
• Displaying system -wide service summaries

          Submission  

Submit:\
• Source code\
• A short explanation of system behavior

Main Class\
Students must create all required classes/interfaces to make this work.\
public class Main {\
public static void main(String\[\] args) {

        // Create Users  
        User admin = new Admin("Alice", 1);  
        User customer = new Customer("Bob", 2);  

        // Create Services  
        Service streaming = new StreamingService("StreamPlus", 101);  
        Service cloud = new CloudStorageService("CloudBox", 102);  
        Service consultation = new Consultati onService("MediTalk", 103);  

        // Store services  
        Service[] services = {streaming, cloud, consultation};  

        // Activate services  
        for (Service s : services) {  
            s.activateService();  
        } 

        System.out.println(" ------ Performing Core Operations ------"); 

        for (Service s : services) {  
            s.performService();  
        } 

        System.out.println(" ------ Premium Features ------"); 

        if (streaming instanceof PremiumFeature) {  
            ((PremiumFeature) streaming).upgradeToPremium();  
        } 

        if (cloud instanceof PremiumFeature) {  
            ((PremiumFe ature) cloud).upgradeToPremium();  
        } 

        System.out.println(" ------ Billing Behavior ------"); 

        if (cloud instanceof Billable) {  
            ((Billable) cloud).generateBill();  
        } 

        if (consultation instanceof Billable) {  
            ((Billable) consultation).generateBill();  
        } 

        System.out.println(" ------ User Interactions ------"); 

        admin.manageService(streaming);  
        customer.useService(streaming);  

        admin.manageService(cloud);  
        customer.useService(cloud);  

        System.out.println(" ------ Service Summary ------"); 

        for (Service s : services) {  
            System.out.println(s.getServiceName());  
        } 

        System.out.pr intln("------ Deactivating Services ------"); 

        for (Service s : services) {  
            s.deactivateService();  
        } 
    } 

}

Functional Expectations of Each Method

Service Methods\
activateService()\
• Turns the service ON\
• Marks it as available for use\
• May update internal state\
• Should notify that the service is activated

deactivateService()\
• Turns the service OFF\
• Marks it as unavailable\
• Prevents usage when inactive\
• Should notify that the service is deactivated

performService()\
• Execut es the core functionality of the service\
• Behavior must differ depending on service type\
• Represents what the service actually does

getServiceName()\
• Returns the name of the service\
• Used for displaying system -wide summaries

Optional Capability Methods\
These apply only to services that support them.

upgradeToPremium()\
• Enhances service capabilities\
• Changes service state to premium\
• May unlock additional functionality

generateBill()\
• Calculates usage cost\
• Produces billing out put • Applies only to services that charge per
usage

User Methods

manageService(Service s)\
• Performs administrative actions on a service\
• May include enabling/disabling or configuration\
• Intended for higher -level user roles

useService(Service s)\
• Simulates a user interacting with a service\
• Should trigger the service's core functionality\
• Behavior depends on service availability

------------------------------------------------------------------------

## 🇷🇺 Русская версия

📘 Задание: Smart Service Management System

🎯 Цель Разработать и реализовать систему управления сервисами (Smart
Service Management System), которая моделирует различные типы сервисов,
предоставляемых на цифровой платформе. Система должна поддерживать
несколько типов сервисов, различные роли пользователей и гибкие операции
с сервисами, обеспечивая защиту данных, расширяемость и
поддерживаемость.

🧩 Описание задачи Компания предлагает различные цифровые сервисы своим
клиентам, такие как: • Стриминговые сервисы • Облачное хранилище •
Онлайн‑консультации

Каждый сервис имеет свои характеристики и поведение, но все они имеют
общие свойства. Некоторые сервисы также предоставляют дополнительные
возможности: • Доступ по подписке • Оплата на основе использования •
Премиум‑обновления функций

Система должна позволять: • Создание различных типов сервисов •
Управление пользователями, взаимодействующими с сервисами • Выполнение
операций, специфичных для каждого сервиса • Применение специального
поведения в зависимости от возможностей сервиса

📋 Требования

Система должна включать: • Базовую структуру, представляющую общий
сервис • Несколько специализированных сервисов, унаследованных от него •
Различные роли пользователей • Дополнительные возможности сервисов,
которые могут поддерживаться или не поддерживаться • Механизмы контроля
доступа к конфиденциальным данным • Различные способы выполнения похожих
операций в зависимости от контекста • Общие поведения, где это
необходимо • Возможность расширения системы без изменения существующего
кода

⚙️ Функциональные ожидания

Система должна позволять: • Создавать несколько сервисов с различным
поведением • Создавать различных пользователей • Выполнять специфичные
для сервиса операции • Применять дополнительные возможности, если они
поддерживаются • Управлять использованием сервисов • Отображать сводную
информацию по сервисам

📦 Сдача задания

Необходимо предоставить: • Исходный код • Краткое описание работы
системы

🧠 Main класс

Студенты должны создать все необходимые классы и интерфейсы.

🔧 Ожидания от методов

Методы Service:

activateService() • Включает сервис • Делает сервис доступным • Может
обновлять внутреннее состояние • Должен выводить сообщение об активации

deactivateService() • Выключает сервис • Делает сервис недоступным •
Предотвращает использование • Должен выводить сообщение о деактивации

performService() • Выполняет основную функцию сервиса • Поведение должно
отличаться в зависимости от типа сервиса • Представляет реальную работу
сервиса

getServiceName() • Возвращает имя сервиса • Используется для отображения

⭐ Дополнительные возможности

upgradeToPremium() • Улучшает сервис • Переводит сервис в премиум
состояние • Может разблокировать дополнительные функции

generateBill() • Рассчитывает стоимость использования • Генерирует счет
• Применяется только к платным сервисам

👤 Методы пользователя

manageService(Service s) • Выполняет административные действия • Может
включать настройку или управление

useService(Service s) • Имитирует использование сервиса пользователем •
Должен вызывать performService() • Поведение зависит от доступности
сервиса
