package com.ems.service;

import com.ems.dto.AttandanceDto;

public interface AttandanceService {
AttandanceDto createAttandance(AttandanceDto attandanceDto);
AttandanceDto getAttandanceById(int employee_id);

}
