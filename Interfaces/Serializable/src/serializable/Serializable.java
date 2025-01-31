package serializable;
import javax.management.InstanceAlreadyExistsException;
import javax.naming.NameNotFoundException;

public interface Serializable {
    
    public void saveNewEmpleado() throws InstanceAlreadyExistsException;
    public void showEmpleado() throws NameNotFoundException;
    public void showAllEmpleados();
    public void deleteEmpleado();
}
