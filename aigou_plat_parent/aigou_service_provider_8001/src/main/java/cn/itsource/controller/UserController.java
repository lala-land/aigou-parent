package cn.itsource.controller;

import cn.itsource.common.AjaxReslut;
import cn.itsource.domain.User;
import org.apache.commons.lang.StringUtils;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/plat")
public class UserController {
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public AjaxReslut login(@RequestBody User user){
        if(user!=null&& !StringUtils.isEmpty(user.getUsername())&& !StringUtils.isEmpty(user.getPassword())){
            if("nmsl".equals(user.getUsername())&&"wsnd".equals(user.getPassword())){
                return AjaxReslut.getMe().setMsg("那是真滴牛皮");
            }else {
                return AjaxReslut.getMe().setMsg("弟弟").setSuccess(false);
            }
        }
        return AjaxReslut.getMe().setMsg("弟弟").setSuccess(false);
    }
}
