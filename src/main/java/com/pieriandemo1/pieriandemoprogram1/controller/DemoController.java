package com.pieriandemo1.pieriandemoprogram1.controller;

import com.pieriandemo1.pieriandemoprogram1.impl.DemoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

   // @Autowired
   private DemoImpl demoImpl;

   //constructor based bi
//   public DemoController(DemoImpl demoImpl){
//       this.demoImpl=demoImpl;
//   }

    @Autowired
    public void setDemoImpl(DemoImpl demoImpl) {
        this.demoImpl = demoImpl;
    }

    @GetMapping(value="/check")
    public String check(){
        return demoImpl.getData();
    }
}
