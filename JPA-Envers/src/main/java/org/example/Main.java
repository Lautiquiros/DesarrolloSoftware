package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example-unit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("en marcha Alberto");

        try {
            // Persistir una nueva entidad Person
            entityManager.getTransaction().begin();
        /*    Domicilio domicilio = Domicilio.builder().nombreCalle("Av. Pedro Molina").numero(4183).build();
            Cliente cliente = Cliente.builder()
                    .nombre("Joaco")
                    .apellido("Rodriguez").domicilio(domicilio).build();
            domicilio.setCliente(cliente);
            Factura factura1 = Factura.builder().numero(12).fecha("10/08/2024").cliente(cliente).build();
            Categoria perecederos = Categoria.builder().denominacion("perecederos").build();
            Categoria limpieza = Categoria.builder().denominacion("limpieza").build();
            Categoria lacteos = Categoria.builder().denominacion("lacteos").build();
            Articulo articulo1 = Articulo.builder().precio(200).denominacion("Leche Larga vida").cantidad(2).build();
            Articulo articulo2 = Articulo.builder().precio(300).denominacion("Lavandina").cantidad(1).build();
            articulo1.getCategorias().add(perecederos);
            articulo1.getCategorias().add(lacteos);
            lacteos.getArticulos().add(articulo1);
            perecederos.getArticulos().add(articulo1);
            articulo2.getCategorias().add(limpieza);
            limpieza.getArticulos().add(articulo2);

            DetalleFactura det1 = DetalleFactura.builder().build();
            det1.setArticulo(articulo1);
            det1.setCantidad(2);
            det1.setSubtotal(40);
            det1.setFactura(factura1);

            DetalleFactura det2 = DetalleFactura.builder().build();
            det2.setArticulo(articulo2);
            det2.setCantidad(2);
            det2.setSubtotal(80);
            det2.setFactura(factura1);
            factura1.setTotal(120);
            entityManager.persist(factura1);
            entityManager.persist(det1);
            entityManager.persist(det2);*/
            Factura factura2 = entityManager.find(Factura.class, 1L);
            
            factura2.setNumero(815);
            entityManager.remove(factura2);
            entityManager.flush();
            entityManager.getTransaction().commit();


            /*
             Consultar y mostrar la entidad persistida
              Persona retrievedPerson = entityManager.find(Persona.class, person.getId());
             System.out.println("Retrieved Person: " + retrievedPerson.getName());
            */

        } catch (Exception e) {

            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage());
            System.out.println("No se pudo grabar la clase Cliente");
        }

        // Cerrar el EntityManager y el EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
    }
}
