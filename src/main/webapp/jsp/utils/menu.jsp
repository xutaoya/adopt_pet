<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
// 定义不同角色的菜单
var adminMenus = {
    backMenu: [
        { child: [{ appFrontIcon: "cuIcon-discover", buttons: ["新增", "查看", "修改", "删除"], menu: "用户", menuJump: "列表", tableName: "yonghu" }], menu: "用户管理" },
        { child: [{ appFrontIcon: "cuIcon-goodsnew", buttons: ["新增", "查看", "修改", "删除"], menu: "发布者", menuJump: "列表", tableName: "fabuzhe" }], menu: "发布者管理" },
        { child: [{ appFrontIcon: "cuIcon-attentionfavor", buttons: ["新增", "查看", "修改", "删除", "查看评论"], menu: "宠物教学", menuJump: "列表", tableName: "chongwujiaoxue" }], menu: "宠物教学管理" },
        { child: [{ appFrontIcon: "cuIcon-vipcard", buttons: ["新增", "查看", "修改", "删除", "查看评论"], menu: "领养宠物", menuJump: "列表", tableName: "lingyangchongwu" }], menu: "领养宠物管理" },
        { child: [{ appFrontIcon: "cuIcon-present", buttons: ["查看", "删除", "查看评论"], menu: "宠物认领", menuJump: "列表", tableName: "chongwurenling" }], menu: "宠物认领管理" },
        { child: [{ appFrontIcon: "cuIcon-vip", buttons: ["新增", "查看", "修改", "删除"], menu: "类型", menuJump: "列表", tableName: "leixing" }], menu: "类型管理" },
        { child: [{ appFrontIcon: "cuIcon-camera", buttons: ["查看", "删除", "审核"], menu: "领养申请", menuJump: "列表", tableName: "lingyangshenqing" }], menu: "领养申请管理" },
        { child: [{ appFrontIcon: "cuIcon-album", buttons: ["查看", "删除"], menu: "认领信息", menuJump: "列表", tableName: "renlingxinxi" }], menu: "认领信息管理" },
        { child: [{ appFrontIcon: "cuIcon-goodsnew", buttons: ["查看", "删除", "查看评论"], menu: "感谢信", menuJump: "列表", tableName: "ganxiexin" }], menu: "感谢信管理" },
        { child: [{ appFrontIcon: "cuIcon-shop", buttons: ["查看", "回复", "删除"], menu: "留言板管理", tableName: "messages" }], menu: "留言板管理" },
        { child: [
            { appFrontIcon: "cuIcon-camera", buttons: ["查看", "修改"], menu: "轮播图管理", tableName: "config" },
            { appFrontIcon: "cuIcon-news", buttons: ["新增", "查看", "修改", "删除"], menu: "公告信息", tableName: "news" }
        ], menu: "系统管理" }
    ],
    frontMenu: [
        { child: [{ appFrontIcon: "cuIcon-list", buttons: ["查看", "查看评论"], menu: "宠物教学列表", menuJump: "列表", tableName: "chongwujiaoxue" }], menu: "宠物教学模块" },
        { child: [{ appFrontIcon: "cuIcon-brand", buttons: ["查看评论", "查看", "领养"], menu: "领养宠物列表", menuJump: "列表", tableName: "lingyangchongwu" }], menu: "领养宠物模块" },
        { child: [{ appFrontIcon: "cuIcon-discover", buttons: ["认领", "查看评论", "查看"], menu: "宠物认领列表", menuJump: "列表", tableName: "chongwurenling" }], menu: "宠物认领模块" },
        { child: [{ appFrontIcon: "cuIcon-copy", buttons: ["查看", "查看评论"], menu: "感谢信列表", menuJump: "列表", tableName: "ganxiexin" }], menu: "感谢信模块" }
    ],
    hasBackLogin: "是",
    hasBackRegister: "否",
    hasFrontLogin: "否",
    hasFrontRegister: "否",
    roleName: "管理员",
    tableName: "users"
};

