package com.example.spring_events.handler;

import com.example.spring_events.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class BillingServiceHandler {

    @Async
    @EventListener
    public void processBilling(PatientDischargeEvent event) throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        System.out.println("Billing Service: Finalizing billing for patient " + event.getPatientId() + " - Thread Name: "+ Thread.currentThread().getName());
    }
}
