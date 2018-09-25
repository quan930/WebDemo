package app.mrquan.factory;

import app.mrquan.service.IServiceBook;
import app.mrquan.service.impl.ServiceBookImpl;

public class ServiceFactory {
    public static IServiceBook getIServiceBookInstance(){
        return new ServiceBookImpl();
    }
}
