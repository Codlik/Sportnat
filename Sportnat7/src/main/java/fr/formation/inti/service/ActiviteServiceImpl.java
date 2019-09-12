package fr.formation.inti.service;
//package fr.formation.inti.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import fr.formation.inti.dao.ActiviteDao;
//import fr.formation.inti.entities.ActiviteRecord;
//
//
//
//@Service
//@Transactional
//public class ActivityServiceImpl implements ActivityRecordService {
//
//	@Autowired
//	ActiviteDao ActiviteDao;
//	
//	@Override
//	public ActiviteRecord saveOrUpdate(ActiviteRecord a) {
//		return ActiviteDao.save(c);
//	}
//
//	@Override
//	public void deleteActiviteRecord (Integer id) {
//		ActiviteDao.deleteById(id);
//	}
//
//	@Override
//	public List<ActiviteRecord> findAllActivityRecord() {
//		return ActiviteDao.findAll();
////	}
////
////	@Override
////	public Employee findByID(Integer id) {
////		return ActiviteDao.findById(id).get();
////	}
////
//}