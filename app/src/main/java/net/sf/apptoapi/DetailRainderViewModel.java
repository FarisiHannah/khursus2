package net.sf.apptoapi;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import kotlinx.coroutines.CoroutineScope;

public class DetailRainderViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    public DetailRainderViewModel() {
        super();
    }

    public DetailRainderViewModel(@NonNull CoroutineScope viewModelScope) {
        super(viewModelScope);
    }

    public DetailRainderViewModel(@NonNull AutoCloseable... closeables) {
        super(closeables);
    }

    public DetailRainderViewModel(@NonNull CoroutineScope viewModelScope, @NonNull AutoCloseable... closeables) {
        super(viewModelScope, closeables);
    }

    @Override
    public void addCloseable(@NonNull AutoCloseable closeable) {
        super.addCloseable(closeable);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}