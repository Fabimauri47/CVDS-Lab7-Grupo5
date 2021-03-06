/*
 * Copyright (C) 2015 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.cvds.samples.services.client;



import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ItemMapper;
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.entities.TipoItem;

/**
 *
 * @author hcadavid
 */
public class MyBatisExample {

    /**
     * Método que construye una fábrica de sesiones de MyBatis a partir del
     * archivo de configuración ubicado en src/main/resources
     *
     * @return instancia de SQLSessionFactory
     */
    public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactory sqlSessionFactory = null;
        if (sqlSessionFactory == null) {
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return sqlSessionFactory;
    }

    /**
     * Programa principal de ejempo de uso de MyBATIS
     * @param args
     * @throws SQLException 
     */
    public static void main(String args[]) throws SQLException,ParseException {

        SqlSessionFactory sessionfact = getSqlSessionFactory();

        SqlSession sqlss = sessionfact.openSession();

        ClienteMapper cm=sqlss.getMapper(ClienteMapper.class);
        System.out.println(cm.consultarClientes());

        System.out.println("Consulta Cliente 1 :");
        System.out.println(cm.consultarCliente(2));
   /**
     //   Insertar Item
        System.out.println("Insertar item:");
        TipoItem nuevoTipo=new TipoItem(12,"pruebaaa");
        ItemMapper im = sqlss.getMapper(ItemMapper.class);
        Item iteem=new Item(nuevoTipo,2122222222,"Bla","prueba bla ", new SimpleDateFormat("yyyy-MM-dd").parse("2020-09-2"), 465641, "formato", "genero");
        im.insertarItem(iteem);


        System.out.println("Insertar item rentado a un cliente:");
        cm.agregarItemRentadoACliente(1,12,new SimpleDateFormat("yyyy-MM-dd").parse("2020-09-2"), new SimpleDateFormat("yyyy-MM-dd").parse("2020-10-29"));
        System.out.println("ItemRentado Insertado:");
        */

        ItemMapper im = sqlss.getMapper(ItemMapper.class);
        System.out.println("Consulta Items :");
        System.out.println(im.consultarItems());

        sqlss.commit();

        
        sqlss.close();

        
    }


}
