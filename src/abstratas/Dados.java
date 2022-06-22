
package abstratas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Dados {
    private static EntityManager manager = null;
    //
    public static EntityManager getManager(){
        if(manager==null){
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("revisaoJPAPU");//entre parenteses é o nome do Persistence Unit name
            manager = factory.createEntityManager();
        }
        return manager;
    }
}