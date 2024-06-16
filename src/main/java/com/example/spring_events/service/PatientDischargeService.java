package com.example.spring_events.service;

import com.example.spring_events.event.PatientDischargeEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PatientDischargeService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public String dischargePatient(String patientId, String patientName) {
        log.info("Discharge process initiated for Patient {}", patientName);

        eventPublisher.publishEvent(new PatientDischargeEvent(this, patientId, patientName));

        log.info("Discharge process completed for Patient {}", patientName);

        return String.format("Patient %s with id %s is discharged successfully", patientName, patientId);
    }

}
