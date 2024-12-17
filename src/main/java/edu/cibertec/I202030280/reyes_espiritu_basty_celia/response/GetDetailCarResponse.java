package edu.cibertec.I202030280.reyes_espiritu_basty_celia.response;

import edu.cibertec.I202030280.reyes_espiritu_basty_celia.dto.CarDetailDto;

public record GetDetailCarResponse(String code,
                                   String error,
                                   CarDetailDto carDetailDto) {

}