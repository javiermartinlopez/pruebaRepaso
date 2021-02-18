package ejb;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import modelo.Categoria;

/**
 * Session Bean implementation class CategoriaImpl
 */
@Stateless
@Local(CategoriaFacade.class)
@LocalBean
public class CategoriaImpl extends AbstractFacadeJPAImpl<Categoria> implements CategoriaFacade {

    /**
     * Default constructor. 
     */
    /*public CategoriaImpl() {
        // TODO Auto-generated constructor stub
    }*/
       
    /**
     * @see AbstractFacadeJPAImpl#AbstractFacadeJPAImpl(Class<T>)
     */
    public CategoriaImpl(Class<Categoria> entityClass) {
        super(entityClass);
        // TODO Auto-generated constructor stub
    }

	/**
     * @see CategoriaFacade#findAll()
     */
    public List<Categoria> findAll() {
        // TODO Auto-generated method stub
			return null;
    }

	@Override
	protected EntityManager getEm() {
		// TODO Auto-generated method stub
		return null;
	}

}
