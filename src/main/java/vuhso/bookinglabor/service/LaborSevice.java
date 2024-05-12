package vuhso.bookinglabor.service;

import vuhso.bookinglabor.dto.LaborDto;
import vuhso.bookinglabor.form.LaborCreateForm;

public interface LaborSevice {

    LaborDto createLabor(LaborCreateForm laborDto);
}
