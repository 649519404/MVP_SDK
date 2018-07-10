package zxfd.mvp.app.mvp.model;


import javax.inject.Inject;

import zxfd.mvp.app.mvp.contract.MainContract;
import zxfd.mvp.sdk.base.BaseModel;
import zxfd.mvp.sdk.http.service.ServiceManager;


public class MainModel extends BaseModel implements MainContract.Model {


    @Inject
    public MainModel(ServiceManager serviceManager) {
        super(serviceManager);
    }


}