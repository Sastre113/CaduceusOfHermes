/**
 * 
 */
package caduceus.hermes.seguros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import caduceus.hermes.seguros.model.entity.VehiculoTb;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 19:08:22 - 16/07/2023
 *
 */
public interface IVehiculoRepository extends JpaRepository<VehiculoTb, Integer>{

	/* Sobra completamente esta linea. La importante esta en ISeguroRepository */
	//@EntityGraph(value = "vehiculo-graph", type = EntityGraphType.LOAD)
	public VehiculoTb findByIdVehiculo(int idVehiculo);
}
