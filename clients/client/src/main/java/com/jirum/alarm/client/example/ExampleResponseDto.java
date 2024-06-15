package com.jirum.alarm.client.example;

import com.jirum.alarm.client.example.model.ExampleClientResult;

record ExampleResponseDto(String exampleResponseValue) {
    ExampleClientResult toResult() {
        return new ExampleClientResult(exampleResponseValue);
    }
}
