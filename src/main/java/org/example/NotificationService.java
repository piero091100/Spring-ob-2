package org.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public String imprimirSaludo() {
        return "Saludos desde NotificationService";
    }
}
