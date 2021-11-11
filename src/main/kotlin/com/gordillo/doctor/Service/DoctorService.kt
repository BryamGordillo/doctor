package com.gordillo.doctor.Service

import com.gordillo.doctor.Model.Doctor
import com.gordillo.doctor.Repository.DoctorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody

@Service
class DoctorService {
    @Autowired
    lateinit var doctorRepository: DoctorRepository

    fun list(): List<Doctor> {
        return doctorRepository.findAll()
    }

    fun save(@RequestBody doctor: Doctor): Doctor{
        return doctorRepository.save(doctor)
    }
}