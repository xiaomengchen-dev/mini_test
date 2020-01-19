package com.ikminitest.test.service;

import com.ikminitest.test.service.impl.Main;

public interface MainFactory<M extends Main> {
    M create();
}
