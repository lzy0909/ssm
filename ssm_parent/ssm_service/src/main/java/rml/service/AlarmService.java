package rml.service;

import java.util.List;

import rml.model.Alarm;

public interface AlarmService {
	
	List<Alarm> getAll();
	
	Alarm selectByPrimaryKey(int id);
	
    int delete(int id);
}
