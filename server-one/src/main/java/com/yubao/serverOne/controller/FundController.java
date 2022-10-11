package com.yubao.serverOne.controller;


import com.alibaba.fastjson.JSON;
import com.yubao.serverOne.entity.Fund;
import com.yubao.serverOne.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author YuBao
 * @since 2022-10-10
 */
@RestController
@RequestMapping("/serverOne/fund")
public class FundController {

    @Autowired
    private FundService fundService;

    @GetMapping("/index")
    public String test() {
        return "我是serverOne";
    }

    @GetMapping("/getList")
    public List<Fund> getList() {
        List<Fund> list = fundService.list();
        if (list != null) {
            return list;
        } else {
            return null;
        }
    }

    @GetMapping("/getOne")
    public Fund getOne(@RequestParam Integer id) {
        Fund fund = fundService.getById(id);
        if (fund != null) {
            return fund;
        } else {
            return null;
        }
    }


    @PostMapping("/add")
    public String add(@RequestBody Fund fund) {
        boolean save = fundService.save(fund);
        if (save) {
            return "Successfully added";
        } else {
            return "Failed to add";
        }
    }

    @GetMapping("/delete")
    public String delete(@RequestParam Integer id) {
        boolean b = fundService.removeById(id);

        if (b) {
            System.out.println("Successfully deleted");
            return "Successfully deleted";
        } else {
            System.out.println("Failed to delete");
            return "Failed to delete";
        }

    }


    @PostMapping("/update")
    public String update(@RequestBody Fund fund) {

        boolean b = fundService.updateById(fund);
        if (b) {
            System.out.println("Successfully updated");
            return "Successfully updated";
        } else {
            System.out.println("Failed to update");
            return "Failed to update";
        }
    }

}

