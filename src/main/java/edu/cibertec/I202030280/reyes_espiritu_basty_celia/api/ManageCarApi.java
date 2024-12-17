package edu.cibertec.I202030280.reyes_espiritu_basty_celia.api;


import edu.cibertec.I202030280.reyes_espiritu_basty_celia.dto.CarCreateDto;
import edu.cibertec.I202030280.reyes_espiritu_basty_celia.dto.CarDetailDto;
import edu.cibertec.I202030280.reyes_espiritu_basty_celia.dto.CarDto;
import edu.cibertec.I202030280.reyes_espiritu_basty_celia.response.*;
import edu.cibertec.I202030280.reyes_espiritu_basty_celia.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
public class ManageCarApi {

    @Autowired
    ManageService manageService;

    @GetMapping("/all")
    public GetAllCarsResponse getAllCars() {

        try {
            List<CarDto> cars = manageService.getAllCars();
            if (!cars.isEmpty())
                return new GetAllCarsResponse("01", null, cars);
            else
                return new GetAllCarsResponse("02", "Cars not found", null);

        } catch (Exception e) {
            e.printStackTrace();
            return new GetAllCarsResponse("99", "An error occurred, please try again", null);

        }

    }

    @GetMapping("/detail")
        public GetDetailCarResponse getDetailCar(@RequestParam(value = "id", defaultValue = "0") String id) {

        try {
            Optional<CarDetailDto> optional = manageService.getDetailCar(Integer.parseInt(id));
            return optional.map(car ->
                    new GetDetailCarResponse("01", null, car)
            ).orElse(
                    new GetDetailCarResponse("02", "Car not found", null)
            );

        } catch (Exception e) {
            e.printStackTrace();
            return new GetDetailCarResponse("99", "An error occurred, please try again", null);

        }

    }

    @PutMapping("/update")
    public UpdateCarResponse updateCar(@RequestBody CarDto carDto) {

        try {
            if (manageService.updateCar(carDto))
                return new UpdateCarResponse("01", null);
            else
                return new UpdateCarResponse("02", "Update failed");

        } catch (Exception e) {
            e.printStackTrace();
            return new UpdateCarResponse("99", "An error occurred, please try again");

        }

    }

    @DeleteMapping("/delete/{id}")
    public DeleteCarResponse deleteCar(@PathVariable String id) {

        try {
            if (manageService.deleteCar(Integer.parseInt(id)))
                return new DeleteCarResponse("01", null);
            else
                return new DeleteCarResponse("02", "Delete failed");

        } catch (Exception e) {
            e.printStackTrace();
            return new DeleteCarResponse("99", "An error occurred, please try again");

        }

    }

    @PostMapping("/create")
    public CreateCarResponse createCar(@RequestBody CarCreateDto carCreateDto) {

        try {
            if (manageService.createCar(carCreateDto))
                return new CreateCarResponse("01", null);
            else
                return new CreateCarResponse("02", "Create failed");

        } catch (Exception e) {
            e.printStackTrace();
            return new CreateCarResponse("99", "An error occurred, please try again");

        }

    }


}
