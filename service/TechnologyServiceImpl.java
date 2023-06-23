package com.ems.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dto.TechnologyDto;
import com.ems.entitiy.Technology;
import com.ems.repository.TechnologyRepo;

@Service
public class TechnologyServiceImpl implements TechnologyService {
	@Autowired
	private TechnologyRepo technologyRepo;

	public TechnologyDto createTechnology(TechnologyDto technologyDto) {
		Technology technology = mapToEntitiy(technologyDto);
		Technology newTechnology = technologyRepo.save(technology);
		return null;
	}

	private Technology mapToEntitiy(TechnologyDto technologyDto) {
		Technology technology = new Technology();
		technology.setTechnologyName(technologyDto.getTechnologyName());
		return technology;
	}

	
}
