package com.pieriandemo1.pieriandemoprogram1.impl;

import com.pieriandemo1.pieriandemoprogram1.myinterface.DemoInterface;
import org.springframework.stereotype.Service;

@Service
public class DemoImpl implements DemoInterface {
    @Override
    public String getData() {
        return "Hiiiiiiiiiiii";
    }
}
