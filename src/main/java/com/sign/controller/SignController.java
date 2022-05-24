package com.sign.controller;


import com.sign.common.BusinessException;
import com.sign.common.ResultEnum;
import com.sign.entity.User;
import com.sign.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sign")
public class SignController {

    @Autowired
    private UserRepository userRepository;

//    @GetMapping("/index")
//    public String  test(){
//        return "/index";
//    }


    @ResponseBody
    @RequestMapping("/isOnly/{idNumber}")
    public boolean isOnly(@PathVariable String idNumber) {
        boolean flag = false;
        User user = userRepository.findFirstByIdNumber(idNumber.trim());
        if (user != null) {
            flag = true;
        }
        return flag;
    }

    @ResponseBody
    @PostMapping("/save")
    public void save(@RequestBody User user) throws BusinessException {
        validate(user);
        userRepository.save(user);
    }

    private void validate(User user) throws BusinessException {

        if (StringUtils.isEmpty(user.getName()) ||
                user.getGender() == null || user.getGender() < 0 || user.getGender() > 1 ||
                StringUtils.isEmpty(user.getBirthDate()) ||
                StringUtils.isEmpty(user.getGraduateSchool()) ||
                StringUtils.isEmpty(user.getIdNumber()) ||
                StringUtils.isEmpty(user.getIdNumber1()) ||
                StringUtils.isEmpty(user.getHk()) ||
                StringUtils.isEmpty(user.getPhoneNumber1()) ||
                StringUtils.isEmpty(user.getPhoneNumber2()) ||
                StringUtils.isEmpty(user.getLivingAddress()) ||
                StringUtils.isEmpty(user.getDetailAddress()) ||
                StringUtils.isEmpty(user.getSkill())) {

            throw new BusinessException(ResultEnum.NULL_PARAM_ERROR);
        }

        if (!user.getIdNumber().endsWith(user.getIdNumber1())) {

            throw new BusinessException(ResultEnum.USER_ID_NOT_REPEAT_ERROR);
        }


        User user1 = userRepository.findFirstByIdNumber(user.getIdNumber().trim());

        if (user1 != null) {
            throw new BusinessException(ResultEnum.USER_ID_ERROR);
        }


    }


}
