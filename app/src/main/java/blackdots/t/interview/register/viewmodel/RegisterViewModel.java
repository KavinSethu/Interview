package blackdots.t.interview.register.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import blackdots.t.interview.login.model.User;
import blackdots.t.interview.register.model.Register;


public class RegisterViewModel extends ViewModel {


    public MutableLiveData<String> email = new MutableLiveData<>();
    public MutableLiveData<String> userName = new MutableLiveData<>();

    private MutableLiveData<Register> registerMutableLiveData;

    public RegisterViewModel() {

    }

    public LiveData<Register> getRegisterResponse() {
        if (registerMutableLiveData == null) {
            registerMutableLiveData = new MutableLiveData<>();
        }
        return registerMutableLiveData;
    }


    public void onRegisterClicked() {


    }
}