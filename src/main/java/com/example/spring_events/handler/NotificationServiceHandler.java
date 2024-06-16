package com.example.spring_events.handler;

import com.example.spring_events.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceHandler {

    @Async
    @EventListener
    public void notifyPatient(PatientDischargeEvent event) {
        System.out.println("Notification Service: Sending discharge notification to patient "+ event.getPatientId() + " - Thread Name: "+ Thread.currentThread().getName());
    }
}
