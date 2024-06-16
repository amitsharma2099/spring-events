package com.example.spring_events.handler;

import com.example.spring_events.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class MedicalRecordServiceHandler {

    @Async
    @EventListener
    public void updatePatientHistory(PatientDischargeEvent event) throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        System.out.println("MedicalRecord Service: updating record for patient "+ event.getPatientId() + " - Thread Name: "+ Thread.currentThread().getName());
    }
}
