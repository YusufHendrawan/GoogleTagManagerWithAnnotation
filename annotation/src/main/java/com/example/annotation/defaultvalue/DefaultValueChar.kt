package com.example.annotation.defaultvalue

@Target(AnnotationTarget.FIELD)
annotation class DefaultValueChar (val value: Char = '\u0000')