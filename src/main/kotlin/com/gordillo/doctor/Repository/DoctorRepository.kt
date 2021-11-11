package com.gordillo.doctor.Repository

import com.gordillo.doctor.Model.Doctor
import org.springframework.data.jpa.repository.JpaRepository

interface DoctorRepository: JpaRepository<Doctor, Long> {
}