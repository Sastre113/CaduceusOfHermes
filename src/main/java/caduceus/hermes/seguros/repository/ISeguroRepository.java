/**
 * 
 */
package caduceus.hermes.seguros.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;

import caduceus.hermes.seguros.model.entity.SeguroTb;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 16:26:58 - 16/07/2023
 *
 */
public interface ISeguroRepository extends JpaRepository<SeguroTb, Integer> {

	@EntityGraph(value = "seguro-graph", type = EntityGraphType.LOAD)
	public SeguroTb findByIdSeguro(int idSeguro);
	
}
