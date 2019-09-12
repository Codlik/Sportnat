package fr.formation.inti.service;

import java.util.List;

import fr.formation.inti.entities.ActiviteRecord;

public interface ActiviteRecordService {

	public  void createActivite(ActiviteRecord product);

	public  void updateActivite(String id, ActiviteRecord product);

	public  void deleteActivite(String id);

	public  List<ActiviteRecord> getActivite();
}
