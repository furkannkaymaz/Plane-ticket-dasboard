package com.commerce.utils

sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null,
    val networkError: Boolean? = null
) {
    class Success<T>(data: T): Resource<T>(data)
    class Error<T>(message: String, data: T? = null,networkError: Boolean): Resource<T>(data,message,networkError)

    // for using error or loading
}