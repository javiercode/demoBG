package bg.com.bo.demoBG.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bg.com.bo.demoBG.dao.AchCamarasMapper;
import bg.com.bo.demoBG.domain.AchCamaras;

@Service
public class ACHService {

	@Autowired(required = false)
	private AchCamarasMapper achcamarasMapper;

	public AchCamaras getCamaraACH(){
		return achcamarasMapper.selectByPrimaryKey(1);
	}
}
