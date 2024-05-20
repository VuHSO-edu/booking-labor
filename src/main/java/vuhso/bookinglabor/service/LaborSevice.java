package vuhso.bookinglabor.service;

import vuhso.bookinglabor.dto.LaborDto;
import vuhso.bookinglabor.form.LaborCreateForm;

import java.util.List;

public interface LaborSevice {

    LaborDto createLabor(LaborCreateForm laborDto);

    List<LaborDto> findAll();
}
