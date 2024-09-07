package aps6.biometria2;

import autenticacao.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Admin
 */

public class Biometria2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BiometriaPersistence");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = new Usuario(Long.MIN_VALUE, "aa", "aa", "123", "fawfa");
    }
}
