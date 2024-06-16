package com.example.spring_events.controller;

import com.example.spring_events.model.Patient;
import com.example.spring_events.service.PatientDischargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discharge/api")
public class DischargeProcessController {

    @Autowired
    PatientDischargeService patientDischargeService;

    @PostMapping("/process")
    public String dischargePatient(@RequestBody Patient patient) {
        return patientDischargeService.dischargePatient(patient.getPatientId(), patient.getPatientName());
    }
}
