package edu.cibertec.I202030280.reyes_espiritu_basty_celia.dto;

import java.util.Date;

public record CarCreateDto( String make,
                            String model,
                            Integer year,
                            String vin,
                            String licensePlate,
                            String ownerName,
                            String ownerContact,
                            Date purchaseDate,
                            Integer mileage,
                            String engineType,
                            String color,
                            String insuranceCompany,
                            String insurancePolicyNumber,
                            Date registrationExpirationDate,
                            Date serviceDueDate) {
}