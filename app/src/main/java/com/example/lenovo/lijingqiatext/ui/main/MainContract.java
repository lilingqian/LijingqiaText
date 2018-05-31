package com.example.lenovo.lijingqiatext.ui.main;


import com.example.lenovo.lijingqiatext.bean.BaseBean;
import com.example.lenovo.lijingqiatext.ui.base.BaseContract;

public interface MainContract {
    interface View extends BaseContract.BaseView{
        void onSuccess(BaseBean baseBean);
    }
    interface Presenter extends BaseContract.BasePresenter<View>{
        void onSuccess(int type, int page);
    }

}
