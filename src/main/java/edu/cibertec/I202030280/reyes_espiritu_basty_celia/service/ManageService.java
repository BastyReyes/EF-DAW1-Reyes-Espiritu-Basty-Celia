package edu.cibertec.I202030280.reyes_espiritu_basty_celia.service;

import edu.cibertec.I202030280.reyes_espiritu_basty_celia.dto.CarCreateDto;
import edu.cibertec.I202030280.reyes_espiritu_basty_celia.dto.CarDetailDto;
import edu.cibertec.I202030280.reyes_espiritu_basty_celia.dto.CarDto;
import java.util.List;
import java.util.Optional;

public interface ManageService {

    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getDetailCar(int id) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCar(int id) throws Exception;

    boolean createCar(CarCreateDto carCreateDto) throws Exception;

}
