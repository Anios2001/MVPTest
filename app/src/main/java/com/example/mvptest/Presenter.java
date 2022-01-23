package com.example.mvptest;

public class Presenter implements Contract.Presenter,Contract.Model.OnFinishedListener{
    private Contract.Model model;
    private Contract.View view;

    public Presenter(Contract.Model model,Contract.View view){
        this.model=model;
        this.view=view;
    }

    @Override
    public void OnFinished(String string) {
          if(view!=null) {
              view.setDescription(string);
              view.hideProgress();
          }
    }

    @Override
    public void OnButtonClicked() {
          if(view!=null){
              view.showProgress();
          }
          model.getNextCourse(this);
    }

    @Override
    public void OnDestroy() {
        view=null;
    }
}
