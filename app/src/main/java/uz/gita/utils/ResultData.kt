package uz.gita.utils

sealed class ResultData<T> {
    //    object T Loading <T> : ResultData<T>()
    data class Success<T>(val data: T) : ResultData<T>()
    data class Error<T>(val error: Throwable) : ResultData<T>()
    data class Message<T>(val message: String) : ResultData<T>()


}