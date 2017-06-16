package entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by java on 16.06.2017.
 */
public class UserService implements Service, InitializingBean, DisposableBean {
    public UserService() {
    }

    public void destroy() throws Exception {
        System.err.println("UserService destroyed!");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("UserService has been initialized!");
    }

    @Profiling
    public void doMagic() {
        System.out.println("UserService does magic");
    }
}
