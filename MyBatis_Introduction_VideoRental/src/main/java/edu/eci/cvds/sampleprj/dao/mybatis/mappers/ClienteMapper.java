package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import edu.eci.cvds.samples.entities.Cliente;

/**
 *
 *
 */
public interface ClienteMapper {
    
    public Cliente consultarCliente(int id); 
    
    /**
     * Registrar un nuevo item rentado asociado al cliente identificado
     * con 'idc' y relacionado con el item identificado con 'idi'
     */
    public void agregarItemRentadoACliente(@Param("idcli") long idCliente, @Param("idit") int idItem, @Param("fechai") Date fechainicio,@Param("fechaf") Date fechafin);

    /**
     * Consultar todos los clientes
     * @return 
     */
    public List<Cliente> consultarClientes(

    );
    
}
