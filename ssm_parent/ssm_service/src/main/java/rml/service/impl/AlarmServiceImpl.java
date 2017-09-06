package rml.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rml.dao.AlarmMapper;
import rml.model.Alarm;
import rml.service.AlarmService;

@Service("alarmService")
public class AlarmServiceImpl implements AlarmService{

	@Autowired
	private AlarmMapper alarmMapper;
	
	@Override
	public Alarm selectByPrimaryKey(int id) {
		return alarmMapper.selectByPrimaryKey(id);
	}

	@Override
	public int delete(int id) {
		return alarmMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Alarm> getAll() {
		return alarmMapper.getAll();
	}

}