var userMenus = {
    backMenu: [
        { child: [{ appFrontIcon: "cuIcon-camera", buttons: ["查看", "修改", "删除"], menu: "领养申请", menuJump: "列表", tableName: "lingyangshenqing" }], menu: "领养申请管理" },
        { child: [{ appFrontIcon: "cuIcon-album", buttons: ["查看", "修改", "删除"], menu: "认领信息", menuJump: "列表", tableName: "renlingxinxi" }], menu: "认领信息管理" },
        { child: [{ appFrontIcon: "cuIcon-goodsnew", buttons: ["新增", "查看", "修改", "删除", "查看评论"], menu: "感谢信", menuJump: "列表", tableName: "ganxiexin" }], menu: "感谢信管理" },
        { child: [{ appFrontIcon: "cuIcon-shop", buttons: ["修改", "查看", "删除"], menu: "留言板管理", tableName: "messages" }], menu: "留言板管理" },
        { child: [{ appFrontIcon: "cuIcon-favor", buttons: ["查看", "删除"], menu: "我的收藏管理", tableName: "storeup" }], menu: "我的收藏管理" }
    ],
    frontMenu: [
        { child: [{ appFrontIcon: "cuIcon-list", buttons: ["查看", "查看评论"], menu: "宠物教学列表", menuJump: "列表", tableName: "chongwujiaoxue" }], menu: "宠物教学模块" },
        { child: [{ appFrontIcon: "cuIcon-brand", buttons: ["查看评论", "查看", "领养"], menu: "领养宠物列表", menuJump: "列表", tableName: "lingyangchongwu" }], menu: "领养宠物模块" },
        { child: [{ appFrontIcon: "cuIcon-discover", buttons: ["认领", "查看评论", "查看"], menu: "宠物认领列表", menuJump: "列表", tableName: "chongwurenling" }], menu: "宠物认领模块" },
        { child: [{ appFrontIcon: "cuIcon-copy", buttons: ["查看", "查看评论"], menu: "感谢信列表", menuJump: "列表", tableName: "ganxiexin" }], menu: "感谢信模块" }
    ],
    hasBackLogin: "是",
    hasBackRegister: "否",
    hasFrontLogin: "是",
    hasFrontRegister: "是",
    roleName: "用户",
    tableName: "yonghu"
};

var publisherMenus = {
    backMenu: [
        { child: [{ appFrontIcon: "cuIcon-present", buttons: ["新增", "查看", "修改", "删除", "查看评论"], menu: "宠物认领", menuJump: "列表", tableName: "chongwurenling" }], menu: "宠物认领管理" },
        { child: [{ appFrontIcon: "cuIcon-album", buttons: ["查看", "审核"], menu: "认领信息", menuJump: "列表", tableName: "renlingxinxi" }], menu: "认领信息管理" },
        { child: [{ appFrontIcon: "cuIcon-news", buttons: ["查看"], menu: "公告信息", tableName: "news" }], menu: "系统管理" }
    ],
    frontMenu: [
        { child: [{ appFrontIcon: "cuIcon-list", buttons: ["查看", "查看评论"], menu: "宠物教学列表", menuJump: "列表", tableName: "chongwujiaoxue" }], menu: "宠物教学模块" },
        { child: [{ appFrontIcon: "cuIcon-brand", buttons: ["查看评论", "查看", "领养"], menu: "领养宠物列表", menuJump: "列表", tableName: "lingyangchongwu" }], menu: "领养宠物模块" },
        { child: [{ appFrontIcon: "cuIcon-discover", buttons: ["认领", "查看评论", "查看"], menu: "宠物认领列表", menuJump: "列表", tableName: "chongwurenling" }], menu: "宠物认领模块" },
        { child: [{ appFrontIcon: "cuIcon-copy", buttons: ["查看", "查看评论"], menu: "感谢信列表", menuJump: "列表", tableName: "ganxiexin" }], menu: "感谢信模块" }
    ],
    hasBackLogin: "是",
    hasBackRegister: "是",
    hasFrontLogin: "否",
    hasFrontRegister: "否",
    roleName: "发布者",
    tableName: "fabuzhe"
};

// 将所有角色的菜单放入一个数组中
var menus = [adminMenus, userMenus, publisherMenus];

var hasMessage = '是';

