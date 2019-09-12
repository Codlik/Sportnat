package fr.formation.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.inti.dao.ActiviteDao;
import fr.formation.inti.entities.ActiviteRecord;
import fr.formation.inti.service.ActiviteRecordService;

@Service
public class ActiviteRecordServiceImpl implements ActiviteRecordService {
	
	@Autowired
	public ActiviteDao daoActivite;

	@Override
	public void createActivite(ActiviteRecord product) {
		
		
	}

	@Override
	public void updateActivite(String id, ActiviteRecord product) {
		
		
	}

	@Override
	public void deleteActivite(String id) {
		
		
	}

	@Override
	public List<ActiviteRecord> getActivite() {
		
		return daoActivite.findAll()  ;
	}
	
	

}
