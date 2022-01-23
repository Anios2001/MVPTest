package com.example.mvptest;

public interface Contract {
    interface Model{
        interface OnFinishedListener{
            void OnFinished(String string);
        }
        void getNextCourse(Contract.Model.OnFinishedListener onFinishedListener);
    }
    interface View{
        //Function to show progress bar
        void showProgress();
        //Function to hide progress bar
        void hideProgress();
        void setDescription(String string);
    }
    interface  Presenter{
        void OnButtonClicked();
        void OnDestroy();
    }
}
