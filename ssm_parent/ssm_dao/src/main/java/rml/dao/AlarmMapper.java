package rml.dao;

import java.util.List;

import rml.model.Alarm;

public interface AlarmMapper {
	
    int deleteByPrimaryKey(int id);

    Alarm selectByPrimaryKey(int id);

    List<Alarm> getAll();
}