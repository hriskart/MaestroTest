package edu.cibertec.DAO.impl;

import edu.cibertec.DAO.IMaestroDAO;
import edu.cibertec.dto.Maestro;

public class MaestroDaoImpl implements IMaestroDAO{

	@Override
	public Maestro obtenerMaestro() {

		Maestro bean = new Maestro();
		bean.setId(1L);
		bean.setNombre("Hagi");
		bean.setApellido("Ayala Huaccho");
		bean.setDireccion("Av. Universitaria 5599");

		return bean;
	}

}
