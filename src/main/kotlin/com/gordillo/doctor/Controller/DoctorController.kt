package com.gordillo.doctor.Controller

import com.gordillo.doctor.Model.Doctor
import com.gordillo.doctor.Service.DoctorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/doctor")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class DoctorController {
    @Autowired
    lateinit var doctorService: DoctorService

    @GetMapping
    fun list(): List<Doctor>{
        return doctorService.list()
    }

    @PostMapping
    fun save (@RequestBody doctor: Doctor): Doctor{
        return doctorService.save(doctor)
    }

}