package edu.cibertec.I202030280.reyes_espiritu_basty_celia.response;

import edu.cibertec.I202030280.reyes_espiritu_basty_celia.dto.CarDto;
import java.util.List;

public record GetAllCarsResponse(String code,
                                  String error,
                                  List<CarDto> cars) {

}