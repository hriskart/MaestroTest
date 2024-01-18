package edu.cibertec.service.impl;

import edu.cibertec.DAO.IMaestroDAO;
import edu.cibertec.DAO.impl.MaestroDaoImpl;
import edu.cibertec.dto.Maestro;
import edu.cibertec.service.IMaestroService;

public class MaestroServiceImpl implements IMaestroService {

	private IMaestroDAO dao = new MaestroDaoImpl();

	@Override
	public String obtenerNombreCompleto() {

		Maestro bean = dao.obtenerMaestro();
		StringBuilder str = new StringBuilder();
		str.append(bean.getNombre());
		str.append(" ");
		str.append(bean.getApellido());

		return str.toString();
	}

}
