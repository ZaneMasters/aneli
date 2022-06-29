package ar.com.educacionit.services.impl;

import ar.com.educacionit.dao.SociosDao;
import ar.com.educacionit.dao.impl.SocioDaoImpl;
import ar.com.educacionit.domain.Socios;
import ar.com.educacionit.services.CategoriaService;
import ar.com.educacionit.services.SociosService;

public class SociosServiceImpl extends AbstractBaseService<Socios> implements SociosService {
	
	
	//constructores
	public SociosServiceImpl() {
		//defino que implementacion usar de la interface SociosDao
		super(new SocioDaoImpl());
	}
	
	//metodos
		
	

}
