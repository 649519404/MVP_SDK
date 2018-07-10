package zxfd.mvp.app.mvp.model;


import zxfd.mvp.app.mvp.contract.MainContract;
import zxfd.mvp.sdk.base.BaseModel;
import zxfd.mvp.sdk.http.service.ServiceManager;

import javax.inject.Inject;

import zxfd.mvp.app.mvp.contract.TestContract;


public class TestModel extends BaseModel implements TestContract.Model {


    @Inject
    public TestModel(ServiceManager serviceManager) {
        super(serviceManager);
    }


}