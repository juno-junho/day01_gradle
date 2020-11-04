package com.koreait.controller;

import com.koreait.model.MultiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") //주소랑 MAPPING 시키겠다 localhost:9090/api
public class GetController {
    //localhost:9090/api/getMethod
    @RequestMapping(method= RequestMethod.GET, path = "/getMethod") //api라 치고 get방식이여야 한다.
    public String getRequest(){
        return "getMethod 호출";
    }

    //localhost:9090/api/getParameter?id=apple&pass=1234
    @GetMapping("/getParameter") //REQUESTMAPPING 하위로 있는것. GET 방식만 받을 수 있다.
    public String getPara( String id, @RequestParam String pass){
        System.out.println("id : " + id);
        System.out.println("pass : " + pass);
        return "getPara() 호출";
    }
    /*
        id
        name
        email
        age
        이 4개를 parameter로 전달할 것이다.
     */
    // localhost:9090/api/getMultiParameter?id=apple&name=김사과$email=apple@apple.com&age=20

    //@GetMapping("/getMultiParameter")
//    public String getMultiParam(
//            @RequestParam String id,
//            @RequestParam String name,
//            @RequestParam String email,
//            @RequestParam int age
//    ){
//        System.out.println("id : " + id);
//        System.out.println("name : " + name);
//        System.out.println("email : " + email);
//        System.out.println("age : " + age);
//        return "OK";
//    }
    @GetMapping("/getMultiParameter")
    public MultiParam getMultiPara(MultiParam multiParam){
        System.out.println("id : " + multiParam.getId());
        System.out.println("name : " + multiParam.getName());
        System.out.println("email : " + multiParam.getEmail());
        System.out.println("age : " + multiParam.getAge());
        return multiParam;
    }
}
