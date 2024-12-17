package edu.cibertec.I202030280.reyes_espiritu_basty_celia.dto;

public record CarDto(Integer carId,
                     String make,
                     String model,
                     Integer year,
                     String vin,
                     String licensePlate,
                     String ownerName,
                     String ownerContact,
                     String color,
                     Integer mileage,
                     String insuranceCompany,
                     String insurancePolicyNumber) {

}
